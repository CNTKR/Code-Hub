
/*
 * Write a program to accept an integer from the user and print whether it’s odd or even.
 */
package javaproject;
import java.util.Scanner;
public class Code03 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//positive numbers only
		System.out.println("please enter the number");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+" :Even number");
		}
		else {
			System.out.println(num+":Odd Number");
		}
		
		
	

}}

	
