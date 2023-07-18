package Tasks;

import java.io.*;
import java.sql.*;
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
class Transfer extends Exception
{
	public Transfer(String s)
	{
		super(s);
	}
}
class TimeOut extends Exception
{
	public TimeOut(String s)
	{
		super(s);
	}
}
public class BankAppJDBC {
    int UserVerification(long AccNumber,String Un,String Up,Connection c) throws SQLException
	{
    	Connection c1 = c;
    	PreparedStatement ps =c1.prepareStatement("Select AccName,AccPassword from BankDB");
    	ResultSet rs = ps.executeQuery();
    	rs.next();    	
    	String UName = rs.getString(1);
    	String UPassword = rs.getString(2);
    	Scanner sc1 = null;
    	int count = 0;
		
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
	void DepositToBank(String Uname,String Upassword,int amount,long AccNumber,Connection c) throws SQLException
	{
		Connection c1 = c;
		PreparedStatement ps;
		Scanner sc;
		int a = UserVerification( AccNumber,Uname, Upassword,c1);
		int ABalance = 1000;
		try {
		if(a>=0)
		{
			ABalance += amount;
			System.out.println("Amount deposited \n Total the amount present in the bank is :"+ABalance);
			ps = c.prepareStatement("update BankDB set AccBalance = ? where AccName = ? and AccPassword = ?");
			ps.setInt(1, ABalance);
			ps.setString(2, Uname);
			ps.setString(3, Upassword);
			ps.executeUpdate();
			ps = c.prepareStatement("select * from BankDB");			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getLong(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getInt(5));
			}
			
		}
		else {
			throw new Deposit("User does not exist");
		}
		}
		catch(Deposit e1)
		{
			System.out.println(e1);
		}
		
	}
	void WithDrawFromBank(String Uname,String Upassword,int amount,long AccNumber,Connection c) throws SQLException
	{
		Connection c1 = c ;
		PreparedStatement ps;
		Scanner sc;
		int a = UserVerification(AccNumber,Uname, Upassword,c1);
		int ABalance = 1000;
		try {
		if(a>=0)
		{
			if(amount<ABalance)
			{
			ABalance -= amount;
			System.out.println("Amount Withdraw \n Total the amount present in the bank is :"+ABalance);
			ps = c1.prepareStatement("update BankDB set AccBalance = ? where AccName = ? and AccPassword = ?");
			ps.setInt(1, ABalance);
			ps.setString(2, Uname);
			ps.setString(3, Upassword);			
			ps.executeUpdate();
			ps = c.prepareStatement("select * from BankDB");			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getLong(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getInt(5));
			}
			}
			else
			{
				System.out.println("Amount cannot be withdrawn \n Balance is :"+ABalance);
				throw new WithDraw("WithDraw not possible");
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
	boolean validate(long AccNumber,Connection c) throws SQLException
	{
		Connection c1 = c;
		PreparedStatement ps = c.prepareStatement("select * from BankDB");
		ResultSet rs = ps.executeQuery();
		rs.next();
		if(AccNumber == rs.getLong(1)) {
			System.out.println("User exists");
			return true;
		}
		return false;
		
	}
	void Transfer(String uname,String upassword,String uname1,String upassword1,long AccNumber,Connection c) throws SQLException
	{
		Connection c1 = c;
		PreparedStatement ps = c1.prepareStatement("select * from BankDB");
		ResultSet rs = ps.executeQuery();
		rs.next();
		Scanner sc = new Scanner(System.in);
		
		int AccBalance;
		int a = UserVerification(AccNumber,uname,upassword,c1);
		
		
		try {
			if(a>=0)
			{
				System.out.println("Enter the account number where amount need to credited");
				long b1= sc.nextLong();
				System.out.println("Enter the account number where amount need to debited");
				long b2= sc.nextLong();
				if(validate(b1,c))
				{
					ps = c.prepareStatement("select * from BankDB where AccName = '"+uname+"' and AccPassword = '"+upassword+"'");			
					rs = ps.executeQuery();
					rs.next();
					int bal1 = rs.getInt(5);
					ps = c.prepareStatement("select * from BankDB where AccName = '"+uname1+"' and AccPassword = '"+upassword1+"'");			
					rs = ps.executeQuery();
					rs.next();
					int bal2 = rs.getInt(5);
					System.out.println("Enter the amount to transfer");
					int amount = sc.nextInt();	
					
				    if(bal2>bal1)
				    {
				    	bal2 -=amount;
				    	bal1 +=amount;				    	
				    	ps = c.prepareStatement("update BankDB set AccBalance = '"+bal1+"' where AccNumber = '"+b1+"';");
				    	ps.executeUpdate();
				    	ps= c.prepareStatement("update BankDB set AccBalance = '"+bal2+"' where AccNumber = '"+b2+"';");
				    	ps.executeUpdate();
				    	ps = c.prepareStatement("select * from BankDB");
				    	System.out.println("test");
				    	ResultSet rs1 = ps.executeQuery();
				    	rs.next();
				    	
				    	while(rs1.next())
				    	{
				    		System.out.println(rs1.getLong(1)+" "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getString(4)+" "+rs1.getInt(5));
				    	}

				    }					
					
				}else {
					throw new Transfer("Did not validate");
				}				
			}
		}
		catch(Transfer e1)
		{
			System.out.println(e1);
		}

	}
	
	static void exit() {
		System.exit(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter username");
		String UserName = sc.nextLine();
		System.out.println("Enter password");
		String UserPassword = sc.nextLine();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/College","root","Vishnu@13");
			PreparedStatement ps;		
		BankAppJDBC b = new BankAppJDBC();
		System.out.println("Select the operation :\n 1) User Verification \n 2) Withdrawal \n 3) Deposition \n 4)Balance \n 5)Transfer \n 6)Exit");
        int in = sc.nextInt();
        System.out.println("Enter account number :");
        long AccNo = sc.nextLong();
        switch(in)
        {
        case 1:
        	int count = 0;
        	while(count<3) {
        		
        		int check = b.UserVerification(AccNo,UserName, UserPassword,c);
                if(check==1) {
       
                	break;
                }
                count++;
                System.out.println("Enter username");
        		UserName = sc1.nextLine();
        		System.out.println("Enter password");
        		UserPassword = sc1.nextLine();
        	}
        	if(count==3) {
        		try {
        			throw new TimeOut("To many tries");
        		}
        		catch(TimeOut e) {
        			System.out.println(e);
        			System.exit(0);
        		}
        	}
        	break;
        case 2:
        	System.out.println("Enter amount to withdraw :");
        	int a1 = sc.nextInt();
        	b.WithDrawFromBank(UserName, UserPassword, a1, AccNo,c);
        	break;
        case 3:
        	System.out.println("Enter amount to deposit :");
        	int a2 = sc.nextInt();
        	b.DepositToBank(UserName,UserPassword,a2, AccNo,c);
        	break;
        case 4:
        	System.out.println("Balance");
        	ps = c.prepareStatement("select * from BankDB where AccNumber = ? and AccName = ?");
        	ps.setLong(1, AccNo);
        	ps.setString(2, UserName);
        	ResultSet rs = ps.executeQuery();
        	while(rs.next())
        	{
        		int balance = rs.getInt(5);
        		System.out.println("Balance is :"+balance);
        	}
        	
        case 5:
        	Scanner sc2 = new Scanner(System.in);
        	System.out.println("Transfer");
        	System.out.println("Enter the other username :");
        	String uname1 = sc2.nextLine();
        	System.out.println("Enter the other userpassword :");
        	String upassword1 = sc2.nextLine();
        	b.Transfer(UserName, UserPassword, uname1, upassword1, AccNo, c);
        	break;
        case 6:
        	exit();
        	break;
        default:
        	System.out.println("Invalid choice");
        }
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}
        		
        		
        }
        
	}


