import java.util.Scanner;

public class A02 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("���� �µ��� �Է��Ͻÿ�");
		double c_degree = s.nextDouble();
		double f_degree = c_degree*1.8+32;
		System.out.print("ȭ���µ���"+f_degree+"�Դϴ�");			
	}
}
