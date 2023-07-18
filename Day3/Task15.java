package tasksOfExcercise2;

public class Task15 {
	void primeApproach1()
	{
		int count = 0;
		int num = 5;
		for(int i = 1;i<num;i++)
		{	
			if(num%i == 0)
			{
				count ++;
			}
			
			
		}
		if(count == 0)
		{
			System.out.println("It is a prime number ");
		}
		else {
			System.out.println("It is not a prime number ");
		}
	}
	void primeApproach2()
	{
		int count = 0;
		int num = 10;
		for(int i = 2;i<num;i++)
		{	
			if(num%i == 0)
			{
				count ++;
			}
			
		}
			if(count == 0)
			{
				System.out.println("It is a prime number ");
			}
			else {
				System.out.println("It is not a prime number ");
			}
		}
	
	void primeApproach3()
	{
		int count = 0;
		int num = 10;
		for(int i = 2;i<num/2;i++)
		{	
			if(num%i == 0)
			{
				count ++;
			}
						
		}
		if(count == 0)
		{
			System.out.println("It is a prime number ");
		}
		else {
			System.out.println("It is not a prime number ");
		}
	}
	void primeApproachRange()
	{
		int count = 0;
		int num = 10;
		for(int i= 2;i<=num;i++)
		{
			count = 0;
			for(int j = 1;j<=i;j++)
			{
				if(i%j == 0)
				{
					count ++;
				}
				
			}
		
		if(count == 2)
		{
			System.out.println(i);
		}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task15 t = new Task15();
		System.out.println("Prime 1 :");
		t.primeApproach1();
		System.out.println("Prime 2 :");
		t.primeApproach2();
		System.out.println("Prime 3 :");
		t.primeApproach3();
		System.out.println("Prime range :");
		t.primeApproachRange();

	}

}
