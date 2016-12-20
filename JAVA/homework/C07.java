import java.util.Scanner;

public class C07 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("파일용량을 메가바이트 단위로 입력하시오");
		int megabytes = s.nextInt();
		long bytes = megabytes*1024L*1024L;
		System.out.print("전송방식을 1:Wi-Fi, 2: BlueTooth, 3:LTE, 4: USB에서 선택하여 입력하세요");
		byte kind = s.nextByte();
		double time;
		if (kind == 1){
			time = (double) bytes/1500000;
			System.out.printf("파일 전송시간은 %.1f 입니다.",time);
		} else if (kind == 2){
			time = (double) bytes/300000;
			System.out.printf("파일 전송시간은 %.1f 입니다.",time);
		} else if (kind == 3){
			time = (double) bytes/1000000; 
			System.out.printf("파일 전송시간은 %.1f 입니다.",time);
		} else if (kind == 4){
			time = (double) bytes/60000000;
			System.out.printf("파일 전송시간은 %.1f 입니다.",time);
		}
	}
}
