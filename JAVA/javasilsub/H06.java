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
		System.out.println("2���� 9������ ���� 5���� �Է��ϼ���");
		number[0] = s.nextInt();
		number[1] = s.nextInt();
		number[2] = s.nextInt();
		number[3] = s.nextInt();
		number[4] = s.nextInt();
		System.out.println("�Է��� 5���� ���� �������� �����");
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
		System.out.println("���� ū ���� "+max_a+"��"+max_b+"����"+max+" �Դϴ�.");
		System.out.println("���� ���� ���� "+min_a+"��"+min_b+"����"+min+" �Դϴ�.");
	}
	public static void main(String[] args){
		H06 a = new H06();
		a.run();
	}
}
