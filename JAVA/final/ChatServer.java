import java.net.*;																					// 2016003490 컴퓨터공학과 박재용			
import java.io.*;				
import java.util.*;		
import java.text.*;
				
public class ChatServer {				
				
	public static void main(String[] args) {			
		try{		
			ServerSocket server = new ServerSocket(10001);	
			System.out.println("접속을 기다립니다.");	
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
			
class ChatThread extends Thread{				// 2016003490 컴퓨터공학과 박재용
	SimpleDateFormat f1 = new SimpleDateFormat("H시 mm분 ss초", Locale.KOREA); // 시간 추가한부분. 3번과 관련있습니다.
	private Socket sock;		
	private String id;		
	private BufferedReader br;		
	private HashMap hm;		
	private String ban[] = {"씨발","개새끼","병신","멍청이","바보","새끼"}; // 6번문제입니다. String배열을 제작하였습니다.
	private boolean initFlag = false;
	public ChatThread(Socket sock, HashMap hm){		
		this.sock = sock;	
		this.hm = hm;	
		try{	
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));	
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));	
			id = br.readLine();	
			broadcast("님이 접속하였습니다.");	
			System.out.println("접속한 사용자의 아이디는 " + id + "입니다.");	
			synchronized(hm){	
				hm.put(this.id, pw);
			}	
			initFlag = true;	
		}catch(Exception ex){		
			System.out.println(ex);	
		}		
	} // 생성자			
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
					senduserlist(); // 4번문제와 관련있습니다.
				}
				else{
					String date = f1.format(new Date()); 
					String a = "";
					PrintWriter tmp = (PrintWriter)hm.get(id);
					for(int i=0;i<ban.length;i++){
						if(line.contains(ban[i])){
							tmp.println("욕하지 마십시오! 금지단어인 "+ban[i]+"이(가) 사용되서 전송 불가입니다."); 
							tmp.flush(); //6번문제입니다 tmp를 사용해 지금 채팅하고있는 printwriter를 얻어와 채팅에 밴 배열에 있는 금지단어가 사용되었는지 검사하고, 사용되엇다면 전송 불가하다고하는 부분입니다. 
							flag = 1; // 욕이 발견되엇다면 flag =1로설정해 채팅이 가지 못하게하고, 포문이 끝난 후에 flag를 확인하여 모든사람에게 채팅이 가게하거나, 못가게하거나합니다.
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
			broadcast(id + " 님이 접속 종료하였습니다.");		
			try{		
				if(sock != null)	
					sock.close();
			}catch(Exception ex){}		
		}			
	} // run
	// 2016003490 컴퓨터공학과 박재용
	public void senduserlist(){
		int count = 0;
		Object obj = hm.get(id);
		PrintWriter pw = (PrintWriter)obj;
		pw.println("현재 접속자 리스트");
		synchronized(hm){
			Iterator <String> iter = hm.keySet().iterator();
			while(iter.hasNext()){
				String id = iter.next();
				pw.println((count+1) + ". " + id);
				count ++;
				pw.flush();
			}
			pw.println("현재 "+count+"명 접속 중입니다.");
			pw.flush();
		}
	} // 4번문제입니다. senduserlist()을 제작하였습니다. keyset을 모아놓은것을 iterator의 메소드 hasNext를 사용하기위해 전체 id를 하나씩 검색하는 부분입니다.
	
	public void sendmsg(String msg){				
		int start = msg.indexOf(" ") +1;			
		int end = msg.indexOf(" ", start);			
		if(end != -1){			
			String to = msg.substring(start, end);		
			String msg2 = msg.substring(end+1);		
			Object obj = hm.get(to);		
			if(obj != null){		
				PrintWriter pw = (PrintWriter)obj;	
				pw.println(id + " 님이 다음의 귓속말을 보내셨습니다. : " + msg2);	
				pw.flush();	
			} // if	
		}		
	} // sendmsg	
	/*
	 * 2번 문제입니다. sendmsg에서 hashmap의 사용법은 hm.get(to)를 함으로써 hashmap에서 to의 id(key)값을 가진 value값 ( hashmap을 생성할때 id,printWriter를 받았음으로 value값은 printWriter가 된다.)인 printWriter를
	 * 불러와 현재 String msg를 보낸 printWriter가 obj에 저장되고, 만약 obj != null 이라면, pw에도 저장된다. 
	 * 이때 hashmap의 사용법은 hm.get(to);를 이용해 hashmap의 key값이 to인것의 value값을 찾아 obj에 저장한것입니다.
//	 */

	public void broadcast(String msg){
		/*
		 * 2번문제 입니다. hashmap에 접근하기위해서(동기화) synchronized(hm)을 사용하였고, collection에 hashmap의 value값(PrintWriter)값들을 모두 모아 한
		 * collection에 저장한다. 이때 collection에 모은것들을 Itertor를 사용해 정보를 얻을 수 있다. hashmap의 사용법은 hm.values();를 이용해 hashmap의 value값을 모두 모은 부분이다.
		 * Iterator가 가지고 있는 메서드(hasNext)를 사용해 모든 pw에 msg를 출력하게 한다.
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
					pw.println("[" + date + "] " +id + " "+ msg); // 3번문제입니다. 현재시간을 추가하였습니다.
					pw.flush();
				}
				
			}	/* 5번 문제 입니다.제가 추가한부분은 현재 말하고있는 hashmap의 id의 printWriter값(value값)을 tmp로 얻어와, iter가 검색하는 pw중에
			 	* 현재 말하고있는 tmp와 pw를 비교해 같으면 아무것도 실행하지 않고, 만약 다르면 println을 사용해 출력합니다.
			 	*/
		}		
	} // broadcast			
}				
/* 1번문제입니다.
 * InputThread의 사용방식은 키보드로부터 입력받기 위한 BufferedReader를 생성한 후, 서버로부터 전달된 문자열을 모니터에 출력하는 InputThread 객체를 생성한다.
 *  생성한 후에 키보드로부터 한 줄씩 입력받아 서버에 전송(/quit를 입력받기 전까지)한다. 
 *  키보드로 사용한 글을 입력하고 있는 중간에도 서버에서 다른 클라이언트에서 전송한 문자열을 소켓을 통하여 전달을 받아야 하기 때문에 입력스레드를 따로 이용해야 하므로 이것이 inputthread를 만든 이유이다. 
 */


/*
 * 7번문제입니다. 새로운 hashmap을 만들어, sendmsg코드와 비슷하게 메시지를 뛰어쓰기마다 나눕니다. 채팅을 칠때 마다 처음 단어가 +인지 검색합니다. 만약 +라면 두번째 단어로 들어가 두번째 단어가 무엇인지 검색하고,
 * 두번째 단어를 hashmap의 키 값에 넣습니다. 그러면 예를들어 "+ 안 안녕하세요"를 채팅했다면, key는 안, value는 안녕하세요로 설정해놓고, hashmap.put을 이용하여 hashmap에 등록합니다. 같은 방법으로 hashmap을 채워나갑니다.
 * sendmsg코드와 비슷하게 또 처음 단어가 #인지 검색하고, key값이 두번째단어에 있다면 value를 broadcast를 이용해 출력하는 방식을 이용해 상용구를 설계합니다.
 */

/*
 * 8번문제입니다. 파일서버역할을 하는 outputstream으로 파일을 클라이언트에게 전송할 클래스를 하나 제작하고,  그 클래스에는 파일경로를 line을 bufferedReader로 읽어 string으로 저장해둔다 이 경로를 filepath라 하자. 채팅과 다른 서버 파일서버소켓을 만들고, filepath를 인수로사용한 fileinputstream의 객체를 만든다. 이 객체를 a라 하자. bufferedinputstream은 이 만든 a를 인수로삼아 한 객체를 또 만든다.
 * 또한 outputstream을 socket.getoutputstream()으로 지정하고, bufferedoutputstream도 이 outputstream객체를 사용해 새로운 객체를 만든다.
 * 한 변수를 만들어 BufferedInputStream을 read하고, 만약 -1이 아니라면 BufferedOutputStream에 읽어온것을 write 한다.
 * 파일클라이언트 역할을 하는 파일리시버는 일단 파일서버의 서버소켓에 접속하고, socket.getInputStream()을 사용하고, BufferedInputStream(getInputStream())으로 받는다.
 * FileOutputStream의 객체를 만들고, BufferedOutputStream의 객체를 만들어서 BufferedInputStream에서 읽고, -1이아니라면 BufferedOutputStream(fileoutputstream)을 write하여 파일다운로드를 받는다. 
 */ 
