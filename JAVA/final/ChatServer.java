import java.net.*;																					// 2016003490 ��ǻ�Ͱ��а� �����			
import java.io.*;				
import java.util.*;		
import java.text.*;
				
public class ChatServer {				
				
	public static void main(String[] args) {			
		try{		
			ServerSocket server = new ServerSocket(10001);	
			System.out.println("������ ��ٸ��ϴ�.");	
			HashMap hm = new HashMap();	
			while(true){	
				Socket sock = server.accept();
				ChatThread chatthread = new ChatThread(sock, hm);
				chatthread.start();
			} // while	
		}catch(Exception e){	
			System.out.println(e);
		}	
	} // main		
}			
			
class ChatThread extends Thread{				// 2016003490 ��ǻ�Ͱ��а� �����
	SimpleDateFormat f1 = new SimpleDateFormat("H�� mm�� ss��", Locale.KOREA); // �ð� �߰��Ѻκ�. 3���� �����ֽ��ϴ�.
	private Socket sock;		
	private String id;		
	private BufferedReader br;		
	private HashMap hm;		
	private String ban[] = {"����","������","����","��û��","�ٺ�","����"}; // 6�������Դϴ�. String�迭�� �����Ͽ����ϴ�.
	private boolean initFlag = false;
	public ChatThread(Socket sock, HashMap hm){		
		this.sock = sock;	
		this.hm = hm;	
		try{	
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));	
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));	
			id = br.readLine();	
			broadcast("���� �����Ͽ����ϴ�.");	
			System.out.println("������ ������� ���̵�� " + id + "�Դϴ�.");	
			synchronized(hm){	
				hm.put(this.id, pw);
			}	
			initFlag = true;	
		}catch(Exception ex){		
			System.out.println(ex);	
		}		
	} // ������			
	public void run(){			
		try{		
			String line = null;
			int flag = 0;
			while((line = br.readLine()) != null){
				if(line.equals("/quit"))	
					break;
				else if(line.indexOf("/to ") == 0){	
					sendmsg(line);
				}
				else if(line.indexOf("/userlist") == 0){
					senduserlist(); // 4�������� �����ֽ��ϴ�.
				}
				else{
					String date = f1.format(new Date()); 
					String a = "";
					PrintWriter tmp = (PrintWriter)hm.get(id);
					for(int i=0;i<ban.length;i++){
						if(line.contains(ban[i])){
							tmp.println("������ ���ʽÿ�! �����ܾ��� "+ban[i]+"��(��) ���Ǽ� ���� �Ұ��Դϴ�."); 
							tmp.flush(); //6�������Դϴ� tmp�� ����� ���� ä���ϰ��ִ� printwriter�� ���� ä�ÿ� �� �迭�� �ִ� �����ܾ ���Ǿ����� �˻��ϰ�, ���Ǿ��ٸ� ���� �Ұ��ϴٰ��ϴ� �κ��Դϴ�. 
							flag = 1; // ���� �߰ߵǾ��ٸ� flag =1�μ����� ä���� ���� ���ϰ��ϰ�, ������ ���� �Ŀ� flag�� Ȯ���Ͽ� ��������� ä���� �����ϰų�, �������ϰų��մϴ�.
							break;
						}
					}
					if(flag == 0){
						broadcast(line);
					} else{
						flag = 0;
					}
				}
			}		
		}catch(Exception ex){			
			System.out.println(ex);		
		}finally{			
			synchronized(hm){ 		
				hm.remove(id);	
			}		
			broadcast(id + " ���� ���� �����Ͽ����ϴ�.");		
			try{		
				if(sock != null)	
					sock.close();
			}catch(Exception ex){}		
		}			
	} // run
	// 2016003490 ��ǻ�Ͱ��а� �����
	public void senduserlist(){
		int count = 0;
		Object obj = hm.get(id);
		PrintWriter pw = (PrintWriter)obj;
		pw.println("���� ������ ����Ʈ");
		synchronized(hm){
			Iterator <String> iter = hm.keySet().iterator();
			while(iter.hasNext()){
				String id = iter.next();
				pw.println((count+1) + ". " + id);
				count ++;
				pw.flush();
			}
			pw.println("���� "+count+"�� ���� ���Դϴ�.");
			pw.flush();
		}
	} // 4�������Դϴ�. senduserlist()�� �����Ͽ����ϴ�. keyset�� ��Ƴ������� iterator�� �޼ҵ� hasNext�� ����ϱ����� ��ü id�� �ϳ��� �˻��ϴ� �κ��Դϴ�.
	
	public void sendmsg(String msg){				
		int start = msg.indexOf(" ") +1;			
		int end = msg.indexOf(" ", start);			
		if(end != -1){			
			String to = msg.substring(start, end);		
			String msg2 = msg.substring(end+1);		
			Object obj = hm.get(to);		
			if(obj != null){		
				PrintWriter pw = (PrintWriter)obj;	
				pw.println(id + " ���� ������ �ӼӸ��� �����̽��ϴ�. : " + msg2);	
				pw.flush();	
			} // if	
		}		
	} // sendmsg	
	/*
	 * 2�� �����Դϴ�. sendmsg���� hashmap�� ������ hm.get(to)�� �����ν� hashmap���� to�� id(key)���� ���� value�� ( hashmap�� �����Ҷ� id,printWriter�� �޾������� value���� printWriter�� �ȴ�.)�� printWriter��
	 * �ҷ��� ���� String msg�� ���� printWriter�� obj�� ����ǰ�, ���� obj != null �̶��, pw���� ����ȴ�. 
	 * �̶� hashmap�� ������ hm.get(to);�� �̿��� hashmap�� key���� to�ΰ��� value���� ã�� obj�� �����Ѱ��Դϴ�.
//	 */

	public void broadcast(String msg){
		/*
		 * 2������ �Դϴ�. hashmap�� �����ϱ����ؼ�(����ȭ) synchronized(hm)�� ����Ͽ���, collection�� hashmap�� value��(PrintWriter)������ ��� ��� ��
		 * collection�� �����Ѵ�. �̶� collection�� �����͵��� Itertor�� ����� ������ ���� �� �ִ�. hashmap�� ������ hm.values();�� �̿��� hashmap�� value���� ��� ���� �κ��̴�.
		 * Iterator�� ������ �ִ� �޼���(hasNext)�� ����� ��� pw�� msg�� ����ϰ� �Ѵ�.
		 */
		synchronized(hm){		
			PrintWriter tmp = (PrintWriter)hm.get(id);
			String date = f1.format(new Date());
			Collection collection = hm.values();	
			Iterator iter = collection.iterator();	
			while(iter.hasNext()){	
				PrintWriter pw = (PrintWriter)iter.next();
				if(pw==tmp){
					;
				}
				else{
					pw.println("[" + date + "] " +id + " "+ msg); // 3�������Դϴ�. ����ð��� �߰��Ͽ����ϴ�.
					pw.flush();
				}
				
			}	/* 5�� ���� �Դϴ�.���� �߰��Ѻκ��� ���� ���ϰ��ִ� hashmap�� id�� printWriter��(value��)�� tmp�� ����, iter�� �˻��ϴ� pw�߿�
			 	* ���� ���ϰ��ִ� tmp�� pw�� ���� ������ �ƹ��͵� �������� �ʰ�, ���� �ٸ��� println�� ����� ����մϴ�.
			 	*/
		}		
	} // broadcast			
}				
/* 1�������Դϴ�.
 * InputThread�� ������� Ű����κ��� �Է¹ޱ� ���� BufferedReader�� ������ ��, �����κ��� ���޵� ���ڿ��� ����Ϳ� ����ϴ� InputThread ��ü�� �����Ѵ�.
 *  ������ �Ŀ� Ű����κ��� �� �پ� �Է¹޾� ������ ����(/quit�� �Է¹ޱ� ������)�Ѵ�. 
 *  Ű����� ����� ���� �Է��ϰ� �ִ� �߰����� �������� �ٸ� Ŭ���̾�Ʈ���� ������ ���ڿ��� ������ ���Ͽ� ������ �޾ƾ� �ϱ� ������ �Է½����带 ���� �̿��ؾ� �ϹǷ� �̰��� inputthread�� ���� �����̴�. 
 */


/*
 * 7�������Դϴ�. ���ο� hashmap�� �����, sendmsg�ڵ�� ����ϰ� �޽����� �پ�⸶�� �����ϴ�. ä���� ĥ�� ���� ó�� �ܾ +���� �˻��մϴ�. ���� +��� �ι�° �ܾ�� �� �ι�° �ܾ �������� �˻��ϰ�,
 * �ι�° �ܾ hashmap�� Ű ���� �ֽ��ϴ�. �׷��� ������� "+ �� �ȳ��ϼ���"�� ä���ߴٸ�, key�� ��, value�� �ȳ��ϼ���� �����س���, hashmap.put�� �̿��Ͽ� hashmap�� ����մϴ�. ���� ������� hashmap�� ä�������ϴ�.
 * sendmsg�ڵ�� ����ϰ� �� ó�� �ܾ #���� �˻��ϰ�, key���� �ι�°�ܾ �ִٸ� value�� broadcast�� �̿��� ����ϴ� ����� �̿��� ��뱸�� �����մϴ�.
 */

/*
 * 8�������Դϴ�. ���ϼ��������� �ϴ� outputstream���� ������ Ŭ���̾�Ʈ���� ������ Ŭ������ �ϳ� �����ϰ�,  �� Ŭ�������� ���ϰ�θ� line�� bufferedReader�� �о� string���� �����صд� �� ��θ� filepath�� ����. ä�ð� �ٸ� ���� ���ϼ��������� �����, filepath�� �μ��λ���� fileinputstream�� ��ü�� �����. �� ��ü�� a�� ����. bufferedinputstream�� �� ���� a�� �μ��λ�� �� ��ü�� �� �����.
 * ���� outputstream�� socket.getoutputstream()���� �����ϰ�, bufferedoutputstream�� �� outputstream��ü�� ����� ���ο� ��ü�� �����.
 * �� ������ ����� BufferedInputStream�� read�ϰ�, ���� -1�� �ƴ϶�� BufferedOutputStream�� �о�°��� write �Ѵ�.
 * ����Ŭ���̾�Ʈ ������ �ϴ� ���ϸ��ù��� �ϴ� ���ϼ����� �������Ͽ� �����ϰ�, socket.getInputStream()�� ����ϰ�, BufferedInputStream(getInputStream())���� �޴´�.
 * FileOutputStream�� ��ü�� �����, BufferedOutputStream�� ��ü�� ���� BufferedInputStream���� �а�, -1�̾ƴ϶�� BufferedOutputStream(fileoutputstream)�� write�Ͽ� ���ϴٿ�ε带 �޴´�. 
 */ 
