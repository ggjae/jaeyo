import java.util.Scanner;
import java.util.ArrayList;
String studentnumber=""; 
String address,name,sex,phonenumber = "";
Scanner s = new Scanner(System.in);
String bokhak = "";
public class STUDENT extends PERSON { // �й��̶� ���л��� ��ӹ޾ƾ���
	public static void main(String[] args){
		System.out.println("���л��Դϱ�? (Y/N)");
		a=s.next();
		if (a.equals("Y")){
			bokhak += 1 
		}
	}
}



class PERSON {
	
	void start(){
		int a = 0;
		// 1���� 8������ ���ڸ��޾Ƽ�. 1���̸� registStudent()�� �ѹ��������ϰ� 
		// System.out.println
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("1) �л���� 2) �������� 3)���� 4)����Ʈ 5)�̸��˻� 6)���л�����Ʈ 7)�ּҰ˻� 8)���� ==>")
		a = s.nextInt();
		if (a==1){
			MANAGER.registStudent();
			System.out.println("��"+stdlist.size()+"���� �ԷµǾ����ϴ�.")
		} if (a==2){
			for (int i=0;i<stdlist.size();i++)
			stdlist.get(i);
		}
		System.out.println("------------------------------------------------------------------------------------");
	
	}

	public static void main(String[] args){
		
	}
}
class MANAGER {
	ArrayList<STUDENT> stdlist = new ArrayList<STUDENT>(); // ��̸���Ʈ�� ������µ�, STUDENT Ŭ��������
	// ���ο� ����Ʈ �̸��� stdlist�� �������
	void registStudent(){
		System.out.println("�л��̸�,�й�,������ �Է��ϼ���"); // �л��̸��й������� �޾Ƽ�
		STUDENT std = new STUDENT(); // STUDENTŬ�������� std��� ��ü�� ����, ������
		// ������ = 0���� �ʱ�ȭ���ִ°�ó�� ��ü�� �ʱ�ȭ���ذ�.
		std.name = s.next(); // std.�� �տ��������� ��ü�ȿ����� �Ͼ�� �ൿ
		std.studentnumber = s.next();
		std.sex = s.next();
		System.out.println("�ּҸ� �Է��ϼ���.");
		std.address = s.nextLine();
		System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
		std.phonenumber = s.next();
		stdlist.add(std); // stdlist�� std�� �־���..?

	}
	
}

class RUN {

}
class STUDENT extends PERSON {
	public static void main(String[] args){
		System.out.println("���л��Դϱ�?");
		
	}
}
