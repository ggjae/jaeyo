import java.util.Scanner;
public class F07 {
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int number[][]=new int[5][3];
		int newnum=0;
		int total=0;
		int ho=0;
		int i,j=0;
		int floor_total[] = new int[5];
		int line_total[] = new int[3];
		for(i=0;i<5;i++){
			for(j=0;j<3;j++){
				System.out.println((i+1)+"0"+(j+1)+"ȣ�� ����ִ� ����� ���ڸ� �Է��Ͻÿ�");
				newnum=s.nextInt();
				number[i][j]=newnum;
				total += newnum;
				floor_total[i] += newnum;
				line_total[j] += newnum;
			}
		}
		for(i=0;i<5;i++)
			System.out.println((i+1)+"���� ��� �����ڴ� ���"+floor_total[i]+"���Դϴ�.");
		for(j=0;j<3;j++)
			System.out.println((j+1)+"ȣ ���ο� ��� �����ڴ� ���"+line_total[j]+"���Դϴ�.");
		System.out.println("�� ����Ʈ�� ��� �����ڴ� ���"+total+" ���Դϴ�.");
	}
}