
import java.util.*;
public class Task4 {
	void Conversion(String s)
	{
		String s1[] = s.split(" ");
		String s3 = "";
		for(String s2:s1)
		{
			
			s3 = s3 + s2.substring(0,1).toUpperCase()+s2.substring(1)+" ";
			
		}
		System.out.println(s3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s = sc.nextLine();
		System.out.println("The String is :"+s);
		Task4 t = new Task4();
		t.Conversion(s);
		
		
	}

}
