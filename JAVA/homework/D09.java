import java.util.Scanner;

public class D09 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int dan = 0;
		int i = 0;
		while (true){
			System.out.print("출력하고 싶은 구구단의 단 수를 입력하시오(2~9)");
			dan=s.nextInt();
			if (dan<=9 && dan>1){
				for (i=1;i<=9;i++){
					System.out.println(dan+"X "+i+"="+dan*i);			
				}
				break;
			} else{
				System.out.println("잘못 입력하였습니다.");
			}
		}		
	}
}