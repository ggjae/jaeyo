import java.util.Scanner;

public class C04 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("����Ʈ�� �о������ �Է��Ͻÿ�");
		double m2_area = s.nextDouble();
		double pyung_area = m2_area/3.305;
		System.out.printf("�������δ� %.1f �Դϴ�.",pyung_area);			
		if (pyung_area<15){
			System.out.println("���� �Դϴ�.");
		} else if (pyung_area>=15 && pyung_area<30){
			System.out.println("�߼��� �Դϴ�.");
		} else if (pyung_area>=30 && pyung_area<50){
			System.out.println("���� �Դϴ�.");
		} else if (pyung_area>=50){
			System.out.println("���� �Դϴ�.");
		}
	} 
}
