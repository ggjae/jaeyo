import java.util.Scanner;

public class C02 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("물의 온도를 입력하시오");
		double input_degree = s.nextDouble();
		if (input_degree<0){
			System.out.println("잘못입력");
		} else if (0<=input_degree && input_degree<25){
			System.out.println("냉수입니다");
		} else if (25<=input_degree && input_degree<40){
			System.out.println("미온수입니다.");
		} else if (40<=input_degree && input_degree<80){
			System.out.println("온수입니다");
		} else if (80<=input_degree){
			System.out.println("끓는물입니다");
		}
	}
}
