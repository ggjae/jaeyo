import java.util.Scanner;
public class B01 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("��������� �Է��Ͻÿ�.");
		int birth_year = s.nextInt();
		int age = 2015 - birth_year;
		if (age<20){
			System.out.println("�̼������Դϴ�.");
		} else {
			System.out.println("�̼����ڰ� �ƴմϴ�.");
		}
	}
}
