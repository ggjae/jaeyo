import java.util.Scanner;

public class E03 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int height = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int a = 0;
		System.out.println("직각 삼각형의 높이를 입력하시오");
		height = s.nextInt();
		a = height - 1;
		for(i=0;i<height;i++){
			for(j=0;j<a;j++){
				System.out.print(" ");
			}
			a -= 1;
			for(k=2*i-1;k>0;k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}