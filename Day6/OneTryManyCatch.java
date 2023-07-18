package tasks;

public class OneTryManyCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20,b = 0;
		int arr[] = new int[30];		
		String s = "abc";
		
		try {
		System.out.println("try");
		System.out.println(a/b);
		System.out.println(arr[55]);
		System.out.println(Integer.parseInt(s));
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println(e1);
			
		}
		catch(Exception e3)
		{
			System.out.println("Exception");

			System.out.println(e3);
		}
		
		System.out.println("Done");


	}

}
