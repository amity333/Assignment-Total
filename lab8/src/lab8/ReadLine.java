package lab8;
//: Exercise 2

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str=null;
		final String path = "D:\\Jitendra\\Jhumarkar\\source.txt";
		try {
			int lineNo = 1;
			FileReader fr=new FileReader(path);
			BufferedReader br=new BufferedReader(fr);
			while((str = br.readLine()) !=null) {
				System.out.println(lineNo+" "+str);
				lineNo++;
			}
			
			
		}catch(FileNotFoundException e) {
			
		}
	}

}
