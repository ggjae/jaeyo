import java.util.Scanner;

public class F05 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int height=0;int weight=0;int bmilist[][]=new int[10][3];int count=0;
		int i =0;int j=0;int bmi=0;
		for(i=0;i<10;i++){
			System.out.println((i+1)+"번째 사람의 신장과 체중을 입력하시오");
			height=s.nextInt();
			weight=s.nextInt();
			bmi = (int) ((double) weight / ((double) height/100) * ((double) (height)/100));
			bmilist[i][0]=height;
			bmilist[i][1]=weight;
			bmilist[i][2]=bmi;
			System.out.println(bmi+" "+weight+" "+height);
		
		}
		for(j=0;j<10;j++){
			if (bmilist[j][2]>=25){
				System.out.println(bmi);
				System.out.println((j+1)+"번째 사람은 비만입니다.");
			}
		}
	}
}