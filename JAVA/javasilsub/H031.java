import java.util.Scanner;
import java.util.Random;
public class H031 {
	void run(){
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int lotto_com[] = new int[6];
		int lotto_user[] = new int[6];
		int i,j,count = 0,match_count=0;
		for(i=0;i<6;i++){
			lotto_com[i]=r.nextInt(45);
			System.out.println("원하는 "+(i+1)+"번째 로또 숫자를 입력하세요");
			lotto_user[i]=s.nextInt();
			count += 1;
			for(j=0;j<count;j++){
				if(i!=j){
					if(lotto_user[i]==lotto_user[j]){
						System.out.println("=> 잘못 입력하셨습니다.");
						i -= 1;
						count -= 1;
					}
				}
			}
		}
		for(i=0;i<6;i++){
			for(j=0;j<6;j++){
				if(lotto_com[i]==lotto_user[j]){
					match_count += 1;
				}
			}
		}
		
		System.out.printf("이번주의 로또 당첨 번호는 %d %d %d %d %d %d 입니다.",lotto_com[0],lotto_com[1],lotto_com[2],lotto_com[3],lotto_com[4],lotto_com[5]);
		System.out.println("\n일치하는 로또번호는"+match_count+"개 입니다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H031 a = new H031();
		a.run();
	}

}
