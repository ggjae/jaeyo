import java.util.Scanner;

public class B09 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("신장을 입력하시오(CM)");
		int height = s.nextInt();
		System.out.print("체중을 입력하시오(kg)");
		int weight = s.nextInt();
		int bmi = weight / (height/100*height/100);
		System.out.println(bmi);
		if (bmi>=25){
			System.out.println("당신은 비만입니다.");
		} else {
			System.out.println("당신은 비만이 아닙니다.");
		}		
	}
}