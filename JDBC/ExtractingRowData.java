package Tasks;
import java.sql.*;
import java.util.*;
public class ExtractingRowData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String fname,lname,uname;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "Vishnu@13");			
			
			
			System.out.println("Enter fname startsWith :");
			String fsw = sc.nextLine();			
			
			System.out.println("Enter lname startsWith :");
			String lsw = sc.nextLine();
			
			System.out.println("Enter uname startsWith :");
			String usw = sc.nextLine();
			
			PreparedStatement ps = c.prepareStatement("select * from Employee1");
			ResultSet rs = ps.executeQuery();		
				while(rs.next()) {
					fname = rs.getString(2);
					lname = rs.getString(3);
					uname = rs.getString(8);
					if(fname.startsWith(fsw) && lname.startsWith(lsw) && uname.startsWith(usw))
					{
						
					System.out.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9));
					System.out.println();
				}
				
			}				
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}

	}

}