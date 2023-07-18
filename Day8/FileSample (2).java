import java.io.File;
import java.io.IOException;

public class FileSample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f = new File("/home/training/Documents/i23M05/Day8tasks/files/SampleFile1.txt");
		if(f.createNewFile())
		{
			System.out.println("File is created");
		}
		else {
			System.out.println("File is not created");
		}
		if(f.canRead())
		{
			System.out.println("File is readable");
		}
		else {
			System.out.println("File is not readable");
		}
		if(f.canWrite())
		{
			System.out.println("File is writable");
		}
		else {
			System.out.println("File is not writable");
		}
		if(f.canExecute())
		{
			System.out.println("File is executable");
		}
		else {
			System.out.println("File is not executable");
		}
		

	}

}