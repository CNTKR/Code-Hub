/*
 * Write a program to rotate the elements of an array by k times.
 */
package javaproject;
import java.util.Arrays;
import java.util.Scanner;

public class Code8 {

	public static void main(String[] args) {
		int size,i,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size of an array");
		size=sc.nextInt();
		int[] array=new int[size];
		//positive values only
		System.out.println("please enter the values inside array one by one");
		for(i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("please enetr the no of time to rotate");
		k=sc.nextInt();
		int[] temp=new int[size];
		// Copy the last k elements to temp array
		for(i=0;i<k;i++) {
			temp[i]=array[size-k+i];
		}
		// Shift the remaining elements to the right by k positions
		for(i=size-k-1;i>=0;i--) {
			array[i+k]=array[i];	
		}
		// Copy the elements from temp array to original array
		for(i=0;i<k;i++) {
			array[i]=temp[i];
		}
		//printing the original array with rotated elements
		for(i=0;i<array.length;i++) {
		System.out.print(array[i]);
		}
		
}
}