package ex2;

import java.util.Scanner;

public class Timer extends Thread{
	Timer(){
		start();
	}
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				Thread.sleep(1000);
				System.out.println("Time: "+i);
				if(i==10) {
					i=0;
					Scanner sc=new Scanner(System.in);
							System.out.println("press 1 to continue timer ");
					int j=sc.nextInt();
					if(j!=1) {
						sc.close();
						System.exit(0);
					}
				}
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer t=new Timer();
	}
}

