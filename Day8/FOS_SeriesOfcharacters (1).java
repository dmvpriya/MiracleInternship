import java.io.FileOutputStream;
import java.io.IOException;
public class FOS_SeriesOfcharacters {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("/home/training/Documents/i23M05/Day8tasks/files/FOSDemo1.txt",true);
		String s = "Java";
		byte b[] = s.getBytes();
		String s1 = "this is files program";
		fos.write(b);
		fos.write(s1.getBytes());
		fos.close();
		
		System.out.println("done");

	}

}
