import java.util.Scanner;
public class FAMILY {

	public static void main(String[] args) {
		String make[] = new String[5];
		Scanner s = new Scanner(System.in);
		
		
		for(int i=0 ; i<5 ; i ++){
			System.out.println("가족 구성원 이름을 입력하세요");
			make[i] = s.next();
			System.out.println("입력되었습니다.");
			
		}
		System.out.println("어 우리가족이잖아!");
		System.out.println("나래누나 : 여름이도 있잖아ㅋㅋ");
		System.out.printf("%s %s %s %s %s 박여름",make[0],make[1],make[2],make[3],make[4]);
		// TODO Auto-generated method stub

	}

}