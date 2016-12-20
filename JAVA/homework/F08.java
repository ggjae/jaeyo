import java.util.Scanner;
public class F08 {
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int number[]=new int[10];
		int newnum=0;
		int count=0;
		boolean dup=false;
		int i,j=0;
		System.out.println("1부터 100사이의 숫자를 입력하시오.");
		for(i=0;i<10;i++){
			System.out.println((i+1)+"번째 숫자를 입력하시오.");
			newnum=s.nextInt();
			count += 1;
			number[i]=newnum;
			for(j=0;j<count;j++){
				if (i!=j){
					if(number[i]!=number[j])
						dup = false;
					else if(number[i]==number[j])
						dup = true;
				}
				if(dup==true){
					System.out.println("잘못 입력하였습니다. 다시입력하세요");
					i -= 1;
					count -= 1;
					dup = false;
				}
			} 
		}
		for(i=0;i<10;i++)
			System.out.println((i+1)+"번째 숫자는"+number[i]+"입니다.");
	}
}
