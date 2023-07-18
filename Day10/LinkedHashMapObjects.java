import java.util.*;
import java.io.*;
class Add1
{
	int a,b;
	public Add1(int a,int b)
	{
		this.a = a;this.b = b;
		System.out.println(a+b);
	}
}
public class LinkedHashMapObjects {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		Add1 a1 = new Add1(3,8);
		Add1 a2 = new Add1(7,19);
		
		LinkedHashMap<Integer,Object> hm = new LinkedHashMap<>();
		hm.put(1, a1);
		hm.put(2, a2);
		Set s = hm.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			Add3 a4 = (Add3)i.next();
			System.out.println(i.next());
		}
		for(Map.Entry m1 : hm.entrySet())
		{
			Add3 a5 = (Add3)m1.getKey();
			System.out.println(m1.getKey()+" "+m1.getValue());
		}

	}

}
