import java.util.Scanner;

public class D10 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int i = 0;
		System.out.println("2개의 숫자를 입력하시오.");
		num1 = s.nextInt();
		num2 = s.nextInt();
		for (i=1;i<=100;i++){
			if(i%num1==0 && i%num2!=0){
				System.out.print(i+",");
				
			} else if (i%num1!=0 && i%num2==0){
				System.out.print(i+",");
			}
		
		}
				
	}
}