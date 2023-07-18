
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Vishnu@13");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first name :");
			String fname = sc.nextLine();
			System.out.println("Enter last name :");
			String lname = sc.nextLine();
			System.out.println("Enter role :");
			String EmpRole = sc.nextLine();
			System.out.println("Enter Country :");
			String EmpCountry = sc.nextLine();
			System.out.println("Enter id :");
			int id = sc.nextInt();
			System.out.println("Enter Phone number :");
			long phno = sc.nextLong();
			String number = Long.toString(phno);
			String sample = String.valueOf(phno);		
			String mailID = fname.substring(0, 1)+lname+"@MiracleSSEmployee.com";
			String uname = fname.substring(0, 1)+lname;
			String upassword = fname.substring(0, 2)+lname.substring(lname.length()-2, lname.length())+sample.substring(sample.length()-6);
			System.out.println("Enter Option");
			int a = sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Insert");
		
			PreparedStatement pst = c.prepareStatement("insert into Employee1 values (?,?,?,?,?,?,?,?,?)");
			if(EmpRole.equals("Training"))
			{
				String idTraining = "I23M"+ String.valueOf(id);
				pst.setString(1, idTraining);
			}
			else if(EmpRole.equals("Trainer"))
			{
				String idTrainer = "T23M"+String.valueOf(id);
				pst.setString(1, idTrainer);	
				
			}
			else if(EmpRole.equals("HR"))
			{
				String idEmployee = "H23M"+String.valueOf(id);
				pst.setString(1, idEmployee);	
			}
			else {
				System.out.println("Invalid EmpRole");
			
			}
			pst.setString(2, fname);
			pst.setString(3, lname);
			pst.setLong(4,phno);
			if(EmpCountry.equals("India"))
			{
				String phoneNo = "+91"+ number;
				pst.setString(5, phoneNo);
			}
			else
			{
				String phoneNO = "+00"+number;
				pst.setString(5, phoneNO);
			}
			pst.setString(6, mailID);
			pst.setString(7, EmpRole);
			pst.setString(8, uname);
			pst.setString(9, upassword);
			int i = pst.executeUpdate();
			
			if(i>0)
			{
				System.out.println("Query executed");
			}
			else {
				System.out.println("Query is not executed");
			}
		
		break;
		
		case 2:
		
			System.out.println("Update");
			System.out.println("Enter password :");
			String EmpPassword = sc.nextLine();
			
				
				PreparedStatement pst1 = c.prepareStatement("update Employee1 set EmpUpassword = ? where EmpFname = ? and EmpRole = ?");
				pst1.setString(1, EmpPassword);
				pst1.setString(2, fname);
				
				pst1.setString(3, EmpRole);
				
				int j = pst1.executeUpdate();
				if(j>0)
				{
					System.out.println("Query executed");
				}
				else {
					System.out.println("Query is not executed");
				}
			
			break;
		case 3:
			System.out.println("Delete");
			
				PreparedStatement pst2 = c.prepareStatement("delete from Employee1 where EmpID = ?");
				
				if(EmpRole.equals("Training"))
				{
					String idTraining = "I23M"+ String.valueOf(id);
					pst2.setString(1, idTraining);
				}
				else if(EmpRole.equals("Trainer"))
				{
					String idTrainer = "T23M"+String.valueOf(id);
					pst2.setString(1, idTrainer);	
					
				}
				else if(EmpRole.equals("HR"))
				{
					String idEmployee = "H23M"+String.valueOf(id);
					pst2.setString(1, idEmployee);	
				}
				else {
					System.out.println("Invalid EmpRole");
				
				}
				int k = pst2.executeUpdate();
				if(k>0)
				{
					System.out.println("Query executed");
				}
				else {
					System.out.println("Query is not executed");
				}
			
			break;
			default:
				System.out.println("Invalid");
				break;
			}
		}
		catch(ClassNotFoundException |SQLException e)
		{
			e.printStackTrace();
		}
		}

}
