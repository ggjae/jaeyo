import java.util.Random;
import java.util.Scanner;
public class H01 {
	void run(){
		int number_try,answer,count=0;
		Random generator = new Random();
		Scanner s = new Scanner(System.in);
		
		answer = generator.nextInt(100);
		
		while (true){
			System.out.print("1���� 100������ ���� �ϳ��� ���纸����");	
			number_try = s.nextInt();
			if (number_try<answer){
				System.out.println("�� �� ū���Դϴ�.");
				count += 1;
			}
			else if (number_try>answer){
				System.out.println("�� �� ���� ���Դϴ�.");
				count += 1;
			}
			else if (number_try==answer){
			
				System.out.println(count+" ������ ���ڸ� ���߼̽��ϴ�.");
		
			}
		}
	}
	public static void main(String[] args){
		H01 a = new H01();
			a.run();
	}
}
