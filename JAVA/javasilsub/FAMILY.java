import java.util.Scanner;
public class FAMILY {

	public static void main(String[] args) {
		String make[] = new String[5];
		Scanner s = new Scanner(System.in);
		
		
		for(int i=0 ; i<5 ; i ++){
			System.out.println("���� ������ �̸��� �Է��ϼ���");
			make[i] = s.next();
			System.out.println("�ԷµǾ����ϴ�.");
			
		}
		System.out.println("�� �츮�������ݾ�!");
		System.out.println("�������� : �����̵� ���ݾƤ���");
		System.out.printf("%s %s %s %s %s �ڿ���",make[0],make[1],make[2],make[3],make[4]);
		// TODO Auto-generated method stub

	}

}