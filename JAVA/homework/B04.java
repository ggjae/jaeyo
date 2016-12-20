import java.util.Scanner;

public class B04 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의 분양면적을 입력하시오");
		double m2_area = s.nextDouble();
		double pyung_area = m2_area/3.305;
		System.out.printf("평형으로는 %.1f 입니다.",pyung_area);		
		if (pyung_area>=30){
			System.out.println("\n30평 이상이므로 비교적 큰 아파트입니다.");
		} else {
			System.out.println("30평 미만이므로 비교적 작은 아파트입니다.");
		}
	}
}
