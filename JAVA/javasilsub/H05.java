import java.util.Scanner;
import java.util.Random;

public class H05 {
	void run(){
		int coins = 0;
		int number[] = new int[3];
		int dummy = 0;
		int i = 0;
		int j = 0;
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("����Ͻ� ������ ������ �Է��ϼ���.");
		coins = s.nextInt();
		for(i=1;i<=coins;i++){
			System.out.println("����"+(i)+"ȸ Start! ( �ƹ� ���ڳ� �Է��ϼ��� )");
			dummy = s.nextInt();
			
			for(j=0;j<3;j++){
				number[j] = r.nextInt(9)+1;
			}
			System.out.printf("���� ��� : %d %d %d", number[0],number[1],number[2]);
			if (number[0]!=number[1] && number[1]!=number[2] && number[0]!=number[2]){
				System.out.println("====> ���Դϴ�... �ƽ�����");
				System.out.println("�����ִ� ������"+(coins-i)+"�� �Դϴ�.");
			} else if(number[0]==number[2] && number[1] == number[2]){
				System.out.println("====> ���� 2�� ��ġ.. ���� 2�� ����");
				coins += 2;
				System.out.println("�����ִ� ������"+(coins-i)+"�� �Դϴ�.");
			} else if (number[0] == number[1] || number[0] == number[2] || number[1] == number[2]){
				System.out.println("====> ���� 1�� ��ġ.. ���� 1�� ����");
				coins += 1;
				System.out.println("�����ִ� ������"+(coins-i)+"�� �Դϴ�.");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H05 a = new H05();
		a.run();

	}

}
