import java.util.Scanner;

public class H06 {
	void run(){
		Scanner s = new Scanner(System.in);
		int number[] = new int[5];
		int pow_value[][] = new int[5][5];
		int max=0,min=100000000;
		int max_a=0,max_b=0;
		int min_a=0,min_b=0;
		int i,j=0;
		int previ=0;
		int next =0;
		System.out.println("2에서 9사이의 숫자 5개를 입력하세요");
		number[0] = s.nextInt();
		number[1] = s.nextInt();
		number[2] = s.nextInt();
		number[3] = s.nextInt();
		number[4] = s.nextInt();
		System.out.println("입력한 5개의 수로 제곱수를 만들면");
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				pow_value[i][j]=(int)(Math.pow(number[i], number[j]));
			}
		} 
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				if (i!=j){
					if (pow_value[i][j]>max){
						max = pow_value[i][j];
						max_a = number[i];
						max_b = number[j];
					} if(pow_value[i][j]<min){
						min = pow_value[i][j];
						min_a = number[i];
						min_b = number[j];
					}
				} else if(i == j)
					continue;
			}
		}
		System.out.println("가장 큰 수는 "+max_a+"의"+max_b+"승인"+max+" 입니다.");
		System.out.println("가장 작은 수는 "+min_a+"의"+min_b+"승인"+min+" 입니다.");
	}
	public static void main(String[] args){
		H06 a = new H06();
		a.run();
	}
}
