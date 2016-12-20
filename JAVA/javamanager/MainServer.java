import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.*;


public class MainServer {
	public static void main(String[] args){
		try{
			ServerSocket s_socket = new ServerSocket(8888);
			Socket c_socket = s_socket.accept();
			InputStream input_data = c_socket.getInputStream();
			System.out.println("Server start!");
			InputStreamReader isr = new InputStreamReader(input_data);
			BufferedReader br = new BufferedReader(isr);
			
			while(true){
				String a = br.readLine();
				if(a.equals("exit")){
					break;
				}
				System.out.println("echo: "+ a);
			}
			br.close();
			isr.close();
			c_socket.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}