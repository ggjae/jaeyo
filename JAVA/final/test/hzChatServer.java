import java.net.*;				
import java.io.*;				
import java.util.*;				
import java.text.*;

public class hzChatServer {				
	public static void main(String[] args) {			
		try{
			ServerSocket server = new ServerSocket(10001);	// 새로운 서버를 만듬
			System.out.println("접속을 기다립니다.");	
			HashMap <String, PrintWriter> hm = new HashMap <String, PrintWriter>();	// 아이디가 유니크해야한다. 유니크한 아이디값으로 데이터를 불러오기 위한 자료구조. 해쉬맵 초기화.
			while(true){ // 계속 듣기위한 무한루프
				Socket sock = server.accept(); // 새로운게 들어오면 받을수 있도록 준비
				ChatThread chatthread = new ChatThread(sock, hm); // 쓰레드가 있으면 추가
				chatthread.start(); // 쓰레드 시작
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
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream())); // 내보내기
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));	// 한줄로 받아들이기
			id = br.readLine();	// br을 읽어서 아이디에 넣어주기
			broadcast(id + "님이 접속하였습니다.");	
			System.out.println("접속한 사용자의 아이디는 " + id + "입니다.");	
			synchronized(hm){	// 여러 객체(쓰레드)들이 동시에 접근하려고 할때 줄을 서게 해주는 메소드.
				hm.put(this.id, pw); // 아이디와 printwriter를 해쉬맵에 추가
			}	// synchronized 없으면 여러 객체(쓰레드)들이 빠르게 몰렸을 때 프로그램 터질수 있음
			initFlag = true;	
		}catch(Exception ex){		
			System.out.println(ex);	
		}		// 해쉬맵에서 아이디를 찾아서 printwriter를 가져오면 귓속말 가능
	} // 생성자
	public void run(){			
		try{		
			String line = null;
			while((line = br.readLine()) != null){	// line은 br이 입력한 채팅. null 일 때까지 while루프
				int flag = 1;
				if(line.equals("/quit")) // '/quit' 이면 종료
					break;
				if(line.equals("/list"))
					showlist();
				else if(line.indexOf("/to ") == 0){	
					sendmsg(line); // 제일 앞부분이 '/to' 면 귓속말
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
		}finally{	// 에러가 났든 뭐든간에 실행		
			synchronized(hm){		
				hm.remove(id);	// 해쉬맵에서 아이디 제거
			}		
			broadcast(id + " 님이 접속 종료하였습니다.");	// 접속 종료하면 방송해주기
			System.out.println(id + "님이 접속 종료하였습니다.");
			try{		
				if(sock != null)	
					sock.close(); // 소켓이 빈공간이면 닫기
			}catch(Exception ex){}		
		}			
	} // run				
	public void sendmsg(String msg){				
		int start = msg.indexOf(" ") +1; // 아이디의 시작부분은 '/to' 빈칸 다음		
		int end = msg.indexOf(" ", start);	// 아이디의 끝부분은 그 다음 빈칸전까지
		if(end != -1){	// 끝부분의 인덱스 번호가 -1이 아니면(메세지가 존재하면)
			String to = msg.substring(start, end);	// id부분 찾기
			String msg2 = msg.substring(end+1);	// 귓속말의 메세지는 아이디 뒷부분
			Object obj = hm.get(to); // 해쉬맵의 id를 가져오기, obj는 해당 아이디의 키값이 됨.	
			if(obj != null){ // obj가 빈칸이 아니면(아이디가 존재하면)
				PrintWriter pw = (PrintWriter)obj;	// pw는 귓속말 보낼 대상 obj
				pw.println(id + " 님이 다음의 귓속말을 보내셨습니다. :" + msg2);	// 해당 pw에 귓속말 프린트
				pw.flush();	
			} // if	
		}		
	} // sendmsg			
	public void broadcast(String msg){			
		synchronized(hm){		
			Collection <PrintWriter> collection = hm.values(); // 현재 접속한 모든 pw를 collection 형태로 저장.
			Iterator <PrintWriter> iter = collection.iterator();	// collection에 있는 자료를 iter로 만들어줌. 현재 존재하는 모든 pw를 저장.
			while(iter.hasNext()){	// iter가 다음꺼를 가지고 있을동안 
				PrintWriter pw = (PrintWriter)iter.next(); // iter에 있는 값을 printwriter형태로 강제변환
				pw.println(msg); // 해당 pw에 메세지 보내기
				pw.flush(); // 플러쉬 !!
			}	
		}		
	} // broadcast

	public void showlist(){
		int count = 1;
		Object obj = hm.get(id);
		PrintWriter pw = (PrintWriter)obj;
		pw.println("현재 접속자 리스트");
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
		pw.println("금지어 리스트");
		for(int I=0; I<arr.size(); i++){
			pw.println(arr.get(i));
			pw.flush();
		}
	} // banlist
}