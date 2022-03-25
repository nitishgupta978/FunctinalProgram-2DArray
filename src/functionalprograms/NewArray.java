package functionalprograms;
import java.util.Scanner;

public class NewArray {
	public static void main(String[]args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the first array:");
		int a = Sc.nextInt();
	
		int a1[] = new int[5];
		
		// This for loop is use to read the data from user
		
		for (int i=0; i<a1.length; i++)
		{
			
			a1[i]=Sc.nextInt();
		}
		//to print the data
		
			for(int j=a1.length -1; j>-1; j--)
			{
				System.out.println(a1[j]);
			}
		
		
		
		//System.out.println()
	}
}
