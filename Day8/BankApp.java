import java.io.*;
import java.util.*;
class WithDraw extends Exception
{
	public WithDraw(String s)
	{
		super(s);
	}
}
class Deposit extends Exception
{
	public Deposit(String s)
	{
		super(s);
	}
}
class NoUser extends Exception
{
	public NoUser(String s)
	{
		super(s);
	}
}
public class BankApp {
    int UserVerification(String Un,String Up)
	{
		String UName = "XXX";
		String UPassword = "***";
		try {
		if(Un.equals(UName))
		{
			if(Up.equals(UPassword))
			{
				System.out.println("The User exists");
				return 1;
			}
			else {
				System.out.println("Incorrect Password");
				return 0;
			}
		}
		else {
			throw new NoUser("No user exists");
		}
		}
		catch(NoUser e)
		{
			System.out.println(e);
			return -1;
		}
	}
	void DepositToBank(String Uname,String Upassword,int amount)
	{
		int a = UserVerification(Uname, Upassword);
		int ABalance = 1000;
		try {
		if(a>=0)
		{
			ABalance += amount;
			System.out.println("Amount deposited \n Total the amount present in the bank is :"+ABalance);
		}
		else {
			throw new WithDraw("User does not exist");
		}
		}
		catch(WithDraw e1)
		{
			System.out.println(e1);
		}
		
	}
	void WithDrawFromBank(String Uname,String Upassword,int amount)
	{
		int a = UserVerification(Uname, Upassword);
		int ABalance = 1000;
		try {
		if(a>=0)
		{
			if(amount<ABalance)
			{
			ABalance += amount;
			System.out.println("Amount deposited \n Total the amount present in the bank is :"+ABalance);
			}
			else
			{
				System.out.println("Amount cannot be withdrawn \n Balance is :"+ABalance);
			}
		}
		else {
			throw new WithDraw("User does not exist");
		}
		}
		catch(WithDraw e1)
		{
			System.out.println(e1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String UserName = sc.nextLine();
		String UserPassword = sc.nextLine();
		BankApp b = new BankApp();
		System.out.println("Select the operation :\n 1) User Verification \n 2) Withdrawal \n 3) Deposition");
        int in = sc.nextInt();
        switch(in)
        {
        case 1:
        	b.UserVerification(UserName, UserPassword);
        	break;
        case 2:
        	System.out.println("Enter amount to withdraw :");
        	int a1 = sc.nextInt();
        	b.WithDrawFromBank(UserName, UserPassword, a1);
        	break;
        case 3:
        	System.out.println("Enter amount to deposit :");
        	int a2 = sc.nextInt();
        	b.DepositToBank(UserName, UserPassword, a2);
        	break;
        default:
        	System.out.println("Invalid choice");
        		
        		
        }
        
	}

}
