import java.util.Scanner;
public class B03 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("직사각형의 가로크기를 입력하시오");
		int width = s.nextInt();
		System.out.print("직사각형의 세로크기를 입력하시오");
		int height = s.nextInt();
		int area = width * height;
		System.out.println("직사각형의 널이는"+area+"입니다");
		if (width==height) {
			System.out.println("정사각형입니다.");
		} else {
			System.out.println("정사각형이 아닙니다.");
		}
	}
}
