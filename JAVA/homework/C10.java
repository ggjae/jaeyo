import java.util.Scanner;

public class C10 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("����1�� �Է��ϼ���");
		int num1 = s.nextInt();
		System.out.print("����2�� �Է��ϼ���");
		int num2 = s.nextInt();
		System.out.print("�����ȣ����('+','-','*','/' �� 1��)�� �Է��ϼ���");
		String operator = s.next();
		int result = 0;
		if (operator.equals("+")){
			result = num1+num2;
		} else if (operator.equals("-")){
			result = num1-num2;
		} else if (operator.equals("*")){
			result = num1*num2;
		} else if (operator.equals("/")){
			result = num1/num2;
		}
		System.out.print("������ ��� ����"+result+"�Դϴ�.");
	}
}