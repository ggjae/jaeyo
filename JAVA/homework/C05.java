import java.util.Scanner;

public class C05 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("월을 입력하시오.");
		int month = s.nextInt();
		System.out.print("일을 입력하시오.");
		int day = s.nextInt();
		if (month == 1){
			System.out.print("이 날짜는 1년 중 "+day+"번째 날에 해당됩니다.");
		} else if (month == 2){
			System.out.print("이 날짜는 1년 중 "+(day+31)+"번째 날에 해당됩니다.");
		} else if (month == 3){
			System.out.print("이 날짜는 1년 중"+(day+31+28)+"번째 날에 해당됩니다.");
		} else if (month == 4){
			System.out.print("이 날짜는 1년 중"+(day+31+28+31)+"번째 날에 해당됩니다.");
		} else if (month == 5){
			System.out.print("이 날짜는 1년 중"+(day+31+28+31+30)+"번째 날에 해당됩니다.");
		} else if (month == 6){
			System.out.print("이 날짜는 1년 중"+(day+31+28+31+30+31)+"번째 날에 해당됩니다.");
		} else if (month == 7){
			System.out.print("이 날짜는 1년 중"+(day+31+28+31+30+31+30)+"번째 날에 해당됩니다.");
		} else if (month == 8){
			System.out.print("이 날짜는 1년 중"+(day+31+28+31+30+31+30+31)+"번째 날에 해당됩니다.");
		} else if (month == 9){
			System.out.print("이 날짜는 1년 중"+(day+31+28+31+30+31+30+31+31)+"번째 날에 해당됩니다.");
		} else if (month == 10){
			System.out.print("이 날짜는 1년 중"+(day+31+28+31+30+31+30+31+31+30)+"번째 날에 해당됩니다.");
		} else if (month == 11){
			System.out.print("이 날짜는 1년 중"+(day+31+28+31+30+31+30+31+31+30+31)+"번째 날에 해당됩니다.");
		} else if (month == 12){
			System.out.print("이 날짜는 1년 중"+(day+31+28+31+30+31+30+31+31+30+31+30)+"번째 날에 해당됩니다.");
		}
	}
}
