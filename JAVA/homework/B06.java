import java.util.Scanner;

public class B06 {
	public static void main(String[] args){
		Scanner s1 = new Scanner(System.in);
		System.out.print("국어점수를 입력하시오");
		int kor = s1.nextInt();
		System.out.print("영어점수를 입력하시오");
		int eng = s1.nextInt();
		System.out.print("수학점수를 입력하시오");
		int math = s1.nextInt();
		int total = math+kor+eng;
		System.out.println("총점은"+total+"입니다");
		double average = total/  3D;
		System.out.printf("평균은 %.1f 입니다",average);			
		if(kor>90) {
			System.out.println("\n국어점수가 우수합니다.");
		} if (eng>90){
			System.out.println("영어점수가 우수합니다.");
		} if (math>90){
			System.out.println("수학점수가 우수합니다.");
		}
	}
}

