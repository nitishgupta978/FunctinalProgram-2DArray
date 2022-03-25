package functionalprograms;
import java.util.Scanner;

public class ArrayWhileChar {
	public static void main(String[] args) {
		System.out.println("Welcome");
		 Scanner Sc = new Scanner(System.in);
		 System.out.println("Enter the row Numbers:");
		 byte row = Sc.nextByte();
		 System.out.println("Enter the col Numbers:");
		 byte col = Sc.nextByte();
		 
		 // for character 
		 char matrixs[][] = new char [row][col];
		 
		 byte i =0;
		 byte j =0;
		 System.out.println("*********matrxis are ***********");
		 while(i<row) {
			 j=0;
			 while(j<col) {
				 System.out.println("the index of matrixs =["+i+","+j+"] ");
				 matrixs[i][j]=Sc.next().charAt(0);
			
				 j++;
				 
			 }
			 i++;
		 }
		 
		 i=0;
		// j=0;
		 while(i<row) {
			 j=0;
			 while(j<col) {
				 System.out.print(matrixs[i][j]+ " ");
				 j++;
			 }
			 System.out.println();
			 i++;
		 }
		 // for replace the index value by users
		 //only one time can you call this program not continuously time at one run time so uese this program
		/** 
		 System.out.println("Enter the number which index to add your value");
		 byte loc = Sc.nextByte();
		 System.out.println("Enter given value which index to add you:  ");
		 char value = Sc.next().charAt(0);
		 
		 byte m =1 ;
		 i=0;
		 while(i<row) {
			 j=0;
			 while(j<col) {
				 if( m == loc) {
					 matrixs[i][j]=value;
				 }
					 m++;
					 j++;
					 
				 }
				 i++;
			 }
			 System.out.println("*****matrixs are ******");
			 i=0;
			 while(i<row) {
				 j=0;
				 while(j<col) {
					 System.out.print(matrixs[i][j]+ " ");
				
					 j++;
				 }
				 System.out.println();
				 i++;
			 }
			 **/
		 //if you want to continue your program multiple  Time so use do{ and }While loop
		 byte chr = 1;
		 do {
			 System.out.println("Enter the number which index to add your value");
			 byte loc = Sc.nextByte();
			 
			 System.out.println("Enter given value which index to add you:  ");
			 char value = Sc.next().charAt(0);
			 
			 byte m =1 ;
			 i=0;
			 while(i<row) {
				 j=0;
				 while(j<col) {
					 if( m == loc) {
						 matrixs[i][j]=value;
					 }
						 m++;
						 j++;
						 
					 }
					 i++;
				 }
				 System.out.println("*****matrixs are ******");
				 i=0;
				 while(i<row) {
					 j=0;
					 while(j<col) {
						 System.out.print(matrixs[i][j]+ " ");
					
						 j++;
					 }
					 System.out.println();
					 i++;
				 }
				 System.out.println("Enter the number if you want comtinew.... please press 1");
				 chr = Sc.nextByte();
		 		}while(chr==1);
	}
}

					 
				 
		 
	




