import java.util.Scanner;
public class HIJIMIN {

	public static void main(String[] args) {
		String make = " ";
		String make1 = " ";
		Scanner s = new Scanner(System.in);
		
		
		while (true){
			System.out.println("ID를 입력하세요");
			make = s.next();
			if(make.equals("재용")){
				System.out.println("비밀번호를 입력하세요.");
				make1 = s.next();
				if(make1.equals("지민"))
				System.out.println("지민아 힘내 벌써 밤 아홉시야!");
				break;
			}
			
		}
		// TODO Auto-generated method stub

	}

}
