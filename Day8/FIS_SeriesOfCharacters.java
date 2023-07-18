import java.io.*;
public class FIS_SeriesOfCharacters {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\indra\\OneDrive\\Documents\\20VV1A1213\\Miracle java\\Day8\\files\\FOSDemo1.txt");
		int i = 0;
		while((i = fis.read())!= -1)
		{
			System.out.println((char)i);
		}
		
		System.out.println("done");

	}
}