import java.util.Scanner;
public class HIJIMIN {

	public static void main(String[] args) {
		String make = " ";
		String make1 = " ";
		Scanner s = new Scanner(System.in);
		
		
		while (true){
			System.out.println("ID�� �Է��ϼ���");
			make = s.next();
			if(make.equals("���")){
				System.out.println("��й�ȣ�� �Է��ϼ���.");
				make1 = s.next();
				if(make1.equals("����"))
				System.out.println("���ξ� ���� ���� �� ��ȩ�þ�!");
				break;
			}
			
		}
		// TODO Auto-generated method stub

	}

}
