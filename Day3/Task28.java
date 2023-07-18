package tasksOfExcercise2;
import java.util.*;
public class Task28 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(arr);
		Task28 t = new Task28();
		t.arrayOperations(arr);

	}
	void arrayOperations(int arr[])
	{
		int sum = 0;
		int avg = 0;
		int max = arr[0];
		int min = arr[0];
		for(int i = 0;i<arr.length;i++)
		{
			sum += arr[i];
			avg = sum/10;
			
			if(arr[i]>max)
			{
				max = arr[i];	
			}
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("The avg is :"+avg);
		System.out.println("The max is :"+max);
		System.out.println("The min is :"+min);
		
		
	}

}
