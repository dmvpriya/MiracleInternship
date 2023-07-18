import java.util.HashSet;
import java.util.Iterator;
class Add{
	int a,b;
	public Add(int a,int b)
	{
		this.a = a;
		this.b = b;
		System.out.println(a+b);
	}
}
public class HashSetObjectsE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a1 = new Add(3,8);
		Add a2 = new Add(7,19);
		HashSet hs = new HashSet();
		hs.add(a1);
		hs.add(a2);
		Iterator i = hs.iterator();
		while(i.hasNext())
		{
			Add a3 = (Add)i.next();
			System.out.println(a3.a+" "+a3.b);
		}
		

	}

}
