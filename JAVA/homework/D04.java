import java.util.Scanner;

public class D04 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("������ �� ������ �Է��ϼ���.");
		int count_all = s.nextInt();
		int birth_year = 0;
		int i = 0;
		int count_young = 0;
		for (i=0;i<count_all;i++){
			System.out.println("�¾ �⵵�� �Է��ϼ���");
			birth_year = s.nextInt();
			int age = 2015 - birth_year;
			if (age<20){
				count_young += 1;
			}				
		}
		System.out.println("������ �߿� �̼����ڴ� ���"+count_young+"���Դϴ�.");
	}
}