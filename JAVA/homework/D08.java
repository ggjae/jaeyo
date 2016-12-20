import java.util.Scanner;

public class D08 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int x_begin = 0;
		int x_end = 0;
		int x = 0;
		int y = 0;
		int i = 0;
		System.out.print("1차 함수 y=ax^2+bx+c의 계수 a와 b와 c를 입력하시오.");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		System.out.print("x좌표의 시작 값과 끝 값을 입력하시오.");
		x_begin = s.nextInt();
		x_end = s.nextInt();
		for (i=x_begin;i<=x_end;i++){
			y = a*i*i + b*i + c;
			System.out.println("좌표 ("+i+","+y+")");
		}
	}
}