import java.util.Scanner;

public class A05 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�");
		int days = s.nextInt();
		int seconds = days * 24 * 60 * 60;
		System.out.print("������ �ش�Ǵ� �ʴ�"+seconds+"�Դϴ�");			
	}
}
