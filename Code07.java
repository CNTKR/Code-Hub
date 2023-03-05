/*
 * Write a program to check whether a given number is present in an array or not.
 */
package javaproject;
import java.util.Scanner;
public class Code6 {
	public static void main(String[] args) {
		int size,key,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the size of an array");
		size=sc.nextInt();
		int[] array=new int[size];
		//positive values only
		System.out.println("please enter the elements inside array one by one");
		//loop runs from 0 to array.length to store the elements in array
		for(i=0;i<array.length;i++) {
		array[i]=sc.nextInt();
		}
		System.out.println("please enter the key to search");
		key=sc.nextInt();
		boolean found=false;
		for(i=0;i<array.length;i++) {
			if(array[i]==key) {
				found =true;
				break;
			}}
				if(found==true) {
				System.out.println("key found at index:"+i);
			}
			else {
				System.out.println("key not found");
				
			}
		}
		
		
		

	}


