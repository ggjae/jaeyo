import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class MainClient {
	static String a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Socket c_socket = new Socket("127.0.0.1", 8888);
			Scanner s = new Scanner(System.in);
			
			System.out.println("Client Start!");
			OutputStream out = c_socket.getOutputStream();
			OutputStreamWriter osw  = new OutputStreamWriter(out);
			PrintWriter bw = new PrintWriter(c_socket.getOutputStream());
			String a;
			while(true){
				a = s.nextLine();
				if(a==null) break;
				System.out.println("input: "+a);
				System.out.println("echo from server:"+ a);
				
				bw.println(a);
				bw.flush();
			}
				
			bw.close();
			osw.close();
			out.close();
			c_socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
