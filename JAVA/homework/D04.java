import java.util.Scanner;

public class D04 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("가족이 몇 명인지 입력하세요.");
		int count_all = s.nextInt();
		int birth_year = 0;
		int i = 0;
		int count_young = 0;
		for (i=0;i<count_all;i++){
			System.out.println("태어난 년도를 입력하세요");
			birth_year = s.nextInt();
			int age = 2015 - birth_year;
			if (age<20){
				count_young += 1;
			}				
		}
		System.out.println("가족들 중에 미성년자는 모두"+count_young+"명입니다.");
	}
}