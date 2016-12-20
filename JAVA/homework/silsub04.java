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
		System.out.print("오늘 방문한 팀 수를 입력하세요.");
		team_count = s.nextInt();
		for (i=1;i<=team_count;i++){
			System.out.println(i+"번팀 인원수(초등학생, 청소년, 일반, 경로대상)를 입력하세요");
			for (j=1;j<=4;j++){
				count[j-1]=s.nextInt();
				total_count += count[j-1];
				v_count[j-1] += count[j-1];
			}
			sum = count[0]*charge[0]+count[1]*charge[1]+count[2]*charge[2]+count[3]*charge[3];
			System.out.println(i+"번팀 할인카드 종류(카드없음:0, 일반등급: 1, VIP등급 : 2)를 입력하세요.");
			membership=s.nextInt();
			if (membership==0){
				System.out.println(i+"번팀 입장료는"+sum+"입니다");
				total_sum += sum;
			} else if (membership==1){
				sum = sum*9/10;
				total_sum += sum;
				System.out.println(i+"번팀 입장료는"+sum+"입니다.");
			} else if (membership==2){
				sum = sum*8/10;
				total_sum += sum;
				System.out.println(i+"번팀 입장료는"+sum+"입니다.");
			}
		}
		
		System.out.println("오늘 방문자 총 수는"+total_count);
		System.out.println("초등학생수는"+v_count[0]);
		System.out.println("청소년 수는"+v_count[1]);
		System.out.println("일반인 수는"+v_count[2]);
		System.out.println("경로대상수는"+v_count[3]);
		System.out.println("총입장료는"+total_sum);
	}
}
