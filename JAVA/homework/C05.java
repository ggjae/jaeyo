import java.util.Scanner;

public class C05 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�.");
		int month = s.nextInt();
		System.out.print("���� �Է��Ͻÿ�.");
		int day = s.nextInt();
		if (month == 1){
			System.out.print("�� ��¥�� 1�� �� "+day+"��° ���� �ش�˴ϴ�.");
		} else if (month == 2){
			System.out.print("�� ��¥�� 1�� �� "+(day+31)+"��° ���� �ش�˴ϴ�.");
		} else if (month == 3){
			System.out.print("�� ��¥�� 1�� ��"+(day+31+28)+"��° ���� �ش�˴ϴ�.");
		} else if (month == 4){
			System.out.print("�� ��¥�� 1�� ��"+(day+31+28+31)+"��° ���� �ش�˴ϴ�.");
		} else if (month == 5){
			System.out.print("�� ��¥�� 1�� ��"+(day+31+28+31+30)+"��° ���� �ش�˴ϴ�.");
		} else if (month == 6){
			System.out.print("�� ��¥�� 1�� ��"+(day+31+28+31+30+31)+"��° ���� �ش�˴ϴ�.");
		} else if (month == 7){
			System.out.print("�� ��¥�� 1�� ��"+(day+31+28+31+30+31+30)+"��° ���� �ش�˴ϴ�.");
		} else if (month == 8){
			System.out.print("�� ��¥�� 1�� ��"+(day+31+28+31+30+31+30+31)+"��° ���� �ش�˴ϴ�.");
		} else if (month == 9){
			System.out.print("�� ��¥�� 1�� ��"+(day+31+28+31+30+31+30+31+31)+"��° ���� �ش�˴ϴ�.");
		} else if (month == 10){
			System.out.print("�� ��¥�� 1�� ��"+(day+31+28+31+30+31+30+31+31+30)+"��° ���� �ش�˴ϴ�.");
		} else if (month == 11){
			System.out.print("�� ��¥�� 1�� ��"+(day+31+28+31+30+31+30+31+31+30+31)+"��° ���� �ش�˴ϴ�.");
		} else if (month == 12){
			System.out.print("�� ��¥�� 1�� ��"+(day+31+28+31+30+31+30+31+31+30+31+30)+"��° ���� �ش�˴ϴ�.");
		}
	}
}
