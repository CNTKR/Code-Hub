
package javaproject;
import java.util.Scanner;
public class Code9 {
	public static void main(String[] args) {
		int i,j,rows,cols;
		// Read the number of rows and columns
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the no of rows");
		rows=sc.nextInt();
		System.out.println("please enter the no of columns");
		cols=sc.nextInt();
		        int[][] array=new int[rows][cols];
		     // Read the elements of the array from input
		        System.out.println("please enter the values inside an array");
		        for(i=0;i<rows;i++) {
		        	for(j=0;j<cols;j++) {
		        	 array[i][j]=sc.nextInt();
		        	}
		        	System.out.println();
		        }
		    
		        for(i=0;i<rows;i++) {
		        	for(j=0;j<cols;j++) {
		        		//condition to print only border elements of 2-D array
		        		if(i==0||i==rows-1||j==0||j==cols-1)
		        		System.out.print(array[i][j]+" ");
		        	}
		        	System.out.println();
		        }	
	}
	}


