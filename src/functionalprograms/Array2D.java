package functionalprograms;

import java.util.Scanner;

public class Array2D {
	public static void  main (String[]  args) {
		
		
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("Enter first row Number:");
		byte M = Sc.nextByte();
		System.out.println("Enter the second colum Number:");
		byte N = Sc.nextByte();
		
		//byte arr [][]  =new byte [M][N]; // Integers
		
		char arr [][] = new char[M][N]; // characters
		
		System.out.println("Enter" + (M*N) + "array elements:" );
		for ( byte i=0; i<M; i++) {
			for (byte j=0; j<N ; j++) {
			//	arr[i][j] = Sc.nextByte();
				
				System.out.println("the matrixs are = ["+i+","+j+"] = ");// use for both int or char
				arr[i][j] = Sc.next().charAt(0); // for characters
				}
		}
		System.out.println("The array is :");
		for (byte i=0; i<M; i++) {
			for(byte j=0; j<N; j++) {
				//arr[i][j]=  Sc.nextInt();
			
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("enter the location which you add");
		byte loc = Sc.nextByte();
		System.out.println("Enter the given value to add the index:");
		char value = Sc.next().charAt(0);
		//byte m =1;
		for( byte i=0; i<M; i++) {
			for(byte j=0; j<N; j++) {
				if ( arr[i][j] == loc) {
					arr[i][j] =value;
					arr[i][j] = Sc.next().charAt(0);
				}
			}
		}
		System.out.println(" *******matrixs are *******");
		for( byte i=0; i<M; i++) {
			for (byte j=0; j<N ; j++) {
				
				System.out.print(arr[M][N] + " ");
			}
			System.out.println();
		}
	}
}//https://youtu.be/bW4D0SxGVvQ tcsnqt
