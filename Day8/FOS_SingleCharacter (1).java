import java.io.FileOutputStream;
import java.io.IOException;
public class FOS_SingleCharacter {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("/home/training/Documents/i23M05/Day8tasks/files/FOSDemo.txt");
        fos.write(54);
        fos.close();
        System.out.println("Done");

	}

}
