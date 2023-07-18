package tasks;

public class ThrowE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0,j = 2;
		int result = 0;
		try {
			result = i-j;
			if(result<=0)
			{
				throw new Exception("The result is zero");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
