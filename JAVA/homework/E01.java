import java.util.Scanner;

public class E01 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int length = 0;
		int i = 0;
		int j = 0;
		System.out.println("���簢���� ũ�⸦ �Է��Ͻÿ�");
		length = s.nextInt();
		for(i=0;i<length;i++){
			for(j=0;j<length;j++){
				System.out.print("# ");
			}
			System.out.print("\n");
		}
	}
}