package lab8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Exercise : 3

public class NumberChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int line=0;int ch = 0;int word= 0;
			int code=0;
			final String path = "D:\\Jitendra\\Jhumarkar\\source.txt";
			FileInputStream fis = new FileInputStream(path);
			while(fis.available()!=0)
			{
				code = fis.read();
				if(code!=10)  		// line feed moves cursor one value down 
				ch++;
				if(code==32) 		//32=space
				word++;

				if(code==13)		//13= return first point of the cursor
				{
					line++;
				word++;
				}
				
			}
			System.out.println("No.of characters = "+ch);
			System.out.println("No.of words = "+(word+1));
			System.out.println("No.of lines = "+(line+1));
			fis.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot find the specified file...");
		}
		catch(IOException i)
		{
			System.out.println("Cannot read file...");
		}

	}

}
