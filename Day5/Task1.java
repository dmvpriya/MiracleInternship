package sample;
import java.util.*;

public class Task1 {
	void remove(String str,int p)
	{
		int l = str.length();
		String o = str.substring(0,p) + str.substring(p+1);
		System.out.println("The substring method :"+o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string :");
		String s = sc.nextLine();
		System.out.println("Enter char to be removed :");
		char s1 = sc.next().charAt(0);
		System.out.println("Enter the index to be removed :");
		Task1 t = new Task1();
		int i = sc.nextInt();
		t.remove(s,i);
		System.out.println("The replacement method :"+s.replace(s1, ' '));
		

	}

}
