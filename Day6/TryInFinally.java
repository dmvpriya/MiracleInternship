package tasks;

public class TryInFinally {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		int arr[] = new int[50];
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				System.out.println("Try");
				System.out.println(arr[90]);
			}
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println(e1);
			}
			System.out.println("Exception occured");
		}
		

	}

}
