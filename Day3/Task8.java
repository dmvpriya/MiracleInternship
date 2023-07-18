package tasksOfExcercise2;
import java.util.*;
public class Task8 {
int MenuDrivenCalculator(int i,int a,int b) {	
		
		int temp = 0;
		if(i == 1)
		{
			temp = a+b;
			System.out.println(temp);			
		}
		else if(temp == 2)
		{
			temp = a-b;
			System.out.println(temp);
		}
		else if(i == 3)
		{
			temp = a*b;
			System.out.println(temp);
		}
		else if(i == 4)
		{
			temp = a/b;
			System.out.println(temp);
		}
		else if(i == 5)
		{
			temp = a%b;
			System.out.println(temp);
		}
		else if(i == 6)
		{
			System.out.println("Exit..");
			System.exit(0);
		}
		else {
			System.out.println("Invalid");
			temp = -1;
			System.out.println(temp);
		}
		
		
       return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("enter the choice of the operations :\n 1)ADD \n 2)SUBTRACT \n 3)MULTIPLY \n 4)DIVISION \n 5)MODULO");
		int i = sc.nextInt();
		int a,b;
		if(i >=6)
		{
			a = 0;
			b = 0;
		}
		else
		{
			System.out.println("Enter a and b");
			 a = sc.nextInt();
			 b = sc.nextInt();
		}
		Task8 t = new Task8();
		t.MenuDrivenCalculator(i,a,b);
		}
		
	}

}
