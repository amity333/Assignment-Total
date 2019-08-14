package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class CopyDataThread extends Thread {
	private BufferedReader br;
	private BufferedWriter bw;

	public CopyDataThread(BufferedReader br, BufferedWriter bw) {
		this.br = br;
		this.bw = bw;
	}

	public void run() {
		try {

		char s;
		String s1;
		while ((s1 = br.readLine()) != null) {
			for (int i = 0; i < s1.length(); i++) {
				s = s1.charAt(i);
				bw.write(s);
				if (i % 10 == 0) {

					System.out.println("10 character copied ");
					Thread.sleep(500);

				}
				bw.flush();

			}
			bw.write("\n");
		}
		br.close();
		bw.close();
	}catch(IOException | InterruptedException e) {
		e.printStackTrace();
	}
	}
	
}
