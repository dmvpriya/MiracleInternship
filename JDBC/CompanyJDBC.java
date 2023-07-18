package Tasks;
import java.sql.*;
import java.util.*;
public class CompanyJDBC {
	void Insert(Connection c,String Fname) throws SQLException
	{
		Connection c1 = c;
		PreparedStatement ps;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter first name :");
		String fname = sc1.nextLine();
		System.out.println("Enter last name :");
		String lname = sc1.nextLine();
		System.out.println("Enter role :");
		String EmpRole = sc1.nextLine();
		System.out.println("Enter Country :");
		String EmpCountry = sc1.nextLine();
		System.out.println("Enter id :");
		int id = sc1.nextInt();
		System.out.println("Enter Phone number :");
		long phno = sc1.nextLong();
		String number = Long.toString(phno);
		String sample = String.valueOf(phno);		
		String mailID = fname.substring(0, 1)+lname+"@MiracleSSEmployee.com";
		String uname = fname.substring(0, 1)+lname;
		String upassword = fname.substring(0, 2)+lname.substring(lname.length()-2, lname.length())+sample.substring(sample.length()-6);
		ps = c1.prepareStatement("Insert into Employee values(?,?,?,?,?,?,?,?,?,?)");
		if(EmpRole.equals("Trainee"))
		{
			String idTraining = "I23M"+ String.valueOf(id);
			ps.setString(1, idTraining);
		}
		else if(EmpRole.equals("Trainer"))
		{
			String idTrainer = "T23M"+String.valueOf(id);
			ps.setString(1, idTrainer);	
			
		}
		else if(EmpRole.equals("HR"))
		{
			String idEmployee = "H23M"+String.valueOf(id);
			ps.setString(1, idEmployee);	
		}
		else {
			System.out.println("Invalid EmpRole");
		
		}
		ps.setString(2, fname);
		ps.setString(3, lname);
		ps.setString(4,EmpCountry);
		if(EmpCountry.equals("India"))
		{
			String phoneNo = "+91 "+ number;
			ps.setString(5, phoneNo);
		}
		else
		{
			String phoneNO = "+4 "+number;
			ps.setString(5, phoneNO);
		}
		ps.setString(7, mailID);
		ps.setString(6, EmpRole);
		ps.setString(8, uname);
		ps.setString(9, upassword);
		ps.setString(10, Fname);
		ps.executeUpdate();
		ps = c1.prepareStatement("select * from Employee where EmpFname = ?");
		ps.setString(1, fname);
		ResultSet rs = ps.executeQuery();
		
		while(rs!=null && rs.next())
		{
			System.out.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10));
		}
	}
	void Update(Connection c,String Fname) throws SQLException
	{
		Connection c1 = c;
		PreparedStatement ps = c1.prepareStatement("select * from Employee");
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter last name :");
		String lname = sc1.nextLine();
		System.out.println("Enter role :");
		String EmpRole = sc1.nextLine();
		System.out.println("Enter Country :");
		String EmpCountry = sc1.nextLine();
		System.out.println("Enter id :");
		int id = sc1.nextInt();
		System.out.println("Enter Phone number :");
		long phno = sc1.nextLong();
		String number = Long.toString(phno);
		String sample = String.valueOf(phno);		
		String mailID = Fname.substring(0, 1)+lname+"@MiracleSSEmployee.com";
		String uname = Fname.substring(0, 1)+lname;
		String upassword = Fname.substring(0, 2)+lname.substring(lname.length()-2, lname.length())+sample.substring(sample.length()-6);
		System.out.println("Enter the Query");
		String query;

		System.out.println("Enter the choice to choose update statement \n1)EmpFname \n2)EmpLname \n3)EmpUname and EmpPassword \n4)EmpUpassword \n5)AddBy");
		int in = sc.nextInt();
		switch(in)
		{
		case 1:
				Scanner sc2 = new Scanner(System.in);
				query = "update Employee set EmpFname=? where EmpUpassword = ?;";
				ps = c1.prepareStatement(query);
				System.out.println("Enter the new First name");
				String UFname = sc2.nextLine();
				ps.setString(1, UFname);
				ps.setString(2, upassword)	;
				ps.executeUpdate();
				ps = c1.prepareStatement("select * from Employee");
				ResultSet rs = ps.executeQuery();
				while(rs.next())
				{
					System.out.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10));
					System.out.println(" ");
				}
			
			break;
		case 2:
			query = "update Employee set EmpLname = ? where EmpID = ?";
			ps = c1.prepareStatement(query);
			System.out.println("Enter the new Last name");
			String ULname = sc1.nextLine();
			ps.setString(1, ULname);
			if(EmpRole.equals("Trainee"))
			{
				String idTraining = "I23M"+ String.valueOf(id);
				ps.setString(2, idTraining);
			}
			else if(EmpRole.equals("Trainer"))
			{
				String idTrainer = "T23M"+String.valueOf(id);
				ps.setString(2, idTrainer);	
				
			}
			else if(EmpRole.equals("HR"))
			{
				String idEmployee = "H23M"+String.valueOf(id);
				ps.setString(3, idEmployee);	
			}
			else {
				System.out.println("Invalid EmpRole");
			
			}		
			ps.executeUpdate();
			ps = c1.prepareStatement("select * from Employee");
			rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10));
			}
			
			break;
		case 3:
			query = "update Employee set EmpUname = ? and EmpUpassword = ? where EmpID = ?";
			
				ps = c1.prepareStatement(query);
				System.out.println("Enter the new User name");
				String Uname = sc1.nextLine();
				System.out.println("Enter the new User password");
				String Upassword = sc1.nextLine();
				ps.setString(1, Uname);
				ps.setString(2, Upassword);
				if(EmpRole.equals("Trainee"))
				{
					String idTraining = "I23M"+ String.valueOf(id);
					ps.setString(3, idTraining);
				}
				else if(EmpRole.equals("Trainer"))
				{
					String idTrainer = "T23M"+String.valueOf(id);
					ps.setString(3, idTrainer);	
					
				}
				else if(EmpRole.equals("HR"))
				{
					String idEmployee = "H23M"+String.valueOf(id);
					ps.setString(3, idEmployee);	
				}
				else {
					System.out.println("Invalid EmpRole");
				
				}	
				ps.executeUpdate();
				ps = c1.prepareStatement("select * from Employee");
				rs = ps.executeQuery();
				while(rs.next())
				{
					System.out.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10));
				}
			
			break;
		case 4:
			query = "update Employee set EmpUpassword = ? where EmpID = ? and EmpUname = ?";
			
				ps = c1.prepareStatement(query);
				System.out.println("Enter the new User password");
				Upassword = sc1.nextLine();
				ps.setString(1, Upassword);
				if(EmpRole.equals("Trainee"))
				{
					String idTraining = "I23M"+ String.valueOf(id);
					ps.setString(2, idTraining);
				}
				else if(EmpRole.equals("Trainer"))
				{
					String idTrainer = "T23M"+String.valueOf(id);
					ps.setString(2, idTrainer);	
					
				}
				else if(EmpRole.equals("HR"))
				{
					String idEmployee = "H23M"+String.valueOf(id);
					ps.setString(2, idEmployee);	
				}
				else {
					System.out.println("Invalid EmpRole");
				
				}	
				ps.setString(3, uname);
				ps.executeUpdate();
				ps = c1.prepareStatement("select * from Employee");
				rs = ps.executeQuery();
				while(rs.next())
				{
					System.out.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10));
				}
			
			break;
		case 5:
			query = "update Employee set AddBy = ? where EmpID = ? ";
					
				ps = c1.prepareStatement(query);
				System.out.println("Enter the new User password");
				String AddBy = sc1.nextLine();
				ps.setString(1, AddBy);
				if(EmpRole.equals("Trainee"))
				{
					String idTraining = "I23M"+ String.valueOf(id);
					ps.setString(2, idTraining);
				}
				else if(EmpRole.equals("Trainer"))
				{
					String idTrainer = "T23M"+String.valueOf(id);
					ps.setString(2, idTrainer);	
					
				}
				else if(EmpRole.equals("HR"))
				{
					String idEmployee = "H23M"+String.valueOf(id);
					ps.setString(2, idEmployee);	
				}
				else {
					System.out.println("Invalid EmpRole");
				
				}			
		
        ps.executeUpdate();
		ps = c1.prepareStatement("select * from Employee");
		rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10));
		}
			
		break;
		
		default:
			System.out.println("Invalid choice");
			break;
		}
}
	void Delete(Connection c) throws SQLException
	{
		Connection c1 = c;
		PreparedStatement ps;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter first name :");
		String fname = sc1.nextLine();
		System.out.println("Enter last name :");
		String lname = sc1.nextLine();
		System.out.println("Enter role :");
		String EmpRole = sc1.nextLine();
		System.out.println("Enter Country :");
		String EmpCountry = sc1.nextLine();
		System.out.println("Enter id :");
		int id = sc1.nextInt();
		System.out.println("Enter Phone number :");
		long phno = sc1.nextLong();
		String number = Long.toString(phno);
		String sample = String.valueOf(phno);		
		String mailID = fname.substring(0, 1)+lname+"@MiracleSSEmployee.com";
		String uname = fname.substring(0, 1)+lname;
		String upassword = fname.substring(0, 2)+lname.substring(lname.length()-2, lname.length())+sample.substring(sample.length()-6);
		System.out.println("Enter the EmpID");
		String ID = sc.nextLine();
		ps = c1.prepareStatement("delete from Employee where EmpID = ?");
		if(EmpRole.equals("Trainee"))
		{
			String idTraining = "I23M"+ String.valueOf(id);
			ps.setString(1, idTraining);
		}
		else if(EmpRole.equals("Trainer"))
		{
			String idTrainer = "T23M"+String.valueOf(id);
			ps.setString(1, idTrainer);	
			
		}
		else if(EmpRole.equals("HR"))
		{
			String idEmployee = "H23M"+String.valueOf(id);
			ps.setString(1, idEmployee);	
		}
		else {
			System.out.println("Invalid EmpRole");
		
		}
		ps.executeUpdate();
		ps = c1.prepareStatement("select * from Employee");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10));
			System.out.println(" ");
		}
		
	}
	void View(Connection c,String EmpRole) throws SQLException
	{
		Connection c1 = c;
		PreparedStatement ps;		
		Scanner sc = new Scanner(System.in);			
		System.out.println("Enter the choice \n1)View HR \n2)ViewEmployee");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			ps = c1.prepareStatement("select EmpID,EmpFname,EmpLname,EmpUname,EmpUpassword,EmpEmailID,EmpPhNo,EmpRole from Employee where EmpRole = ?");
			ps.setString(1, EmpRole);		
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));
				System.out.println();
			}
			break;
		case 2:
			
			ps = c1.prepareStatement("select EmpID,EmpFname,EmpLname,EmpUname,EmpUpassword,EmpEmailID,EmpPhNo from Employee where EmpRole = ?");
			ps.setString(1, EmpRole);
			rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));
				System.out.println();
			}
			break;
			default:
			System.out.println("Invalid choice");
			break;

		}
		}		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyJDBC cj = new CompanyJDBC();
		String Fname;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company","root","Vishnu@13");
			Scanner sc=new Scanner(System.in);
			PreparedStatement ps = c.prepareStatement("select * from Employee",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = ps.executeQuery();
			int count = 0;
			while(rs.next())
			{
				count++;
			}
			System.out.println("Enter the choice \n1)Insert \n2)Update \n3)Delete \n4)View");
			int a = sc.nextInt();
			ps = c.prepareStatement("select * from Employee",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = ps.executeQuery();
			switch(a)
			{
			case 1:
				
				System.out.println("Insert");
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter the name to verify the Authorization(HR,Trainer)");
				Fname = sc1.nextLine();
				for(int i = 0;i<count;i++)
				{					
					while(rs!=null&&rs.next())
					{
						
						if(Fname.equals(rs.getString(2)))
						{ 
							String a1 = rs.getString(6);
							if(a1.startsWith("H"))
							{
								cj.Insert(c,Fname);								
								count++;
							}
							else if(a1.endsWith("r")){
								String AddBy = rs.getString(10);
								cj.Insert(c,AddBy);
								count++;
							}
							else {
								System.out.println("Invalid User Insertion");
							}
						}
					}
				}
				break;
			case 2:
				System.out.println("Update");
				Scanner sc5 = new Scanner(System.in);
				System.out.println("Enter the name to verify the Authorization(HR,Trainer,Trainee)");
				Fname = sc5.nextLine();
				for(int i = 0;i<count;i++)
				{
					while(rs.next())
					{
						if(Fname.equals(rs.getString(2)))
						{ 
							String a1 = rs.getString(6);
							if(a1.startsWith("H"))
							{
								cj.Update(c,Fname);
								
							}
							else if(a1.endsWith("r")|| a1.endsWith("e")){
								String AddBy = rs.getString(10);
								cj.Update(c,AddBy);
								
							}							
							else {
								System.out.println("Invalid User Insertion");
							}
						}
					}
				}
				break;
			case 3:
				System.out.println("Delete");
				Scanner sc4 = new Scanner(System.in);
				System.out.println("Enter the name to verify the Authorization(HR)");
				Fname = sc4.nextLine();
				for(int i = 0;i<count;i++)
				{
					while(rs.next())
					{
						if(Fname.equals(rs.getString(2)))
						{ 
							
							String a1 = rs.getString(6);
							if(a1.startsWith("H"))
							{
								cj.Delete(c);
								
							}
						}
						else {
								System.out.println("Invalid User Insertion");
							}
						}
					}
				
			break;
			case 4:
				System.out.println("View");
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Enter the name ");

				Fname = sc3.nextLine();
				for(int i = 0;i<count;i++)
				{
					while(rs.next())
					{
						if(Fname.equals(rs.getString(2)))
						{ 
							String a1 = rs.getString(6);
							if(a1.startsWith("H"))
							{
								String EmpRole = rs.getString(6);
								cj.View(c, EmpRole);
							}
							else {
								System.out.println("Invalid User Insertion");
							}
						}
					}
				}break;
				default:
					System.out.println("Invalid choice");
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}