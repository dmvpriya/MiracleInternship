import java.util.*;
public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count[] = new int[256];
		for(int i = 0;i<s.length();i++)
		{
			count[s.charAt(i)]++;
		}
		for(int j = 0;j<256;j++)
		{
			if(count[j]!=0)
			{
				System.out.println("The occurence of "+ (char)j+" are :"+count[j]);
				
			}
		}
		
		

	}

}
