import java.util.Scanner;

public class A06 {
	public static void main(String[] args){
		Scanner s1 = new Scanner(System.in);
		System.out.print("���������� �Է��Ͻÿ�");
		int kor = s1.nextInt();
		System.out.print("���������� �Է��Ͻÿ�");
		int eng = s1.nextInt();
		System.out.print("���������� �Է��Ͻÿ�");
		int math = s1.nextInt();
		int total = math+kor+eng;
		System.out.println("������"+total+"�Դϴ�");
		double average = total/  3D;
		System.out.printf("����� %.1f �Դϴ�",average);			
	}
}

