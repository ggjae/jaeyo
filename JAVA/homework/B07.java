import java.util.Scanner;

public class B07 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("파일용량을 메가바이트 단위로 입력하시오");
		int megabytes = s.nextInt();
		long bytes = megabytes*1024L*1024L;
		System.out.println("USB포트가 2.0이면 Y, 아니면 N을 입력하세요");
		String usb2 = s.next();
		int time;
		if (usb2.equals("Y")){
			time = (int) (bytes/60000000L);
			System.out.println("파일 전송시간은"+time+"초 입니다");
		} if (usb2.equals("N")){
			time = (int) (bytes/1500000L);
			System.out.println("파일 전송시간은"+time+"초 입니다");
		}
	}
}
