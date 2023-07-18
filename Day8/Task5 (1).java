import java.util.*;
import java.io.*;
public class Task5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("/home/training/Documents/i23M05/Day8tasks/files/FOSDemo1.txt");
		int count = 0;
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine())
		{
			System.out.println(sc.next());
			count++;
		}
	    System.out.println("the number of lines are :"+count);

	}

}
