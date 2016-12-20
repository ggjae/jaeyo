import java.util.Random;
import java.util.Scanner;
public class H01 {
	void run(){
		int number_try,answer,count=0;
		Random generator = new Random();
		Scanner s = new Scanner(System.in);
		
		answer = generator.nextInt(100);
		
		while (true){
			System.out.print("1부터 100까지의 숫자 하나를 맞춰보세요");	
			number_try = s.nextInt();
			if (number_try<answer){
				System.out.println("좀 더 큰수입니다.");
				count += 1;
			}
			else if (number_try>answer){
				System.out.println("좀 더 작은 수입니다.");
				count += 1;
			}
			else if (number_try==answer){
			
				System.out.println(count+" 번만에 숫자를 맞추셨습니다.");
		
			}
		}
	}
	public static void main(String[] args){
		H01 a = new H01();
			a.run();
	}
}
