import java.util.Scanner;

public class C04 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의 분양면적을 입력하시오");
		double m2_area = s.nextDouble();
		double pyung_area = m2_area/3.305;
		System.out.printf("평형으로는 %.1f 입니다.",pyung_area);			
		if (pyung_area<15){
			System.out.println("소형 입니다.");
		} else if (pyung_area>=15 && pyung_area<30){
			System.out.println("중소형 입니다.");
		} else if (pyung_area>=30 && pyung_area<50){
			System.out.println("중형 입니다.");
		} else if (pyung_area>=50){
			System.out.println("대형 입니다.");
		}
	} 
}
