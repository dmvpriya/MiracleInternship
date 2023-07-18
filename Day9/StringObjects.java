import java.util.*;
class Employee{
	int Eid;
	String Ename;
	public Employee(int Eid,String Ename)
	{
		this.Eid= Eid;
		this.Ename = Ename;
		System.out.println("Employee id "+Eid+"Employee name "+Ename);
	}
}
public class StringObjects {

	public static void main(String[] args) {
		// TODO Aut1o-generated method stub
		Employee e =new Employee(45,"alex");
		Employee e1 = new Employee(34,"lucy");
		ArrayList al = new ArrayList();
		al.add(e);
		al.add(e1);
		Iterator i = al.iterator();
		ArrayList al1 = new ArrayList();
		al1.add(2);
		al1.add("python");
		al1.add(5);
		al1.add("java");
	    Iterator i1 = al1.iterator();
        while(i1.hasNext())
		{
			System.out.println(i1.next());			
			
		}
		while(i.hasNext())
		{
			System.out.println(i.next());			
			Employee e3 = (Employee)i.next();
			System.out.println("Employee id "+e3.Eid+" Employee name "+e3.Ename);
		}
		for(Employee e4:al)
		{
			
		}
		
		

	}

}
