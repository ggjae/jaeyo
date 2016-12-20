import java.util.Scanner;

public class A1 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("당신이 태어난 연도를 입력");
		int birth_year = s.nextInt();
		int age = 2016 - birth_year + 1;
		System.out.print("당신이 나이는"+age+"입니다");		
	}

}
