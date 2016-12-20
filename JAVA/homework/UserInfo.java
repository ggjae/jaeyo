import java.util.Scanner;

public class UserInfo {
	
	void input(){
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("등록할 학생의 명수는? ");
		num = s.nextInt();
		String user_list[][] = new String[num][2];
		for(int i=0;i<num;i++){
			System.out.printf("%d번 학생의 아이디, 비밀번호를 입력하시오 —> ",i+1);
			user_list[i][0]= s.next();
			
			user_list[i][1]= s.next();
			
		}
		System.out.print("====================\n");
		print(num,user_list);
		
	}
	void print(int num,String user_list[][]){
		System.out.printf("등록된 %d명의 학생 목록은 다음과 같습니다.\n",num);
		System.out.print("——————————\n");
		System.out.print("번호 아이디\t\t비밀번호\n");
		for(int i=0;i<num;i++){
			System.out.printf("%d  %s\t\t%s\n",i+1,user_list[i][0],user_list[i][1]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		UserInfo t= new UserInfo();
		t.input();
	}

}