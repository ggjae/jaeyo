import java.util.Scanner;

public class D02 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int max_num = 0;
		int min_num = 100;
		int number = 0;
		while (true){
			System.out.println("0부터 100 사이의 숫자를 입력하세요.");
			number = s.nextInt();
			if (number>=0 && 100>=number){
				if (max_num<number){
					max_num=number;
				} else if (min_num>number){
					min_num=number;
				}
			} else{
			System.out.println("입력된 숫자들 중 가장 큰 수는 "+max_num+" 이고, 가장 작은 수는"+min_num+"입니다.");				
			break;
			}
		}
	}
}