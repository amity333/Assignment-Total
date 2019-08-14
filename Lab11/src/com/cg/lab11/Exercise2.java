package com.cg.lab11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise2 {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Runnable refreshthread = new RefreshThread();
		executor.execute(refreshthread);
	}
}
