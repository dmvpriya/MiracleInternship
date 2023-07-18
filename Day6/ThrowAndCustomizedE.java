package tasks;

class Trail extends Exception
{
	public Trail(String string)
	{
		super(string);
	}
}

public class ThrowAndCustomizedE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0,j = 2;
		int result = 0;
		try {
			result = i-j;
			if(result<=0)
			{
				throw new Trail("The result is undefined");
			}
		}
		catch(Trail e)
		{
			System.out.println(e);
		}
		

	}

}
