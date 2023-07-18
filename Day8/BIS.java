import java.util.*;
import java.io.*;
public class BIS {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("/home/training/Documents/i23M05/Day8tasks/files/FOSDemo1.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int i = 0;
		while((i = bis.read())!=-1)
		{
			System.out.println((char)i);
			i++;
		}

	}

}
