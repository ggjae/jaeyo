import java.util.Scanner;

public class D02 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int max_num = 0;
		int min_num = 100;
		int number = 0;
		while (true){
			System.out.println("0���� 100 ������ ���ڸ� �Է��ϼ���.");
			number = s.nextInt();
			if (number>=0 && 100>=number){
				if (max_num<number){
					max_num=number;
				} else if (min_num>number){
					min_num=number;
				}
			} else{
			System.out.println("�Էµ� ���ڵ� �� ���� ū ���� "+max_num+" �̰�, ���� ���� ����"+min_num+"�Դϴ�.");				
			break;
			}
		}
	}
}