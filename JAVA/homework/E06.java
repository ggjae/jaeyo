import java.util.Scanner;

public class E06 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int rows = 0;
		int columns = 0;
		int j = 0;
		int i = 0;
		int number = 0;
		
		System.out.println("출력하려는 행의 크기와 열의 크기를 입력하시오");
		rows = s.nextInt();
		columns = s.nextInt();
		for(i=1;i<=rows;i++){
			for(j=1;j<=columns;j++){
				System.out.printf("%4d",i*j);
			}
			System.out.println();
		}
	}
}
		
