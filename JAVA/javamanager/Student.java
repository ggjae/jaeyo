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
		System.out.print("1)�л���� 2)�������� 3)���� 4)����Ʈ 5)�̸��˻� 6)���л�����Ʈ 7)�ּҰ˻� 8)���� ==> ");
		int input = s.nextInt();
		getname(input);
	}
	
	void getname(int input){
		String temp;
		String input1;String input2;String input3;String input4;String input5;String input6;
		switch(input){
		case 1:
			System.out.print("�л��̸�, �й�, ������ �Է��ϼ��� : ");
			input1=s.next();
			input2=s.next();
			input3=s.next();
			s.nextLine();
			System.out.print("�ּҸ� �Է��ϼ��� : ");
			input4=s.nextLine();
			System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
			input5=s.next();
			System.out.print("���л��Դϱ�?(Y/N) ");
			input6=s.next();
			
			Student a  = new Student(input1,input3,input4,input5,input2,input6);
			if(cnt==0){
				myList.add(a);
				System.out.printf("\n\n�� %d���� ��ϵǾ����ϴ�.\n",myList.size());
			}
			else{
				myList.remove(cnt-1);
				myList.add(cnt-1,a);
				System.out.print("�����Ǿ����ϴ�.\n");
				cnt = 0;
			}
			
			start();
		case 2:
			System.out.print("��ȣ �̸�    �й�\t\t����  �ּ�\t��ȭ��ȣ\t���л�\n");
			
			for(int i=0;i<myList.size();i++){
				System.out.printf("%d %s    %s\t\t%s  %s\t%s\t%s\n",i+1,myList.get(i).showname(),myList.get(i).showhakbun(),myList.get(i).showgender(),myList.get(i).showaddress(),myList.get(i).showPnumber(),myList.get(i).showbokhak());
			}
			System.out.print("==>�����Ͻ� ��ȣ�� �Է��ϼ��� : ");
			cnt = s.nextInt();
			getname(1);
			
		case 3:
			
			System.out.print("��ȣ �̸�    �й�\t\t����  �ּ�\t��ȭ��ȣ\t���л�\n");
			for(int i=0;i<myList.size();i++){
				System.out.printf("%d %s    %s\t\t%s  %s\t%s\t%s\n",i+1,myList.get(i).showname(),myList.get(i).showhakbun(),myList.get(i).showgender(),myList.get(i).showaddress(),myList.get(i).showPnumber(),myList.get(i).showbokhak());
			}
			if(myList.size()==0){
				start();
			}
			System.out.print("==> �����Ͻ� ��ȣ�� �Է��ϼ��� : ");
			input = s.nextInt();
			System.out.print("������ �����Ͻðڽ��ϱ�?(Y/N) ");
			temp = s.next();
			if(temp.equals("Y")){
				myList.remove(input-1);
			}
			else{
				System.out.print("�峭ġ��������.");
			}
			System.out.print("�����Ǿ����ϴ�.\n");
			start();
		case 4:
			System.out.print("��ȣ �̸�    �й�\t\t����  �ּ�\t��ȭ��ȣ\t���л�\n");
			for(int i=0;i<myList.size();i++){
				System.out.printf("%d %s    %s\t\t%s  %s\t%s\t%s\n",i+1,myList.get(i).showname(),myList.get(i).showhakbun(),myList.get(i).showgender(),myList.get(i).showaddress(),myList.get(i).showPnumber(),myList.get(i).showbokhak());
			}
			System.out.printf("\n\n�� %d���� ��ϵǾ����ϴ�.\n",myList.size());
			start();
		case 5:
			System.out.print("�˻��Ͻ� �̸��� �Է��ϼ��� : ");
			temp = s.next();
			
			for(int i=0;i<myList.size();i++){
				if(myList.get(i).showname().contains(temp)){
					System.out.print("�˻��Ǿ����ϴ�.");
					System.out.print("��ȣ �̸�    �й�\t\t����  �ּ�\t��ȭ��ȣ\t���л�\n");
					System.out.printf("%d %s    %s\t\t%s  %s\t%s\t%s\n",i+1,myList.get(i).showname(),myList.get(i).showhakbun(),myList.get(i).showgender(),myList.get(i).showaddress(),myList.get(i).showPnumber(),myList.get(i).showbokhak());
				}
				
			}
			start();
		case 6:
			int bokcnt=0;
			for(int i=0;i<myList.size();i++){
				if(myList.get(i).showbokhak().equals("Y")){
					bokcnt++;
					System.out.print("��ȣ �̸�    �й�\t\t����  �ּ�\t��ȭ��ȣ\t���л�\n");
					System.out.printf("%d %s    %s\t\t%s  %s\t%s\t%s\n",i+1,myList.get(i).showname(),myList.get(i).showhakbun(),myList.get(i).showgender(),myList.get(i).showaddress(),myList.get(i).showPnumber(),myList.get(i).showbokhak());
	
				}
			}
			System.out.printf("���л��� %d���Դϴ�.",bokcnt);
			start();
		case 7:
			System.out.print("�˻��Ͻ� �̸��� �Է��ϼ��� : ");
			temp = s.next();
			for(int i =0;i<myList.size();i++){
				if(myList.get(i).showaddress().contains(temp)){
					System.out.print("��ȣ �̸�    �й�\t\t����  �ּ�\t��ȭ��ȣ\t���л�\n");
					System.out.printf("%d %s    %s\t\t%s  %s\t%s\t%s\n",i+1,myList.get(i).showname(),myList.get(i).showhakbun(),myList.get(i).showgender(),myList.get(i).showaddress(),myList.get(i).showPnumber(),myList.get(i).showbokhak());
	
				}
			}
			start();
		case 8: 
			System.out.print("����Ǿ����ϴ�.");
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