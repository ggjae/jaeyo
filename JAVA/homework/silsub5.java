import java.util.Scanner;
import java.io.*;
import java.util.regex.*;

public class silsub5 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String input="";
		String findStr="";
		String replaceStr="";
		int count = 0;
		int i = 0;
		while (true){
			System.out.println("���ڿ��� �Է��Ͻÿ�.(x: ����)");
			input=s.nextLine();
			if (input.equals("x")){
				System.out.println("����Ǿ����ϴ�.");
				break;
			} else {
				System.out.println("ã�� ���ڿ��� �Է��ϼ���");
				findStr=s.nextLine();
				System.out.println("�ٲ� ���ڿ��� �Է��ϼ���.");
				replaceStr=s.nextLine();
				while (input.lastIndexOf(findStr) != (-1)){
					input = input.replaceFirst(findStr,replaceStr);
					count += 1;
				}
				System.out.println(input);
				System.out.println(count+"�� �ٲ�����ϴ�.");
			}
		}
					

	}
}
