import java.util.Scanner;

public class C08 {
	public static void main(String[] args){
		Scanner s1 = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ�");
		int num1 = s1.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�");
		int num2 = s1.nextInt();
		System.out.print("����° ���ڸ� �Է��Ͻÿ�");
		int num3 = s1.nextInt();
		int max_num, min_num;
		if(num1>num2){
			max_num=num1;
			min_num=num2;
		}
		else{ // if�� else�� ���� num1�� num2�� ���� �ƽ��� �γ��� �ʱ�ȭ����.
			max_num=num2;
			min_num=num1;
		}
		//���� ū ���� �� ��° �� ��
		if(max_num<num3){
		max_num=num3;
		} else if(min_num>num3){
		min_num=num3;
		}
		System.out.print("����ū����"+max_num+"�̰�, ���� ��������"+min_num+"�Դϴ�.");
	}
}