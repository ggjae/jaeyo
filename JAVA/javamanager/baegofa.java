import java.awt.*;
import javax.swing.*;
public class baegofa{
	   public static void main(String args[]){
	      int t1[] = {1,2,3,4,5,6,7,8};
	      int t2[] = {10,20,30,40,50};
	      int t3[] = {100,200,300};
	      
	      Thread th1 = new WorkerThread(t1);
	      Thread th2 = new WorkerThread(t2);
	      Thread th3 = new WorkerThread(t3);
	      
	      th1.start();
	      th2.start();
	      th3.start();
	   }
	}

class WorkerThread extends Thread{
	int[] n;
	WorkerThread(int[] n){
		this.n = n;
	}
	public void run(){
		for(int i=0; this.n.length>i; i++){System.out.println(this.n[i]);
		try {
			sleep(1000);
		} catch (InterruptedException e){}
		}
    }
}