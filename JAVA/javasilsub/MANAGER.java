import java.util.ArrayList;
import java.util.Scanner;

class Manager {
	static ArrayList<Student> stdlist = new ArrayList(); // 어레이리스트를 만들엇는데, Student 클래스에서
	// 새로운 리스트 이름인 stdlist를 만들었음
	public String Studentnumber=""; 
	public String address,name,sex,phonenumber = "";
	Scanner s = new Scanner(System.in);
	
	static void registStudent(){
		String Studentnumber=""; 
		String address,name,sex,phonenumber = "";
		Scanner s = new Scanner(System.in);
		System.out.println("학생이름,학번,성별을 입력하세요"); // 학생이름학번성별을 받아서
		Student std = new Student(); // Student클래스에서 std라는 객체를 만듬, 우항은
		// 변수를 = 0으로 초기화해주는것처럼 객체를 초기화해준것.
		std.name = s.next(); // std.가 앞에붙은것은 객체안에서에 일어나는 행동
		std.Studentnumber = s.next();
		std.sex = s.next();
		System.out.println("주소를 입력하세요.");
		std.address = s.nextLine();
		System.out.println("전화번호를 입력하세요.");
		std.phonenumber = s.next();
		stdlist.add(std); // stdlist에 std를 넣었음..?

	}
	void modify(){
		
	}
	void start(){
		int a = 0;
		// 1부터 8까지의 숫자를받아서. 1번이면 registStudent()를 한번더실행하고 
		// System.out.println
		Scanner s = new Scanner(System.in);
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("1) 학생등록 2) 정보수정 3)삭제 4)리스트 5)이름검색 6)복학생리스트 7)주소검색 8)종료 ==>");
		a = s.nextInt();
		if (a==1){
			Manager.registStudent();
			System.out.println("총"+(stdlist.size()+1)+"명이 입력되었습니다.");
		} 
		else if(a==2){
			
		}
		else if (a==4){
			for (int i=0;i<stdlist.size();i++)
			stdlist.get(i);
		}
		System.out.println("------------------------------------------------------------------------------------");
	
	}

	
}
