import java.util.Scanner;

public class C02 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("���� �µ��� �Է��Ͻÿ�");
		double input_degree = s.nextDouble();
		if (input_degree<0){
			System.out.println("�߸��Է�");
		} else if (0<=input_degree && input_degree<25){
			System.out.println("�ü��Դϴ�");
		} else if (25<=input_degree && input_degree<40){
			System.out.println("�̿¼��Դϴ�.");
		} else if (40<=input_degree && input_degree<80){
			System.out.println("�¼��Դϴ�");
		} else if (80<=input_degree){
			System.out.println("���¹��Դϴ�");
		}
	}
}
