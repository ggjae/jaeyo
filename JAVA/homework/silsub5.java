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
			System.out.println("문자열을 입력하시오.(x: 종료)");
			input=s.nextLine();
			if (input.equals("x")){
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("찾을 문자열을 입력하세요");
				findStr=s.nextLine();
				System.out.println("바꿀 문자열을 입력하세요.");
				replaceStr=s.nextLine();
				while (input.lastIndexOf(findStr) != (-1)){
					input = input.replaceFirst(findStr,replaceStr);
					count += 1;
				}
				System.out.println(input);
				System.out.println(count+"번 바뀌었습니다.");
			}
		}
					

	}
}
