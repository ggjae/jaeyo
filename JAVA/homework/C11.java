import java.util.Scanner;

public class C11 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("년도를 입력하세요");
		int year = s.nextInt();
		if (year%4==0){
			if (year%100==0){
				if (year%400==0){
					System.out.print("입력하신 연도는 윤년입니다.");
				}
				else{
					System.out.print("입력하신 연도는 윤년이 아닙니다.");
				}
			} else {
				System.out.print("입력하신 연도는 윤년입니다.");
			}
		} else {
			System.out.print("입력하신 연도는 윤년이 아닙니다.");
		}
	}
}