import java.util.Scanner;

public class C09 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("����(�� ����)�� ���ڷ� �Է��ϼ���");
		int income = s.nextInt();
		int tax = 0;
		if (income<10000000){
			tax = (int) (income * 0.095);
		} else if (income>=10000000 && income<40000000){
			tax = (int) (income * 0.19);
		} else if (income>=40000000 && income<80000000){
			tax = (int) (income * 0.28);
		} else if (income>=80000000){
			tax = (int) (income * 0.37);
		}
		System.out.print("���� �ݾ׿� ���� �ҵ漼�� "+tax+"�� �Դϴ�.");
	}
	
}