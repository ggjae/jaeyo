import java.util.Scanner;
public class B01 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("출생연도를 입력하시오.");
		int birth_year = s.nextInt();
		int age = 2015 - birth_year;
		if (age<20){
			System.out.println("미성년자입니다.");
		} else {
			System.out.println("미성년자가 아닙니다.");
		}
	}
}
