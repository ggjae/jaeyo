import java.util.Scanner;
public class F09 {
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int monthdays[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int month,day=0;
		int day_count=0;
		int i = 0;
		
		System.out.print("���� �Է��Ͻÿ�.");
		month = s.nextInt();
		System.out.print("���� �Է��Ͻÿ�.");
		day = s.nextInt();
		if (month >= 13)
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		if (monthdays[month-1] <= day)
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		if(monthdays[month-1] >= day && month <= 12){
			for(i=1;i<month;i++){
				day_count += monthdays[i];
			}
			day_count += day;	
			System.out.println("�� ��¥�� 1�� ��"+day_count+"���� �ش�˴ϴ�.");
		}
	}
}
