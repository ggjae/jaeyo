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
			System.out.println((i+1)+"�� �л� ����, ����, ���� ������ �Է��Ͻÿ�");
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
		System.out.printf("���������� "+sum[0]+"�̰� ����� %.1f�Դϴ�\n",average[0]);
		System.out.printf("���������� "+sum[1]+"�̰� ����� %.1f�Դϴ�\n",average[1]);
		System.out.printf("���������� "+sum[2]+"�̰� ����� %.1f�Դϴ�\n",average[2]);
	}
}