import java.util.Scanner;
public class F08 {
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int number[]=new int[10];
		int newnum=0;
		int count=0;
		boolean dup=false;
		int i,j=0;
		System.out.println("1���� 100������ ���ڸ� �Է��Ͻÿ�.");
		for(i=0;i<10;i++){
			System.out.println((i+1)+"��° ���ڸ� �Է��Ͻÿ�.");
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
					System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ��Է��ϼ���");
					i -= 1;
					count -= 1;
					dup = false;
				}
			} 
		}
		for(i=0;i<10;i++)
			System.out.println((i+1)+"��° ���ڴ�"+number[i]+"�Դϴ�.");
	}
}
