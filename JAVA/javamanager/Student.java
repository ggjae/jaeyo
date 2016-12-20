import java.util.ArrayList;
import java.util.Scanner;

class Person{
	private String name;
	private String gender;
	private String address;
	private String Pnumber;
	
	public Person(String name,String gender,String address,String Pnumber){
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.Pnumber = Pnumber;
		
	}
	String showname(){
		return this.name;
	}
	String showgender(){
		return this.gender;
	}
	String showaddress(){
		return this.address;
	}
	String showPnumber(){
		return this.Pnumber;
		
	}
	
	 
	
	// name , gender , address, number  - member variable
}

class Student extends Person{
	private String hakbun;
	private String bokhak;
	Student(String name,String gender,String address,String Pnumber, String hakbun, String bokhak){
		super(name,gender,address,Pnumber);
		this.hakbun = hakbun;
		this.bokhak = bokhak;
	}
	
	String showhakbun(){
		return this.hakbun;
	}
	String showbokhak(){
		return this.bokhak;
	}
	
}

class StudentManager{
	int cnt=0;
	ArrayList<Student> myList = new ArrayList<Student>();
	Scanner s = new Scanner(System.in);
	
	void start(){
		
		
		System.out.print("----------------------------------------------------------------\n");
		System.out.print("1)학생등록 2)정보수정 3)삭제 4)리스트 5)이름검색 6)복학생리스트 7)주소검색 8)종료 ==> ");
		int input = s.nextInt();
		getname(input);
	}
	
	void getname(int input){
		String temp;
		String input1;String input2;String input3;String input4;String input5;String input6;
		switch(input){
		case 1:
			System.out.print("학생이름, 학번, 성별을 입력하세요 : ");
			input1=s.next();
			input2=s.next();
			input3=s.next();
			s.nextLine();
			System.out.print("주소를 입력하세요 : ");
			input4=s.nextLine();
			System.out.print("전화번호를 입력하세요 : ");
			input5=s.next();
			System.out.print("복학생입니까?(Y/N) ");
			input6=s.next();
			
			Student a  = new Student(input1,input3,input4,input5,input2,input6);
			if(cnt==0){
				myList.add(a);
				System.out.printf("\n\n총 %d명이 등록되었습니다.\n",myList.size());
			}
			else{
				myList.remove(cnt-1);
				myList.add(cnt-1,a);
				System.out.print("수정되었습니다.\n");
				cnt = 0;
			}
			
			start();
		case 2:
			System.out.print("번호 이름    학번\t\t성별  주소\t전화번호\t복학생\n");
			
			for(int i=0;i<myList.size();i++){
				System.out.printf("%d %s    %s\t\t%s  %s\t%s\t%s\n",i+1,myList.get(i).showname(),myList.get(i).showhakbun(),myList.get(i).showgender(),myList.get(i).showaddress(),myList.get(i).showPnumber(),myList.get(i).showbokhak());
			}
			System.out.print("==>수정하실 번호를 입력하세요 : ");
			cnt = s.nextInt();
			getname(1);
			
		case 3:
			
			System.out.print("번호 이름    학번\t\t성별  주소\t전화번호\t복학생\n");
			for(int i=0;i<myList.size();i++){
				System.out.printf("%d %s    %s\t\t%s  %s\t%s\t%s\n",i+1,myList.get(i).showname(),myList.get(i).showhakbun(),myList.get(i).showgender(),myList.get(i).showaddress(),myList.get(i).showPnumber(),myList.get(i).showbokhak());
			}
			if(myList.size()==0){
				start();
			}
			System.out.print("==> 삭제하실 번호를 입력하세요 : ");
			input = s.nextInt();
			System.out.print("정말로 삭제하시겠습니까?(Y/N) ");
			temp = s.next();
			if(temp.equals("Y")){
				myList.remove(input-1);
			}
			else{
				System.out.print("장난치지마세요.");
			}
			System.out.print("삭제되었습니다.\n");
			start();
		case 4:
			System.out.print("번호 이름    학번\t\t성별  주소\t전화번호\t복학생\n");
			for(int i=0;i<myList.size();i++){
				System.out.printf("%d %s    %s\t\t%s  %s\t%s\t%s\n",i+1,myList.get(i).showname(),myList.get(i).showhakbun(),myList.get(i).showgender(),myList.get(i).showaddress(),myList.get(i).showPnumber(),myList.get(i).showbokhak());
			}
			System.out.printf("\n\n총 %d명이 등록되었습니다.\n",myList.size());
			start();
		case 5:
			System.out.print("검색하실 이름을 입력하세요 : ");
			temp = s.next();
			
			for(int i=0;i<myList.size();i++){
				if(myList.get(i).showname().contains(temp)){
					System.out.print("검색되었습니다.");
					System.out.print("번호 이름    학번\t\t성별  주소\t전화번호\t복학생\n");
					System.out.printf("%d %s    %s\t\t%s  %s\t%s\t%s\n",i+1,myList.get(i).showname(),myList.get(i).showhakbun(),myList.get(i).showgender(),myList.get(i).showaddress(),myList.get(i).showPnumber(),myList.get(i).showbokhak());
				}
				
			}
			start();
		case 6:
			int bokcnt=0;
			for(int i=0;i<myList.size();i++){
				if(myList.get(i).showbokhak().equals("Y")){
					bokcnt++;
					System.out.print("번호 이름    학번\t\t성별  주소\t전화번호\t복학생\n");
					System.out.printf("%d %s    %s\t\t%s  %s\t%s\t%s\n",i+1,myList.get(i).showname(),myList.get(i).showhakbun(),myList.get(i).showgender(),myList.get(i).showaddress(),myList.get(i).showPnumber(),myList.get(i).showbokhak());
	
				}
			}
			System.out.printf("복학생은 %d명입니다.",bokcnt);
			start();
		case 7:
			System.out.print("검색하실 이름을 입력하세요 : ");
			temp = s.next();
			for(int i =0;i<myList.size();i++){
				if(myList.get(i).showaddress().contains(temp)){
					System.out.print("번호 이름    학번\t\t성별  주소\t전화번호\t복학생\n");
					System.out.printf("%d %s    %s\t\t%s  %s\t%s\t%s\n",i+1,myList.get(i).showname(),myList.get(i).showhakbun(),myList.get(i).showgender(),myList.get(i).showaddress(),myList.get(i).showPnumber(),myList.get(i).showbokhak());
	
				}
			}
			start();
		case 8: 
			System.out.print("종료되었습니다.");
			break;
		
//		default:
//			break;
		}
	}
		
	}
	

 class Run{
	
	public static void main(String[] args){
		StudentManager t = new StudentManager();
		t.start();
		
		
	}
}