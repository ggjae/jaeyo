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
			System.out.println("����(1), ����(2), ��(3)�� �Է��ϼ���.");
			my_finger = s.nextInt();
			System.out.println("��ǻ�Ͱ� ������ "+com_finger+"�Դϴ�.");
			if(com_finger==my_finger){
				System.out.println("========> ���~");
				score[0][1] += 1;
				score[1][1] += 1;
			}
			else if(com_finger>my_finger){
				if(com_finger==3){
					if(my_finger==1){
						System.out.println("=====> ����� ��!");
						score[0][2] += 1;
						score[1][0] += 1;	
					} else if(my_finger==2){
						System.out.println("======> ��ǻ�� ��!");
						score[0][0] += 1;
						score[1][2] += 1;
					}
					
				} else if(com_finger==2){
					if(my_finger==1){
						System.out.println("=====> ��ǻ�� ��!");
						score[0][0] += 1;
						score[1][2] += 1;	
					} else if(my_finger==3){
						System.out.println("======> ����� ��!");
						score[0][2] += 1;
						score[1][0] += 1;
					}
				} else if(com_finger==1){
					if(my_finger==2){
						System.out.println("=====> ����� ��!");
						score[0][2] += 1;
						score[1][0] += 1;	
					} else if(my_finger==3){
						System.out.println("======> ��ǻ�� ��!");
						score[0][0] += 1;
						score[1][2] += 1;
					}
				}
					
			}
			if(my_finger == 0)
				break;
		} 
		System.out.println("��ǻ��: �̱�Ƚ����"+score[0][0]+" ��� Ƚ����"+score[0][1]+" �� Ƚ����"+score[0][2]);
		System.out.println("�����: �̱�Ƚ����"+score[1][0]+" ��� Ƚ����"+score[1][1]+" �� Ƚ����"+score[1][2]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H041 a = new H041();
		a.run();

	}

}
