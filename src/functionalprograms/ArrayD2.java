package functionalprograms;

 import java.util.Scanner;
 
public class ArrayD2 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of index:");
		
		int size =Sc.nextInt();
		
		int num[] = new int[size];
		System.out.println("Enter the number:");
		// for user intput
		for (int i=0; i<size; i++)
		{
			num[i] = Sc.nextInt();
			
		}
		//we want to find y position of index value 
		System.out.println("Enter the found inedx at y position:");
		int y = Sc.nextInt();
		
		
		
		//for output
		for (int j=0; j<num.length; j++)
		{
			if (num[j] == y) {
			System.out.println("The y index found :" +j);
			
		}
	}

}
}

