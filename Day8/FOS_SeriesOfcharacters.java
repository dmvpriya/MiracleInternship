import java.io.FileOutputStream;
import java.io.IOException;
public class FOS_SeriesOfcharacters {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:\\Users\\indra\\OneDrive\\Documents\\20VV1A1213\\Miracle java\\Day8\\files\\FOSDemo1.txt",true);
		String s = "Java program";
		String s1 = "python program";
		String s2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin faucibus augue urna, quis finibus velit commodo id. Pellentesque ac ante dui. Etiam pellentesque lacinia tortor, sed semper massa lobortis ut. Nunc eget elit neque. Donec vitae ex elit. Proin tristique venenatis neque, vitae faucibus mi semper ac. Suspendisse eget ante massa.";
		
		byte b[] = s.getBytes();
		fos.write(b);
		fos.write(s1.getBytes());
		fos.write(s2.getBytes());
		fos.close();
		
		System.out.println("done");

	}

}
