package sample;
import java.util.*;
public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c[] = s.toCharArray();
		int a = 0;
		for(int i = 0;i<c.length;i++)
		{
			a++;
		}
		System.out.println("The length is :"+a);

	}

}
