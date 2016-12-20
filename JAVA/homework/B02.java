import java.util.Scanner;
public class B02 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("온도를 입력하시오.");
		double input_degree = s.nextDouble();
		System.out.print("입력하신 온도가 섭씨온도이면 C를 화씨온도이면 F를 입력하시오");
		String kind = s.next();
		double output_degree;
		if (kind.equals("C")){
			output_degree = (input_degree*1.8) + 32;
		} else {
			output_degree = (input_degree-32)/1.8;
		}

	System.out.println("변환된 온도는"+output_degree+"입니다.");
	}
}
