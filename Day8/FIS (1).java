import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
public class FIS {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f = new File("/home/training/Documents/i23M05/Day8tasks/files/FOSDemo1.txt");
		FileInputStream fis = new FileInputStream(f);
		int i = 0;
		while((i = fis.read())!= -1)
		{
			System.out.println("A "+(char)i);
			i++;
		}
//		byte []b = new byte[1024];
//		fis.read(b);
//		for(int j = 0;j<b.length;j++)
//		{
//			System.out.print("B "+(char)b[j]);
//		}
//		fis.close();
		
		System.out.println("done");

	}

}
