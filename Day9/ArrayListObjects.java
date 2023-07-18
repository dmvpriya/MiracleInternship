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
class AddE{
	int a;
	int b;
	public AddE(int a,int b)
	{
		this.a = a;
		this.b = b;
		System.out.println("AddE :"+a+b);
	}
}
public class ArrayListObjects {

	public static void main(String[] args) {
		// TODO Aut1o-generated method stub
		Employee e =new Employee(45,"alex");
		Employee e1 = new Employee(34,"lucy");
		Employee e2 = new Employee(58,"carie");
		AddE ad = new AddE(5,7);
		AddE ad1 = new AddE(17,82);
		ArrayList al3 = new ArrayList();
		al3.add(ad);
		al3.add(ad1);

		ArrayList al = new ArrayList();
		al.add(e);
		al.add(e1);
		al.add(e2);
		Iterator i = al.iterator();
		ArrayList al1 = new ArrayList();
		al1.add(2);
		al1.add("python");
		al1.add(5);
		al1.add("java");
		ListIterator i1 = al1.listIterator();
        while(i1.hasNext())
		{
			System.out.println("List iterator "+i1.next());			
			
		}
		while(i.hasNext())
		{
			System.out.println("Hashcode "+i.next());			
			
		}
		ListIterator i2 = al3.listIterator();
		while(i2.hasNext())
		{
			AddE e3 = (AddE)i2.next();
			System.out.println("Addition E :"+(e3.a+e3.b));
		}
		ListIterator i3 = al.listIterator();
		while(i3.hasNext())
		{
			Employee e4 = (Employee)i3.next();
			System.out.println("Employee id "+e4.Eid+"Employee name "+e4.Ename);
		}

	}

}