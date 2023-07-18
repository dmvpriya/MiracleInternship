import java.io.*;
import java.util.*;
public class Task3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("/home/training/Documents/i23M05/Day8tasks/files/FOSDemo1.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while((st = br.readLine())!= null)
		{
			System.out.println(st);
		}
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	}

}
