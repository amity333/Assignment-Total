package com.cg.lab11;

import java.util.Scanner;

public class RefreshThread implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				Thread.sleep(1000);
				System.out.println("Time  : " + i);
				if (i == 10) {
					i = 0;
					Scanner sc = new Scanner(System.in);
					System.out.println("Press 1 to continue timer");
					int j = sc.nextInt();
					if (j != 1) {
						sc.close();
						System.exit(0);
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
