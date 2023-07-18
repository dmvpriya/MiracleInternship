import java.io.*;
import java.util.*;
public class ReadingProperties {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("/home/training/Documents/i23M05/Day8tasks/files/FOSDemo3.properties");
		Properties p1 = new Properties();
		p1.load(fis);
//		Properties prop = System.getProperties();
//		Set <String>keys = prop.stringPropertyNames();
//		for(String key:keys)
//		{
//			System.out.println(key);
//			String value = prop.getProperty(key);
//			System.out.println(value);
//		}
		Enumeration e1 = p1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		String a = p1.getProperty("java");
		String b = p1.getProperty("Program");
		System.out.println(a+" "+b);

	}

}
