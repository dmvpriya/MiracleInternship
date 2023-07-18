import java.util.*;

import java.io.*;
class Add34
{
	int a,b;
	public Add34(int a,int b)
	{
		this.a = a;this.b = b;
		System.out.println(a+b);
	}
}
public class LinkedHashMapObjectsSe_De {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Add34 a1 = new Add34(3,8);
		Add34 a2 = new Add34(7,19);		
		LinkedHashMap<Integer,Object> hm = new LinkedHashMap<>();
		hm.put(1, a1);
		hm.put(2, a2);		
		FileOutputStream fos = new FileOutputStream("/home/training/Documents/i23M05/Day8tasks/files/LHMFile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(hm);
		oos.close();
		fos.close();
		FileInputStream fis = new FileInputStream("/home/training/Documents/i23M05/Day8tasks/files/LHMFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		while(fis.available()!=0)
		{
			//LinkedHashMap lhm = (LinkedHashMap)ois.readObject();
			Map.Entry me = (Map.Entry)ois.readObject();			
			Set s = ((LinkedHashMap<Integer, Object>) me).entrySet();
			Iterator i3 = s.iterator();
			while(i3.hasNext())
			{
				Add34 e4 = (Add34)i3.next();
				System.out.println(e4.a+" "+e4.b);
			}
		}

	}

}
