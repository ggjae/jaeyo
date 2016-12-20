import java.util.Random;
import java.util.Scanner;

public class H021 {
	void run(){
		int lotto[] = new int[6];
		int count=0;
		String onemore=" ";
		int i = 0 ;
		Random b = new Random();
		Scanner s = new Scanner(System.in);
		for(i=0;i<6;i++){
			lotto[i] = b.nextInt(45)+1;
		}
		System.out.printf("생성된 로또 번호는%d %d %d %d %d %d \n",lotto[0],lotto[1],lotto[2],lotto[3],lotto[4],lotto[5]);
		System.out.print("더 만드시겠습니까?");
		onemore=s.next();
		if(onemore.equals("Y")){
			run();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H021 a = new H021();
		a.run();
	}

}
