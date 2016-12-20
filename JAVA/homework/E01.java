import java.util.Scanner;

public class E01 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int length = 0;
		int i = 0;
		int j = 0;
		System.out.println("정사각형의 크기를 입력하시오");
		length = s.nextInt();
		for(i=0;i<length;i++){
			for(j=0;j<length;j++){
				System.out.print("# ");
			}
			System.out.print("\n");
		}
	}
}