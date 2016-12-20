import java.util.Scanner;

public class D06 {
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		double m2_area=0;
		double pyung_area =0;
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int i = 0;		
		for (i=0;i<10;i++){
			System.out.print("아파트의 분양면적을 입력하시오");
			m2_area = s.nextDouble();
			pyung_area = m2_area/3.305;
			System.out.printf("평형으로는 %.1f 입니다.\n",pyung_area);
			if (pyung_area<15){
				count1 = count1+1;
			} else if (pyung_area>=15 && pyung_area<30){
				count2 = count2+1;
			} else if (pyung_area>=30 && pyung_area<50){
				count3 = count3+1;
			} else if (pyung_area>=50){
				count4 = count4+1;
			}
		}
		System.out.println("소형아파트의 개수"+count1+"입니다");
		System.out.println("중소형아파트의 개수는"+count2+"입니다");
		System.out.println("중형의 개수는"+count3+"입니다");
		System.out.println("대형의아파트 개수는"+count4+"입니다");
	} 
}
