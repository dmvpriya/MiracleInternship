import java.util.*;
import java.io.*;
import java.nio.file.Files;
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("/home/training/Documents/i23M05/Day8tasks/files/FOSDemo1.txt");
		int i = 0;
		String line = Files.readAllLines(Paths.get("/home/training/Documents/i23M05/Day8tasks/files/FOSDemo1.txt")).get(i);
		System.out.println(line);

	}

}
