import java.util.Scanner;

public class B07 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("���Ͽ뷮�� �ް�����Ʈ ������ �Է��Ͻÿ�");
		int megabytes = s.nextInt();
		long bytes = megabytes*1024L*1024L;
		System.out.println("USB��Ʈ�� 2.0�̸� Y, �ƴϸ� N�� �Է��ϼ���");
		String usb2 = s.next();
		int time;
		if (usb2.equals("Y")){
			time = (int) (bytes/60000000L);
			System.out.println("���� ���۽ð���"+time+"�� �Դϴ�");
		} if (usb2.equals("N")){
			time = (int) (bytes/1500000L);
			System.out.println("���� ���۽ð���"+time+"�� �Դϴ�");
		}
	}
}
