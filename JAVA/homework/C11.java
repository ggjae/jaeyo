import java.util.Scanner;

public class C11 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ���");
		int year = s.nextInt();
		if (year%4==0){
			if (year%100==0){
				if (year%400==0){
					System.out.print("�Է��Ͻ� ������ �����Դϴ�.");
				}
				else{
					System.out.print("�Է��Ͻ� ������ ������ �ƴմϴ�.");
				}
			} else {
				System.out.print("�Է��Ͻ� ������ �����Դϴ�.");
			}
		} else {
			System.out.print("�Է��Ͻ� ������ ������ �ƴմϴ�.");
		}
	}
}