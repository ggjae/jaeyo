import java.util.Scanner;
import java.util.Random;

public class H05 {
	void run(){
		int coins = 0;
		int number[] = new int[3];
		int dummy = 0;
		int i = 0;
		int j = 0;
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("사용하실 코인의 개수를 입력하세요.");
		coins = s.nextInt();
		for(i=1;i<=coins;i++){
			System.out.println("게임"+(i)+"회 Start! ( 아무 숫자나 입력하세요 )");
			dummy = s.nextInt();
			
			for(j=0;j<3;j++){
				number[j] = r.nextInt(9)+1;
			}
			System.out.printf("게임 결과 : %d %d %d", number[0],number[1],number[2]);
			if (number[0]!=number[1] && number[1]!=number[2] && number[0]!=number[2]){
				System.out.println("====> 꽝입니다... 아쉽군요");
				System.out.println("남아있는 코인은"+(coins-i)+"개 입니다.");
			} else if(number[0]==number[2] && number[1] == number[2]){
				System.out.println("====> 숫자 2개 일치.. 코인 2개 증정");
				coins += 2;
				System.out.println("남아있는 코인은"+(coins-i)+"개 입니다.");
			} else if (number[0] == number[1] || number[0] == number[2] || number[1] == number[2]){
				System.out.println("====> 숫자 1개 일치.. 코인 1개 증정");
				coins += 1;
				System.out.println("남아있는 코인은"+(coins-i)+"개 입니다.");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H05 a = new H05();
		a.run();

	}

}
