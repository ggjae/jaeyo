import java.util.Scanner;

public class D08 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int x_begin = 0;
		int x_end = 0;
		int x = 0;
		int y = 0;
		int i = 0;
		System.out.print("1�� �Լ� y=ax^2+bx+c�� ��� a�� b�� c�� �Է��Ͻÿ�.");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		System.out.print("x��ǥ�� ���� ���� �� ���� �Է��Ͻÿ�.");
		x_begin = s.nextInt();
		x_end = s.nextInt();
		for (i=x_begin;i<=x_end;i++){
			y = a*i*i + b*i + c;
			System.out.println("��ǥ ("+i+","+y+")");
		}
	}
}