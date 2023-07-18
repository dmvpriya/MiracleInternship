import java.io.*;
public class BOS {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("/home/training/Documents/i23M05/Day8tasks/files/BOSDemo.txt");
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/home/training/Documents/i23M05/Day8tasks/files/BOSDemo1.txt"));		
		BufferedOutputStream bos1 = new BufferedOutputStream(fos);		
		bos1.write(60);
		bos1.close();
		bos.write(7);
		bos.close();
		System.out.println("Done");

	}

}
