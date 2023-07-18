package tasks;
import java.util.*;
public class PrintStackTraceM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		try {
			System.out.println(arr[20]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
      	}
		System.out.println("Done");
		

}
}
