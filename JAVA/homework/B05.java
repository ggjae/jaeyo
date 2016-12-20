import java.util.Scanner;

public class B05 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("날수를 입력하시오");
		int days = s.nextInt();
		int seconds = days * 24 * 60 * 60;
		System.out.print("날수에 해당되는 초는"+seconds+"입니다");	
		if (seconds>1000000) {
			int m_count = seconds/1000000;
			System.out.println("\n100만초가 모두"+m_count+"번이나 포함됩니다.");
		}
	}
}
