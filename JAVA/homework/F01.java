import java.util.Scanner;

public class F01 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int num[] = new int[10];
		int first = 0;
		int second = 0;
		int second_max_index = 0;
		int first_max_index = 0;
		int newnum = 0;
		int a = 0;
		int i = 0;
		for(i=0;i<10;i++){
			System.out.println((i+1)+"��° ���� �Է��Ͻÿ�.");
			newnum=s.nextInt();
			num[i]=newnum;
			if(num[i]>second){
				if(num[i]>first){
					second=first;
					first= num[i];					
					second_max_index=first_max_index;
					first_max_index=(i);
				}
				else{
					second=num[i];
					second_max_index=(i);
				}
				
			}
			
		}
		System.out.println("�ι����� ū ���� "+(second_max_index+1)+"��° �� "+second+"�Դϴ�");
		
	}
}