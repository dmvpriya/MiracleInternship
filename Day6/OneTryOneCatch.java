package tasks;

public class OneTryOneCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20,b = 0;
		int arr[] = new int[30];		
		String s = "abc";
		
		try {
			System.out.println("try");
		System.out.println(a/b);
		System.out.println(arr[55]);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Done");


	}

}
