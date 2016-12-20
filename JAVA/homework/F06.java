import java.util.Scanner;
public class F06 {
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int number[][]=new int[5][3];
		int newnum=0;
		int total=0;
		int ho=0;
		int i,j=0;
		for(i=0;i<5;i++){
			for(j=0;j<3;j++){
				System.out.println((i+1)+"0"+(j+1)+"호에 살고있는 사람의 숫자를 입력하시오");
				newnum=s.nextInt();
				number[i][j]=newnum;
				total += newnum;
			}
		}
		System.out.println("이 아파트에 사는 거주자는 모두"+total+" 명입니다.");
	}
}
