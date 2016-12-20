import java.util.Scanner;

public class E05 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int mode = 0;
		int i = 0;
		int j = 0;
		int column = 0;
		System.out.println("구구단의 출력모드(1: 홀수형),(2: 짝수형)를 입력하세요");
		mode = s.nextInt();
		System.out.println("한 줄에 출력할 개수를 입력하시오.");
		column = s.nextInt();
		if (mode==1){
			for(i=3;i<10;i++){
				for(j=1;j<10;j++){
					System.out.printf(i+" x "+j+" = %-2d  ",i*j);
					if(j%column==0)
						System.out.println();
				}
				System.out.println();
				}
			} else if (mode==2) {
			for(i=2;i<10;i++){
				System.out.println();
				for(j=1;j<10;j++){
					System.out.printf(i+" x "+j+" = %-2d  ",i*j);
					if(j%column==0)
						System.out.println();
					}
				System.out.println();	
			}
		}
	}
}
