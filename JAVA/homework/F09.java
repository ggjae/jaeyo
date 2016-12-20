import java.util.Scanner;
public class F09 {
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int monthdays[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int month,day=0;
		int day_count=0;
		int i = 0;
		
		System.out.print("월을 입력하시오.");
		month = s.nextInt();
		System.out.print("일을 입력하시오.");
		day = s.nextInt();
		if (month >= 13)
			System.out.println("잘못 입력하셨습니다.");
		if (monthdays[month-1] <= day)
			System.out.println("잘못 입력하셨습니다.");
		if(monthdays[month-1] >= day && month <= 12){
			for(i=1;i<month;i++){
				day_count += monthdays[i];
			}
			day_count += day;	
			System.out.println("이 날짜는 1년 중"+day_count+"날에 해당됩니다.");
		}
	}
}
