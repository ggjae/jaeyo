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
			System.out.println("���ϴ� "+(i+1)+"��° �ζ� ���ڸ� �Է��ϼ���");
			lotto_user[i]=s.nextInt();
			count += 1;
			for(j=0;j<count;j++){
				if(i!=j){
					if(lotto_user[i]==lotto_user[j]){
						System.out.println("=> �߸� �Է��ϼ̽��ϴ�.");
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
		
		System.out.printf("�̹����� �ζ� ��÷ ��ȣ�� %d %d %d %d %d %d �Դϴ�.",lotto_com[0],lotto_com[1],lotto_com[2],lotto_com[3],lotto_com[4],lotto_com[5]);
		System.out.println("\n��ġ�ϴ� �ζǹ�ȣ��"+match_count+"�� �Դϴ�.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H031 a = new H031();
		a.run();
	}

}
