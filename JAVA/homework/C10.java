import java.util.Scanner;

public class C10 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("숫자1을 입력하세요");
		int num1 = s.nextInt();
		System.out.print("숫자2을 입력하세요");
		int num2 = s.nextInt();
		System.out.print("연산기호문자('+','-','*','/' 중 1개)를 입력하세요");
		String operator = s.next();
		int result = 0;
		if (operator.equals("+")){
			result = num1+num2;
		} else if (operator.equals("-")){
			result = num1-num2;
		} else if (operator.equals("*")){
			result = num1*num2;
		} else if (operator.equals("/")){
			result = num1/num2;
		}
		System.out.print("계산식의 결과 값은"+result+"입니다.");
	}
}