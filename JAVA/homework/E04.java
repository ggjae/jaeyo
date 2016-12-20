import java.util.Scanner;

public class E04 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int mode = 0;
		int i = 0;
		int j = 0;
		System.out.println("구구단의 출력모드(1: 홀수형),(2: 짝수형)를 입력하세요");
		mode = s.nextInt();
		if (mode==1){
			for(i=3;i<10;i++){
				System.out.println();
				if(i%2==1){
					for(j=1;j<10;j++){
						System.out.printf(i+" x "+j+" = %-2d  ",i*j);
					if(j==3 || j==6 || j==9){
						System.out.println();
					}
					}
				}
			}
		} else if (mode==2){
			for(i=2;i<10;i++){
				System.out.println();
				if(i%2==0){
					for(j=1;j<10;j++){
						System.out.printf(i+" x "+j+" = %-2d  ",i*j);
					if(j==3 || j==6 || j==9){
						System.out.println();
					}
					}
				}
			}
			
		}
	}
}