import java.util.ArrayList;
import java.util.Scanner;

class Manager {
	static ArrayList<Student> stdlist = new ArrayList(); // ��̸���Ʈ�� ������µ�, Student Ŭ��������
	// ���ο� ����Ʈ �̸��� stdlist�� �������
	public String Studentnumber=""; 
	public String address,name,sex,phonenumber = "";
	Scanner s = new Scanner(System.in);
	
	static void registStudent(){
		String Studentnumber=""; 
		String address,name,sex,phonenumber = "";
		Scanner s = new Scanner(System.in);
		System.out.println("�л��̸�,�й�,������ �Է��ϼ���"); // �л��̸��й������� �޾Ƽ�
		Student std = new Student(); // StudentŬ�������� std��� ��ü�� ����, ������
		// ������ = 0���� �ʱ�ȭ���ִ°�ó�� ��ü�� �ʱ�ȭ���ذ�.
		std.name = s.next(); // std.�� �տ��������� ��ü�ȿ����� �Ͼ�� �ൿ
		std.Studentnumber = s.next();
		std.sex = s.next();
		System.out.println("�ּҸ� �Է��ϼ���.");
		std.address = s.nextLine();
		System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
		std.phonenumber = s.next();
		stdlist.add(std); // stdlist�� std�� �־���..?

	}
	void modify(){
		
	}
	void start(){
		int a = 0;
		// 1���� 8������ ���ڸ��޾Ƽ�. 1���̸� registStudent()�� �ѹ��������ϰ� 
		// System.out.println
		Scanner s = new Scanner(System.in);
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("1) �л���� 2) �������� 3)���� 4)����Ʈ 5)�̸��˻� 6)���л�����Ʈ 7)�ּҰ˻� 8)���� ==>");
		a = s.nextInt();
		if (a==1){
			Manager.registStudent();
			System.out.println("��"+(stdlist.size()+1)+"���� �ԷµǾ����ϴ�.");
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
