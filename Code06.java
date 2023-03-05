/*
 * Write a program to calculate the sum of all the elements present in an array.
 */
package javaproject;
import java.util.Scanner;
public class Code5 {

	public static void main(String[] args) {
		int size,i,sum=0;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the size of an array");
		size=sc.nextInt();
		int[] array=new int[size];
		//loop runs from 0 to array.length
		for(i=0;i<array.length;i++) {
			//positive values only
			System.out.println("please enter the value inside array");
			array[i]=sc.nextInt(); 
			sum=sum+array[i];
		}
			
			System.out.print("Sum of Array:"+sum+" ");
		}
		

	}


