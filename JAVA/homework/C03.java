import java.util.Scanner;

public class C03 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("����ũ�⸦ �Է��Ͻÿ�");
		int width = s.nextInt();
		System.out.print("���� ũ�⸦ �Է��Ͻÿ�.");
		int height = s.nextInt();
		if (width==height){
			System.out.println("���簢���Դϴ�.");
		} else if (width>2*height){
			System.out.println("�¿�� ������ ���簢���Դϴ�");
		} else if (width*2>height){
			System.out.println("���Ʒ��� ������ ���簢���Դϴ�.");
		} else if (width>height){
			System.out.println("�Ϲ����� ������ ���簢���Դϴ�.");
		} else if (width<height){
			System.out.println("�Ϲ����� ������ ���簢���Դϴ�.");
		}	
	}
}
