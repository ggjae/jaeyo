import java.util.Scanner;

public class B09 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�(CM)");
		int height = s.nextInt();
		System.out.print("ü���� �Է��Ͻÿ�(kg)");
		int weight = s.nextInt();
		int bmi = weight / (height/100*height/100);
		System.out.println(bmi);
		if (bmi>=25){
			System.out.println("����� ���Դϴ�.");
		} else {
			System.out.println("����� ���� �ƴմϴ�.");
		}		
	}
}