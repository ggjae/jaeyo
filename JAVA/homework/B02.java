import java.util.Scanner;
public class B02 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("�µ��� �Է��Ͻÿ�.");
		double input_degree = s.nextDouble();
		System.out.print("�Է��Ͻ� �µ��� �����µ��̸� C�� ȭ���µ��̸� F�� �Է��Ͻÿ�");
		String kind = s.next();
		double output_degree;
		if (kind.equals("C")){
			output_degree = (input_degree*1.8) + 32;
		} else {
			output_degree = (input_degree-32)/1.8;
		}

	System.out.println("��ȯ�� �µ���"+output_degree+"�Դϴ�.");
	}
}
