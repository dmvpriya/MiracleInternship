import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FIS_SingleCharacter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\indra\\OneDrive\\Documents\\20VV1A1213\\Miracle java\\Day8\\files\\FOSDemo.txt");
        int i = fis.read();
        fis.close();
        System.out.println((char)i);

	}

}
