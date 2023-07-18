package tasks;

public class TryInsideTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20,b = 0;
		int arr[] = new int[30];		
		String s = "abc";

		try {
		    System.out.println("try");
		    System.out.println(a/b);
		try {
			System.out.println("try1");
		    System.out.println(arr[55]);
		try {
			System.out.println("try1");

			System.out.println(Integer.parseInt(s));
		}
		catch(Exception e3)
		{
			System.out.println("Exception");

			System.out.println(e3);
		}
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println(e1);
			
		}
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
			System.out.println(e);
		}
		
		
		System.out.println("Done");


	}

}
