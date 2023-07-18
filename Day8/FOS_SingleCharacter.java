import java.io.FileOutputStream;
import java.io.IOException;
public class FOS_SingleCharacter {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:\\Users\\indra\\OneDrive\\Documents\\20VV1A1213\\Miracle java\\Day8\\files\\FOSDemo.txt");
        fos.write(54);
        fos.close();
        System.out.println("Done");

	}

}
