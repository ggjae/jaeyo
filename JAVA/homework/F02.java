import java.util.Scanner;

public class F02 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		double score[] = new double[10];
		double maxscore = 0;
		double minscore = 10;
		double total = 0;
		double average = 0;
		double newnum = 0;
		int i = 0;
		for (i=0;i<10;i++){
			System.out.println((i+1)+"�� �ɻ������� �Է��Ͻÿ�");
			newnum=s.nextDouble();
			score[i]=newnum;
			if (score[i]>maxscore){
				maxscore=score[i];	3
			}
			if (score[i]<minscore){
				minscore=score[i];
			}
			total += score[i];
		}
		System.out.println(total);
		System.out.println(maxscore);
		System.out.println(minscore);
		average=((total-maxscore-minscore)/8);
		System.out.println("���� ū ������ ���� ���� ������ ������ 8���� ������ ���� �����"+average+"�Դϴ�");
	}
}