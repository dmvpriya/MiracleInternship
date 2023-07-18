package tasks;

public class SampleFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Exception occured");
		}
		

	}

}
