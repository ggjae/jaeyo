import java.util.Scanner;

public class B08 {
	public static void main(String[] args){
		Scanner s1 = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ�");
		int num1 = s1.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�");
		int num2 = s1.nextInt();
		System.out.print("����° ���ڸ� �Է��Ͻÿ�");
		int num3 = s1.nextInt();
		if ((num1==num2) || (num1==num3) || (num2==num3)) {
			System.out.println("1�� ���� ����: 3���� ���� �� ��� ��� �� ���� ���� ����.");
		} if (((num1>50) && (num2>50)) || ((num1>50) && (num3>50)) || ((num2>50) && (num3>50))){
			System.out.println("2�� ���� ����: 3���� ���� �� ��� �μ��� ũ�Ⱑ ��� 50���� ũ��");
		} if ((num1+num2==num3) || (num1+num3==num2) || (num2+num3==num1)){
			System.out.println("3�� ���� ����: 3���� ���� �� � �μ��� ���� ������ �ϳ��� ���ڿ� ����");
		} if ((num1%num2==0) || (num1%num3==0) || (num2%num3==0)){
			System.out.println("4�� ���� ����: 3���� ���� �� � �ϳ��� ���� �ٸ� �μ��� ������ ������ �������� ��찡 �ִ�");
		}	
	}
}