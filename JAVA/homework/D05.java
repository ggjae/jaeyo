import java.util.Scanner;

public class D05 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		while (true){
			System.out.print("���簢�� ���� ũ��� ���� ũ�⸦ �Է��Ͻÿ�.");
			int width = s.nextInt();
			int height = s.nextInt();
			if (width>0 && height>0){
				if (width==height){
					count1=count1+1;
				} else if (width>2*height){
					count2=count2+1;
				} else if (width*2>height){
					count3=count3+1;
				} else if (width>height){
					count4=count4+1;
				} else if (width<height){
					count5=count5+1;
				}
			}
			else{
				System.out.println("���簢���� ������"+count1+"�Դϴ�");
				System.out.println("�¿�� ������ �簢���� ������"+count2+"�Դϴ�");
				System.out.println("���Ʒ��� ������ �簢���� ������"+count3+"�Դϴ�");
				System.out.println("�Ϲ����� ������ ���簢���� ������"+count4+"�Դϴ�");
				System.out.println("�Ϲ����� ������ ���簢���� ������"+count5+"�Դϴ�");
				break;
			}
		}
	}
}
