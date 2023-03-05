/*
 * Write a program to replace all the even numbers of an array by 999
 */
package javaproject;
import java.util.Scanner;
public class Code7 {

	public static void main(String[] args) {
		int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the size of an array");
		size=sc.nextInt();
		int[] array=new int[size];
		//positive values only
		for(i=0;i<=array.length;i++) {
			if(i%2==0) {
				//replacing even array index number with 999
				System.out.print(999+" ");
			}
			else {
				//printing array odd index number as it is
				System.out.print(i+" ");
			}
		}
		

	}

}
