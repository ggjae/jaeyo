import java.util.Scanner;

public class C07 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("���Ͽ뷮�� �ް�����Ʈ ������ �Է��Ͻÿ�");
		int megabytes = s.nextInt();
		long bytes = megabytes*1024L*1024L;
		System.out.print("���۹���� 1:Wi-Fi, 2: BlueTooth, 3:LTE, 4: USB���� �����Ͽ� �Է��ϼ���");
		byte kind = s.nextByte();
		double time;
		if (kind == 1){
			time = (double) bytes/1500000;
			System.out.printf("���� ���۽ð��� %.1f �Դϴ�.",time);
		} else if (kind == 2){
			time = (double) bytes/300000;
			System.out.printf("���� ���۽ð��� %.1f �Դϴ�.",time);
		} else if (kind == 3){
			time = (double) bytes/1000000; 
			System.out.printf("���� ���۽ð��� %.1f �Դϴ�.",time);
		} else if (kind == 4){
			time = (double) bytes/60000000;
			System.out.printf("���� ���۽ð��� %.1f �Դϴ�.",time);
		}
	}
}
