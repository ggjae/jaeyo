import java.util.Scanner;
public class SY {
	void run(){
		Scanner s = new Scanner(System.in);
		String make1 = " ";
		String make2 = " ";
		String make3 = " ";
		String make4 = " ";
		String make5 = " ";
		System.out.println("소연아 언제와");
		make1 = s.nextLine();
		if(make1.equals("나 열시반에 끝나")){
			System.out.println("ㅠㅠ 나 심심ㅁ해");
		}
		System.out.println("열시반이야 누나!");
		make2 = s.nextLine();
		System.out.println("ㅠㅠ 누나 자지마");
		System.out.println("박재용과 윤소연의카톡일상");
		
	}
	public static void main(String[] args){
		SY a = new SY();
		a.run();
	}

}
