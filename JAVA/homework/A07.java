import java.util.Scanner;

public class A07 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("���Ͽ뷮�� �Ⱑ����Ʈ ������ �Է��Ͻÿ�");
		int gigabytes = s.nextInt();
		int megabytes = gigabytes*1024;
		int kilobytes = megabytes*1024;
		long bytes = kilobytes*1024L;
		System.out.println("�Է��Ͻ� ���� �뷮��");
		System.out.println(megabytes+" �ް�����Ʈ");
		System.out.println(kilobytes+" ų�ι���Ʈ");
		System.out.println(bytes+" ����Ʈ �Դϴ�.");
	}
}
