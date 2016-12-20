import java.util.Scanner;

public class F03 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int jumsu[][] = new int[5][3];
		int sum[] = new int[3];
		double average[] = new double[3];
		int kor=0;int eng=0;int mat=0;
		int i=0;int j=0;
		for(i=0;i<5;i++){
			System.out.println((i+1)+"번 학생 국어, 영어, 수학 점수를 입력하시오");
			kor=s.nextInt();
			eng=s.nextInt();
			mat=s.nextInt();
			jumsu[i][0]=kor;
			jumsu[i][1]=eng;
			jumsu[i][2]=mat;
			for(j=0;j<3;j++){
				sum[j]+=jumsu[i][j];
			}
		} for(i=0;i<3;i++){
			average[i]=((double) sum[i]/5);
		}
		System.out.printf("국어의총점 "+sum[0]+"이고 평균은 %.1f입니다\n",average[0]);
		System.out.printf("영어의총점 "+sum[1]+"이고 평균은 %.1f입니다\n",average[1]);
		System.out.printf("수학의총점 "+sum[2]+"이고 평균은 %.1f입니다\n",average[2]);
	}
}