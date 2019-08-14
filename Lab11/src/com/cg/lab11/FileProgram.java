package com.cg.lab11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProgram {
	public FileProgram() throws IOException {
		BufferedReader br = new BufferedReader(
				new FileReader("D:\\New\\M1\\Lab11.txt"));
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("D:\\New\\M1\\Lab11.txt"));

		ExecutorService executor = Executors.newFixedThreadPool(1);// creating a pool of 5 threads
		for (int i = 0; i < 1; i++) {
			Runnable worker = new CopyDataThread(br, bw);
			executor.execute(worker);// calling execute method of ExecutorService
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("Finished all threads");
	}
}
