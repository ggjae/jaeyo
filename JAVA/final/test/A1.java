import java.util.Scanner;

public class A1 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("����� �¾ ������ �Է�");
		int birth_year = s.nextInt();
		int age = 2016 - birth_year + 1;
		System.out.print("����� ���̴�"+age+"�Դϴ�");		
	}

}
