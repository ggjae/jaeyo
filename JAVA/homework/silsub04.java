import java.util.Scanner;

public class silsub04 {

	
	public static void main(String[] args){
		int team_count;
		int charge[]={5000,10000,15000,3000};
		int count[]=new int[4];
		int v_count[]=new int[4];
		int total_count = 0;
		int sum = 0;
		int total_sum=0;
		int membership=0;
		int i=0;
		int j=0;
		Scanner s = new Scanner(System.in);
		System.out.print("���� �湮�� �� ���� �Է��ϼ���.");
		team_count = s.nextInt();
		for (i=1;i<=team_count;i++){
			System.out.println(i+"���� �ο���(�ʵ��л�, û�ҳ�, �Ϲ�, ��δ��)�� �Է��ϼ���");
			for (j=1;j<=4;j++){
				count[j-1]=s.nextInt();
				total_count += count[j-1];
				v_count[j-1] += count[j-1];
			}
			sum = count[0]*charge[0]+count[1]*charge[1]+count[2]*charge[2]+count[3]*charge[3];
			System.out.println(i+"���� ����ī�� ����(ī�����:0, �Ϲݵ��: 1, VIP��� : 2)�� �Է��ϼ���.");
			membership=s.nextInt();
			if (membership==0){
				System.out.println(i+"���� ������"+sum+"�Դϴ�");
				total_sum += sum;
			} else if (membership==1){
				sum = sum*9/10;
				total_sum += sum;
				System.out.println(i+"���� ������"+sum+"�Դϴ�.");
			} else if (membership==2){
				sum = sum*8/10;
				total_sum += sum;
				System.out.println(i+"���� ������"+sum+"�Դϴ�.");
			}
		}
		
		System.out.println("���� �湮�� �� ����"+total_count);
		System.out.println("�ʵ��л�����"+v_count[0]);
		System.out.println("û�ҳ� ����"+v_count[1]);
		System.out.println("�Ϲ��� ����"+v_count[2]);
		System.out.println("��δ�����"+v_count[3]);
		System.out.println("��������"+total_sum);
	}
}
