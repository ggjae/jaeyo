import java.util.Scanner;

public class E05 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int mode = 0;
		int i = 0;
		int j = 0;
		int column = 0;
		System.out.println("�������� ��¸��(1: Ȧ����),(2: ¦����)�� �Է��ϼ���");
		mode = s.nextInt();
		System.out.println("�� �ٿ� ����� ������ �Է��Ͻÿ�.");
		column = s.nextInt();
		if (mode==1){
			for(i=3;i<10;i++){
				for(j=1;j<10;j++){
					System.out.printf(i+" x "+j+" = %-2d  ",i*j);
					if(j%column==0)
						System.out.println();
				}
				System.out.println();
				}
			} else if (mode==2) {
			for(i=2;i<10;i++){
				System.out.println();
				for(j=1;j<10;j++){
					System.out.printf(i+" x "+j+" = %-2d  ",i*j);
					if(j%column==0)
						System.out.println();
					}
				System.out.println();	
			}
		}
	}
}
