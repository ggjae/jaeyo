import java.util.Scanner;

public class D03 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int number = 0;
		int count=0;
		int totalsum = 0;
		double average = 0;
		while (true){
			System.out.println("0���� 100 ������ ���ڸ� �Է��ϼ���.");
			number = s.nextInt();
			if (number>=0 && 100>=number){
				totalsum = totalsum+number;
				count=count+1;
				average = (double) totalsum/count;
			} else{
			break;
			}
		}
		System.out.println("�Էµ�"+count+"���� ���ڵ��� �� �հ��"+totalsum+" �̰�, �����"+average+"�Դϴ�.");
	}
}