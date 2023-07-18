import java.util.*;
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String in = sc.nextLine();
				int count = 0,count1 = 0,count2 = 0,count3 = 0;
				String s = "";
				String s1 = "";
				for(int i = 0;i<in.length();i++)
				{
					if(in.charAt(i) == 'A'||in.charAt(i) == 'E'||in.charAt(i) == 'I'||in.charAt(i) == 'O'||in.charAt(i) == 'U')
					{
						count++;
					}
					else if(in.charAt(i) == 'B'||in.charAt(i) == 'C'||in.charAt(i) == 'D'||in.charAt(i) == 'F'||in.charAt(i) == 'G'||in.charAt(i) == 'H'||
							in.charAt(i) == 'J'||in.charAt(i) == 'K'||in.charAt(i) == 'L'||in.charAt(i) == 'M'||in.charAt(i) == 'N'||in.charAt(i) == 'P'||
							in.charAt(i) == 'Q'||in.charAt(i) == 'R'||in.charAt(i) == 'S'||in.charAt(i) == 'T'||in.charAt(i) == 'V'||in.charAt(i) == 'W'||
							in.charAt(i) == 'X'||in.charAt(i) == 'Y'||in.charAt(i) == 'Z'){
						count1++;
					}
					else if(in.charAt(i) == '0'||in.charAt(i) == '1'||in.charAt(i) == '2'||in.charAt(i) == '3'||in.charAt(i) == '4'||in.charAt(i) == '5'||
							in.charAt(i) == '6'||in.charAt(i) == '7'||in.charAt(i) == '8'||in.charAt(i) == '9')
					{
						count2++;
					}
					else {
						count3++;
					}
					
				}
				System.out.println("The vowels are :"+count);
				System.out.println("The consonants are :"+count1);
				System.out.println("The digits are :"+count2);
				System.out.println("The special characters are :"+count3);

	}

}
