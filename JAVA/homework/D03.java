import java.util.Scanner;

public class D03 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int number = 0;
		int count=0;
		int totalsum = 0;
		double average = 0;
		while (true){
			System.out.println("0부터 100 사이의 숫자를 입력하세요.");
			number = s.nextInt();
			if (number>=0 && 100>=number){
				totalsum = totalsum+number;
				count=count+1;
				average = (double) totalsum/count;
			} else{
			break;
			}
		}
		System.out.println("입력된"+count+"개의 숫자들의 총 합계는"+totalsum+" 이고, 평균은"+average+"입니다.");
	}
}