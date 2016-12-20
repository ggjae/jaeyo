import java.util.Scanner;

public class Student extends Person { public String phonenumber;
public String address;
public String sex;
public String name;
public String Studentnumber;

// 학번이랑 복학생을 상속받아야함
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("복학생입니까? (Y/N)");
		String a=s.next();
		String bokhak = "";
		int bokhakcnt = 0;
		if (a.equals("Y")){
			bokhakcnt += 1; 
		}
	}
}


