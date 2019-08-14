package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {
	public FileProgram() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("D:\\Jitendra\\Jhumarkar\\source.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Jitendra\\Jhumarkar\\target.txt"));

		CopyDataThread c = new CopyDataThread(br, bw);
		c.start();
	}

}
