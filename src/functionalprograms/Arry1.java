package functionalprograms;

import java.util.Scanner;

public class Arry1 {
	public static void main(String[] args) {
		Scanner Sc= new Scanner (System.in);
		System.out.println("Enter the row");
		byte row = Sc.nextByte();
		System.out.println("Enter the col number");
		byte col = Sc.nextByte();
		
		byte num [][] = new byte[row][col];
		
		//input for users
		System.out.println("Enter the Number" +row*col+ "we get");
		for (byte i=0; i<row; i++) {
			for(byte j=0; j<col; j++) {
				num[i][j]=Sc.nextByte();
			}
			
		}
		//System.out.println("the fin");
		//byte x  =Sc.nextByte();
		//byte y  =Sc.nextByte();
		
		//output for user
		for(byte i=0; i<row; i++)
			for (byte j=0; j<num.length; j++) {
				
			//if (num[j][j] == x ) {
				//if (num[j][j] == y) {
			System.out.println( num[i][j]+ " ");
			
			
		}
		System.out.println();
	}
	

}




		
	

