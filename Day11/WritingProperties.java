import java.io.*;
import java.util.Properties;
public class WritingProperties {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("/home/training/Documents/i23M05/Day8tasks/files/FOSDemo3.properties");
		Properties p = new Properties();
		p.setProperty("java", "ABC");
		p.setProperty("Program", "BCD");
		try {
			p.store(fos, "PropertyClassE");

		}catch(IOException e)
		{
			System.out.println(e);
		}
		
		

	}

}
