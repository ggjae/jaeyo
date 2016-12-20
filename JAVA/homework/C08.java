import java.util.Scanner;

public class C08 {
	public static void main(String[] args){
		Scanner s1 = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하시오");
		int num1 = s1.nextInt();
		System.out.print("두번째 숫자를 입력하시오");
		int num2 = s1.nextInt();
		System.out.print("세번째 숫자를 입력하시오");
		int num3 = s1.nextInt();
		int max_num, min_num;
		if(num1>num2){
			max_num=num1;
			min_num=num2;
		}
		else{ // if와 else로 먼저 num1과 num2를 비교해 맥스넘 민넘을 초기화해줌.
			max_num=num2;
			min_num=num1;
		}
		//앞의 큰 값과 세 번째 값 비교
		if(max_num<num3){
		max_num=num3;
		} else if(min_num>num3){
		min_num=num3;
		}
		System.out.print("가장큰수는"+max_num+"이고, 가장 작은수는"+min_num+"입니다.");
	}
}