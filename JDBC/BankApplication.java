package Tasks;
import java.io.*;
import java.util.*;
import java.sql.*;
class Deposit extends Exception
{
	public Deposit(String s)
	{
		super(s);
	}
}
class WithDraw extends Exception
{
	public WithDraw(String s)
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
class Balance extends Exception
{
	public Balance(String s)
	{
		super(s);
	}
}

public class BankApplication {
	int UserVerification(String uname,String upassword,Connection c) throws SQLException
	{
		Connection c1 = c;
		String UN,UP;
		PreparedStatement ps = c1.prepareStatement("select * from BankDB where AccNumber= ?");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the account number:");
		long AccNo = sc1.nextLong();
		ps.setLong(1, AccNo);
		ResultSet rs = ps.executeQuery();
		rs.next();
		UN = rs.getString(2);
		UP = rs.getString(3);
		if(uname.equals(UN))
		{
			if(upassword.equals(UP))
			{
				System.out.println("User exists");
				return 1;
			}
			else {
				System.out.println("Incorrect password");
				return 0;
				
			}
		}
		else {
			try {
				throw new NoUser("No user exists");
			}catch(NoUser e)
			{
				e.printStackTrace();
				return -1;
			}
		}
		
		
	}
	void Deposit(long AccNumber,Connection c) throws SQLException
	{
		
		Connection c1 = c;
		PreparedStatement ps = c1.prepareStatement("select * from BankDB where AccName= ?");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the username:");
		String uname = sc1.nextLine();
		ps.setString(1, uname);
		ResultSet rs = ps.executeQuery();
		rs.next();
		long Accno = rs.getLong(1);
		if(Accno == AccNumber)
		{
		
				System.out.println("Enter the amount to deposit");
				int amt = sc1.nextInt();
				int bal = rs.getInt(5);
				bal+=amt;
				ps = c1.prepareStatement("update BankDB set AccBalance = '"+bal+"'where AccNumber = '"+Accno+"'");
				ps.executeUpdate();
				ps = c1.prepareStatement("select * from BankDB");
				rs = ps.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getLong(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
					System.out.println(" ");
				}
			}
		else {
			System.out.println("No match");
			try {
				throw new Deposit("Cannot found");
			}
			catch(Deposit e)
			{
				e.printStackTrace();
			}
		}
			
		
	}
	void WithDraw(long AccNumber,Connection c) throws SQLException
	{
		Connection c1 = c;
		PreparedStatement ps = c1.prepareStatement("select * from BankDB where AccName= ?");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the username:");
		String uname = sc1.nextLine();
		ps.setString(1, uname);
		ResultSet rs = ps.executeQuery();
		rs.next();
		long Accno = rs.getLong(1);
		if(Accno == AccNumber)
		{
		
				System.out.println("Enter the amount to withdraw");
				int amt = sc1.nextInt();
				int bal = rs.getInt(5);
				if(amt<bal) {
				bal-=amt;
				ps = c1.prepareStatement("update BankDB set AccBalance = '"+bal+"'where AccNumber = '"+Accno+"'");
				ps.executeUpdate();
				ps = c1.prepareStatement("select * from BankDB");
				rs = ps.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getLong(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
					System.out.println(" ");
				}
				}else {
					System.out.println("Cannot Withdraw");
					try {
						throw new WithDraw("Amount cannot withdraw");
					}
					catch(WithDraw e)
					{
						e.printStackTrace();
					}
				}
			}
		else {
			System.out.println("No match");
			try {
				throw new WithDraw("Mismatched");
			}
			catch(WithDraw e)
			{
				e.printStackTrace();
			}
		}
	}
	void Balance(long AccNumber,Connection c) throws SQLException
	{
		Connection c1 = c;
		PreparedStatement ps = c1.prepareStatement("select * from BankDB where AccName= ?");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the username:");
		String uname = sc1.nextLine();
		ps.setString(1, uname);
		ResultSet rs = ps.executeQuery();
		rs.next();
		long Accno = rs.getLong(1);
		if(Accno == AccNumber)
		{
			int Balance = rs.getInt(5);
			System.out.println("Balance amount in '"+uname+"' is:"+Balance);
		}else {
			System.out.println("Account mismatch");
			try {
				throw new Balance("Mismatched");
			}
			catch(Balance e)
			{
				e.printStackTrace();
			}
		}
	}
	void Transfer(long AccNumber,Connection c) throws SQLException
	{
		Connection c1 = c;
		PreparedStatement ps = c1.prepareStatement("select * from BankDB where AccName= ?");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the username:");
		String uname = sc1.nextLine();
		ps.setString(1, uname);
		ResultSet rs = ps.executeQuery();
		rs.next();
		long Accno = rs.getLong(1);
		int bal1 = rs.getInt(5);
		if(Accno == AccNumber)
		{
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter other account number to withdraw");
			long accno2 = sc2.nextLong();
			ps = c1.prepareStatement("select * from BankDB where AccName= ?");
			System.out.println("Enter the other username:");
			uname = sc1.nextLine();
			ps.setString(1, uname);
			rs = ps.executeQuery();
			rs.next();
			long Accno1 = rs.getLong(1);
			if(accno2 == Accno1) {
				System.out.println("Enter the amount to transfer");
				int amt = sc1.nextInt();
				int bal = rs.getInt(5);
				if(bal>bal1 && amt<bal) {
				bal-=amt;
				bal1+=amt;
				ps = c1.prepareStatement("update BankDB set AccBalance = '"+bal+"'where AccNumber = '"+Accno1+"'");
				ps.executeUpdate();
				ps = c1.prepareStatement("update BankDB set AccBalance = '"+bal1+"'where AccNumber = '"+Accno+"'");
				ps.executeUpdate();
				ps = c1.prepareStatement("select * from BankDB");
				rs = ps.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getLong(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
					System.out.println(" ");
				}
				}else {
					System.out.println("Account mismatch");
					try {
						throw new Balance("Mismatched");
					}
					catch(Balance e)
					{
						e.printStackTrace();
					}
				}
				
			}else {
				System.out.println("No match");
				try {
					throw new Transfer("Cannot found");
				}
				catch(Transfer e)
				{
					e.printStackTrace();
				}
			}
	}
		else {
			System.out.println("No match");
			try {
				throw new Transfer("Cannot found");
			}
			catch(Transfer e)
			{
				e.printStackTrace();
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankApplication b = new BankApplication();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Vishnu@13");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the choice\n1)User verification\n2)Deposit\n3)WithDraw\n4)Balance\n5)Transfer");
			int in = sc.nextInt();
			switch(in) {
			case 1:
				System.out.println("User Verification");
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter the username:");
				String uname = sc1.nextLine();
				System.out.println("Enter the password:");
				String upassword = sc1.nextLine();
				int count = 0;
				while(count<3)
				{
					int a = b.UserVerification(uname, upassword, c);
					System.out.println(a);
					if(a>0)
					{
						System.out.println("Verification is successful");
						break;
					}
					else {
						count++;
						System.out.println("Enter the username again");
						uname = sc1.nextLine();
						System.out.println("Enter the password again");
						upassword = sc1.nextLine();
						
					}
					}
					if(count == 3)
					{
						System.out.println("You exceeded the limit");
						break;
					}
					break;
			case 2:
				System.out.println("Deposit");
				System.out.println("Enter the Account Number");
				long AccNo = sc.nextLong();
				b.Deposit(AccNo, c);
				break;
			case 3:
				System.out.println("WithDraw");
				System.out.println("Enter the Account number");
				AccNo = sc.nextLong();
				b.WithDraw(AccNo, c);
				break;
			case 4:
				System.out.println("Balance");
				System.out.println("Enter the Account number");
				AccNo = sc.nextLong();
				b.Balance(AccNo, c);
				break;
			case 5:
				System.out.println("Transfer");
				System.out.println("Enter the Account Number to Deposit");
				AccNo = sc.nextLong();
				b.Transfer(AccNo, c);
				break;
		
				default:
					System.out.println("Invalid choice");
					break;
				}
			
		
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}

	}

}
