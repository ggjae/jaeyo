import java.util.Scanner;

public class E02 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int height = 0;
		int blank = 0;
		int blank2 = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		System.out.println("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오");
		height = s.nextInt();
		blank = s.nextInt();
		
		blank2 = height + 9;
		for(i=0;i<height;i++){
			for(k=0;k<blank2;k++){
				System.out.print(" ");
			}
			blank2 -= 1;
			for(j=i;j>=0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}