package lab8;

//Exercise 4:

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String path = "D:\\Jitendra\\Jhumarkar\\source.txt";

		File f = new File("D:\\Jitendra\\Jhumarkar\\source.txt");
		String name = f.getAbsolutePath();
		String extension = name.substring(name.lastIndexOf("."));
		int count = 0, ch = 0;
		try {
			FileInputStream fis = new FileInputStream(path);
			while (fis.available() != 0) {
				count = fis.read();
				if (count != 10)
					ch++;

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		if (f.exists())
			System.out.println("The file exists");
		if (f.exists() == false)
			System.out.println("File doesot exist");
		if (f.canRead())
			System.out.println("File can be read");
		if (f.canRead() == false)
			System.out.println("File cant be read");
		if (f.canWrite())
			System.out.println("File can be written");
		if (f.canWrite() == false)
			System.out.println("File cant be written");
		System.out.println("Extension:"+extension);
		System.out.println("Number of characters:"+ch);

	}

}
