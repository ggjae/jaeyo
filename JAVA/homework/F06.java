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
				System.out.println((i+1)+"0"+(j+1)+"ȣ�� ����ִ� ����� ���ڸ� �Է��Ͻÿ�");
				newnum=s.nextInt();
				number[i][j]=newnum;
				total += newnum;
			}
		}
		System.out.println("�� ����Ʈ�� ��� �����ڴ� ���"+total+" ���Դϴ�.");
	}
}
