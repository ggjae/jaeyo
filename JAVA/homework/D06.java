import java.util.Scanner;

public class D06 {
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		double m2_area=0;
		double pyung_area =0;
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int i = 0;		
		for (i=0;i<10;i++){
			System.out.print("����Ʈ�� �о������ �Է��Ͻÿ�");
			m2_area = s.nextDouble();
			pyung_area = m2_area/3.305;
			System.out.printf("�������δ� %.1f �Դϴ�.\n",pyung_area);
			if (pyung_area<15){
				count1 = count1+1;
			} else if (pyung_area>=15 && pyung_area<30){
				count2 = count2+1;
			} else if (pyung_area>=30 && pyung_area<50){
				count3 = count3+1;
			} else if (pyung_area>=50){
				count4 = count4+1;
			}
		}
		System.out.println("��������Ʈ�� ����"+count1+"�Դϴ�");
		System.out.println("�߼�������Ʈ�� ������"+count2+"�Դϴ�");
		System.out.println("������ ������"+count3+"�Դϴ�");
		System.out.println("�����Ǿ���Ʈ ������"+count4+"�Դϴ�");
	} 
}
