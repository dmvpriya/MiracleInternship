import java.io.*;
public class BOS {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("/home/training/Documents/i23M05/Day8tasks/files/BOSDemo.txt");
		//BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/home/training/Documents/i23M05/Day8tasks/files/BOSDemo1.txt"));another representation		
		BufferedOutputStream bos1 = new BufferedOutputStream(fos);		
		String s = "Vishnu";
		bos1.write(s.getBytes());
		bos1.flush();
		
		System.out.println("Done");

	}

}
