import java.util.Scanner;
public class SY {
	void run(){
		Scanner s = new Scanner(System.in);
		String make1 = " ";
		String make2 = " ";
		String make3 = " ";
		String make4 = " ";
		String make5 = " ";
		System.out.println("�ҿ��� ������");
		make1 = s.nextLine();
		if(make1.equals("�� ���ùݿ� ����")){
			System.out.println("�Ф� �� �ɽɤ���");
		}
		System.out.println("���ù��̾� ����!");
		make2 = s.nextLine();
		System.out.println("�Ф� ���� ������");
		System.out.println("������ ���ҿ���ī���ϻ�");
		
	}
	public static void main(String[] args){
		SY a = new SY();
		a.run();
	}

}
