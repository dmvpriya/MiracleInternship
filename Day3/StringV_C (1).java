package sample;

public class StringV_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String s = "";
		String s1 = "";
		for(int i = 0;i<input.length();i++)
		{
			if(input.charAt(i) == 'A'||input.charAt(i) == 'E'||input.charAt(i) == 'I'||input.charAt(i) == 'O'||input.charAt(i) == 'U')
			{
				s += ""+input.charAt(i)+"";
			}
			else {
				s1 += ""+input.charAt(i)+"";
			}
			
		}
		System.out.println("The vowels are :"+s);
		System.out.println("The consonants are :"+s1);

	}

}
