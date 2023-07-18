package tasks;
import java.util.*;
public class SampleTryCatch {

	void ArithmeticE(int a,int b)
	{
		try {
			System.out.println("performing division :");
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("performed");
	}
	void NullPointerE(String s)
	{
		try {
			System.out.println("Length of string is :");
			System.out.println(s.length());
		}
		catch(NullPointerException e1)
		{
			System.out.println(e1);
		}
		System.out.println("performed");
	}
	void NumberFormatE(String s)
	{
		try {
			System.out.println("Number formatting is :");
			System.out.println(Integer.parseInt(s));
		}
		catch(NumberFormatException e2)
		{
			System.out.println(e2);
		}
		System.out.println("performed");
	}
	void ArrayOutOfBoundE(int arr[])
	{
		try {
			System.out.println("array is :");
			System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e3)
		{
			System.out.println(e3);
		}
		System.out.println("performed");
	}
	void StringOutOfBoundE(String s)
	{
		try {
			System.out.println("String is :");
			System.out.println(s.charAt(s.length()+1));
		}
		catch(StringIndexOutOfBoundsException e3)
		{
			System.out.println(e3);
		}
		System.out.println("performed");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.nextLine();
		int arr[] = new int[10];
		SampleTryCatch stc = new SampleTryCatch();
		stc.ArithmeticE(a, b);
		stc.NullPointerE(s);
		stc.NumberFormatE(s);
		stc.ArrayOutOfBoundE(arr);
		stc.StringOutOfBoundE(s);
		

	}

}
