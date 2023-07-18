import java.io.*;
import java.util.*;
public class Task2 {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		FileInputStream text = new FileInputStream("/home/training/Documents/i23M05/Day8tasks/files/FOSDemo1.txt");
		Scanner sc = new Scanner(text,"UTF-8");
		int i = 1;
		while(sc.hasNextLine())
		{
			String line  = sc.nextLine();
			System.out.println("line "+ i +" "+ line);
			i++;
		}

	}

}