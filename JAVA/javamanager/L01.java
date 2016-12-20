// L01 MenuManager class
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//L01 information class

class L01Information {
	String name;
	String phonenumber;
	String address;
	L01Information(String name,String phonenumber,String address){
		this.name = name;
		this.phonenumber = phonenumber;
		this.address = address;
	}
}

class Run{
	public static void main(String args[]){
		
	}
}

class L01MenuManager {
	Scanner s = new Scanner(System.in);
	int number;
	ArrayList<L01Information> list = new ArrayList<L01Information>();
	void ask(){
		System.out.print("\n1) 친구등록  2) 전체보기 3) 데이터 저장 4) 종료 => ");
		number = s.nextInt();
		System.out.println("------------------------------------------------------------");
	}
	void num1(){ // 異붽�
		System.out.print("이름 => ");
		String name = s.next();
		System.out.print("전화번호 => ");
		String phonenumber = s.next();
		s.nextLine();
		System.out.print("주소 => ");
		String address = s.nextLine();
		list.add(new L01Information(name,phonenumber,address));
		System.out.println("친구 1명을 등록하였습니다.");
	}
	void num4(){ // 由ъ뒪�듃
		for (int i=0;i<list.size();i++){
			System.out.print(list.get(i).name+"\t"+list.get(i).phonenumber+"\t"+list.get(i).address+"\n");
		}
	}
	void num5(){ // 珥앷컻�닔
		FileWriter fw = null;
		BufferedWriter bw = null;
		String intext = null;
		for(int i=0;i<list.size();i++){
			intext = list.get(i).name+" "+list.get(i).phonenumber+" "+list.get(i).address+"\t";	
			try {
				fw = new FileWriter("outtext.txt", true);
				bw = new BufferedWriter(fw);
				bw.write(intext);
				bw.newLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if(bw != null) try{bw.close();}catch(IOException e){}
				if(fw != null) try{fw.close();}catch(IOException e){}
			}
		}
		
		
		
		
		System.out.println("데이터가 텍스트파일로 저장되었습니다.");
	}
}

//L01 main class
public class L01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		L01MenuManager ll = new L01MenuManager();
		ll.ask();
		while (ll.number != 6){
			if (ll.number == 1){
				ll.num1();
				ll.ask();
			}
			else if (ll.number == 2){
				ll.num4();
				ll.ask();
			}
			else if (ll.number == 3){
				ll.num5();
				ll.ask();
			}
			else {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		System.out.println("종료되었습니다.");
	}

}
