import java.net.*;				
import java.io.*;				
import java.util.*;				
import java.text.*;

public class hzChatServer {				
	public static void main(String[] args) {			
		try{
			ServerSocket server = new ServerSocket(10001);	// ���ο� ������ ����
			System.out.println("������ ��ٸ��ϴ�.");	
			HashMap <String, PrintWriter> hm = new HashMap <String, PrintWriter>();	// ���̵� ����ũ�ؾ��Ѵ�. ����ũ�� ���̵����� �����͸� �ҷ����� ���� �ڷᱸ��. �ؽ��� �ʱ�ȭ.
			while(true){ // ��� ������� ���ѷ���
				Socket sock = server.accept(); // ���ο�� ������ ������ �ֵ��� �غ�
				ChatThread chatthread = new ChatThread(sock, hm); // �����尡 ������ �߰�
				chatthread.start(); // ������ ����
			} // while	
		}catch(Exception e){	
			System.out.println(e);
		}	
	} // main		
}			
			
class ChatThread extends Thread{
	SimpleDateFormat f1 = new SimpleDateFormat("H:mm:ss", Locale.KOREA);			
	private Socket sock;		
	private String id;		
	private BufferedReader br;		
	private HashMap <String, PrintWriter> hm;		
	private boolean initFlag = false;
	static ArrayList <String> arr = new ArrayList <String>();		
	public ChatThread(Socket sock, HashMap <String, PrintWriter> hm){
		this.sock = sock;	
		this.hm = hm;
		try{	
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream())); // ��������
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));	// ���ٷ� �޾Ƶ��̱�
			id = br.readLine();	// br�� �о ���̵� �־��ֱ�
			broadcast(id + "���� �����Ͽ����ϴ�.");	
			System.out.println("������ ������� ���̵�� " + id + "�Դϴ�.");	
			synchronized(hm){	// ���� ��ü(������)���� ���ÿ� �����Ϸ��� �Ҷ� ���� ���� ���ִ� �޼ҵ�.
				hm.put(this.id, pw); // ���̵�� printwriter�� �ؽ��ʿ� �߰�
			}	// synchronized ������ ���� ��ü(������)���� ������ ������ �� ���α׷� ������ ����
			initFlag = true;	
		}catch(Exception ex){		
			System.out.println(ex);	
		}		// �ؽ��ʿ��� ���̵� ã�Ƽ� printwriter�� �������� �ӼӸ� ����
	} // ������
	public void run(){			
		try{		
			String line = null;
			while((line = br.readLine()) != null){	// line�� br�� �Է��� ä��. null �� ������ while����
				int flag = 1;
				if(line.equals("/quit")) // '/quit' �̸� ����
					break;
				if(line.equals("/list"))
					showlist();
				else if(line.indexOf("/to ") == 0){	
					sendmsg(line); // ���� �պκ��� '/to' �� �ӼӸ�
				}
				else if(line.indexOf("/ban") == 0){
					add_ban(line);
				}
				else if(line.indexOf("/banlist") == 0){
					banlist();
				}
				else{
					String date = f1.format(new Date());
					for(int I=0; I<arr.size(); i++){
						if(line.contains(arr.get(i))){
							line = line.replace(arr.get(i),"love"); 
						}
					}
					broadcast("[" + date + "]" +id + " :"+ line);
				}	
			}		
		}catch(Exception ex){			
			System.out.println(ex);		
		}finally{	// ������ ���� ���簣�� ����		
			synchronized(hm){		
				hm.remove(id);	// �ؽ��ʿ��� ���̵� ����
			}		
			broadcast(id + " ���� ���� �����Ͽ����ϴ�.");	// ���� �����ϸ� ������ֱ�
			System.out.println(id + "���� ���� �����Ͽ����ϴ�.");
			try{		
				if(sock != null)	
					sock.close(); // ������ ������̸� �ݱ�
			}catch(Exception ex){}		
		}			
	} // run				
	public void sendmsg(String msg){				
		int start = msg.indexOf(" ") +1; // ���̵��� ���ۺκ��� '/to' ��ĭ ����		
		int end = msg.indexOf(" ", start);	// ���̵��� ���κ��� �� ���� ��ĭ������
		if(end != -1){	// ���κ��� �ε��� ��ȣ�� -1�� �ƴϸ�(�޼����� �����ϸ�)
			String to = msg.substring(start, end);	// id�κ� ã��
			String msg2 = msg.substring(end+1);	// �ӼӸ��� �޼����� ���̵� �޺κ�
			Object obj = hm.get(to); // �ؽ����� id�� ��������, obj�� �ش� ���̵��� Ű���� ��.	
			if(obj != null){ // obj�� ��ĭ�� �ƴϸ�(���̵� �����ϸ�)
				PrintWriter pw = (PrintWriter)obj;	// pw�� �ӼӸ� ���� ��� obj
				pw.println(id + " ���� ������ �ӼӸ��� �����̽��ϴ�. :" + msg2);	// �ش� pw�� �ӼӸ� ����Ʈ
				pw.flush();	
			} // if	
		}		
	} // sendmsg			
	public void broadcast(String msg){			
		synchronized(hm){		
			Collection <PrintWriter> collection = hm.values(); // ���� ������ ��� pw�� collection ���·� ����.
			Iterator <PrintWriter> iter = collection.iterator();	// collection�� �ִ� �ڷḦ iter�� �������. ���� �����ϴ� ��� pw�� ����.
			while(iter.hasNext()){	// iter�� �������� ������ �������� 
				PrintWriter pw = (PrintWriter)iter.next(); // iter�� �ִ� ���� printwriter���·� ������ȯ
				pw.println(msg); // �ش� pw�� �޼��� ������
				pw.flush(); // �÷��� !!
			}	
		}		
	} // broadcast

	public void showlist(){
		int count = 1;
		Object obj = hm.get(id);
		PrintWriter pw = (PrintWriter)obj;
		pw.println("���� ������ ����Ʈ");
		synchronized(hm){
			Iterator <String> iter = hm.keySet().iterator();
			while(iter.hasNext()){
				String id = iter.next();
				pw.println(count + ". " + id);
				count ++;
				pw.flush();
			}
		}
	} // showlist

	public void add_ban(String msg){	
		int end = msg.indexOf(" ");
		if(end != -1){
			String ban = msg.substring(end+1);
			arr.add(ban);
		}
	} // add_ban

	public void banlist(){
		Object obj = hm.get(id);
		PrintWriter pw = (PrintWriter)obj;
		pw.println("������ ����Ʈ");
		for(int I=0; I<arr.size(); i++){
			pw.println(arr.get(i));
			pw.flush();
		}
	} // banlist
}