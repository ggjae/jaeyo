import java.util.Scanner;
import java.util.Random;
public class H041 {
	void run(){
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int com_finger = 5;
		int my_finger = 5;
		int score[][] = new int[2][3];
		int i,j = 0;
		while (true){
			com_finger = r.nextInt(3)+1;
			System.out.println("가위(1), 바위(2), 보(3)를 입력하세요.");
			my_finger = s.nextInt();
			System.out.println("컴퓨터가 낸것은 "+com_finger+"입니다.");
			if(com_finger==my_finger){
				System.out.println("========> 비김~");
				score[0][1] += 1;
				score[1][1] += 1;
			}
			else if(com_finger>my_finger){
				if(com_finger==3){
					if(my_finger==1){
						System.out.println("=====> 사용자 승!");
						score[0][2] += 1;
						score[1][0] += 1;	
					} else if(my_finger==2){
						System.out.println("======> 컴퓨터 승!");
						score[0][0] += 1;
						score[1][2] += 1;
					}
					
				} else if(com_finger==2){
					if(my_finger==1){
						System.out.println("=====> 컴퓨터 승!");
						score[0][0] += 1;
						score[1][2] += 1;	
					} else if(my_finger==3){
						System.out.println("======> 사용자 승!");
						score[0][2] += 1;
						score[1][0] += 1;
					}
				} else if(com_finger==1){
					if(my_finger==2){
						System.out.println("=====> 사용자 승!");
						score[0][2] += 1;
						score[1][0] += 1;	
					} else if(my_finger==3){
						System.out.println("======> 컴퓨터 승!");
						score[0][0] += 1;
						score[1][2] += 1;
					}
				}
					
			}
			if(my_finger == 0)
				break;
		} 
		System.out.println("컴퓨터: 이긴횟수는"+score[0][0]+" 비긴 횟수는"+score[0][1]+" 진 횟수는"+score[0][2]);
		System.out.println("사용자: 이긴횟수는"+score[1][0]+" 비긴 횟수는"+score[1][1]+" 진 횟수는"+score[1][2]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H041 a = new H041();
		a.run();

	}

}
