import java.io.*;
import java.util.*;
class Employee implements Serializable
{
	int id;
	String name;
	public Employee(int id,String name)
	{
		this.id= id;
		this.name = name;
	}
}
public class ArrayListObjectSe_De {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Employee e1 = new Employee(8,"AB");
		Employee e2 = new Employee(19,"BC");
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);		
		FileOutputStream fos = new FileOutputStream("/home/training/Documents/i23M05/Day8tasks/files/ALFile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
		fos.close();
		FileInputStream fis = new FileInputStream("/home/training/Documents/i23M05/Day8tasks/files/ALFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		while(fis.available()!=0) {
			ArrayList al1 = (ArrayList)ois.readObject();
			ListIterator i3 = al1.listIterator();
			while(i3.hasNext())
			{
				Employee e4 = (Employee)i3.next();
				System.out.println("Employee id "+e4.id+" Employee name "+e4.name);
			}
			
		}
		
		
		

	}

}
