package functionalprograms;
import java.util.Scanner;

public class AarryWhile2D {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the row Number:");
		byte  row = Sc.nextByte();
		System.out.println("Enter the coloum Number :");
		byte col = Sc.nextByte();
		
		byte matrix[][] = new byte[row][col]; //for integer value use this
		//char matrix [][] = new char [row][col]; // for characters
		//using while loop
		//for input by users character
	
		byte i=0;
		byte j;
		
		while(i<row) {
			j=0;
			while(j<col) {
				System.out.println("enetr the  the index char is = ["+i+","+j+"]= ");
				//matrix[i][j] = Sc.next().charAt(0);//for character
				
				matrix[i][j] = Sc.nextByte(); // for integer
				j++;
			}
			i++;
		}
		//for output 
		 
	
		System.out.println("The matix is ************matrix********");
		i=0;
		while(i<row) {
			j=0;
			while(j<col) {
				//System.out.print(matrix[i][j]+ " "); // for char
				System.out.print("["+i+","+j+"] = " + matrix[i][j]+"\t "); // for integers
				j++;
			}
			System.out.println();
			i++;
			//System.out.println();
		}
		
	}
}
