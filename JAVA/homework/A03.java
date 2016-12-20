import java.util.Scanner;

public class A03 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("직사각형의 가로높이는?");
		int width = s.nextInt();
		System.out.print("직사각형의 세로높이는?");
		int height = s.nextInt();
		int area = width * height;
		System.out.print("직사각형의 널이는"+area+"입니다");			
	}
}
