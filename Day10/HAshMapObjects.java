import java.util.*;
import java.io.*;
class Add3
{
	int a,b;
	public Add3(int a,int b)
	{
		this.a = a;this.b = b;
		System.out.println(a+b);
	}
}
public class HAshMapObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add3 a1 = new Add3(3,8);
		Add3 a2 = new Add3(7,19);
		
		HashMap<Integer,Object> hm = new HashMap<>();
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
