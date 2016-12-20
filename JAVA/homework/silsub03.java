import java.util.Scanner;

public class silsub03 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int bmilist[][] = new int[10][3];
		int height = 0;
		int weight = 0;
		int count = 0;
		double bmi = 0;
		int i = 0;
		for(i=1;i<=10;i++){
			System.out.print(i+"번째 사람의 신장과 체중을 입력하시오");
			height = s.nextInt();
			weight = s.nextInt();
			bmi = weight / (((double) height/100)*((double) height/100));
			bmilist[i-1][0]=height;
			bmilist[i-1][1]=weight;
			bmilist[i-1][2]=(int) bmi;
			if(bmi>=25){
				count += 1;
			}
		}
		for(i=1;i<=10;i++){
			if(bmilist[i-1][2]>=25){
				System.out.println(i+"번째 사람은 비만입니다.");
			}
		}
		System.out.println("총"+count+"명의 사람이 비만입니다..");
	}
}
		