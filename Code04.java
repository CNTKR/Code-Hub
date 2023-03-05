
/*
 *Write a program to accept an integer from the user and print all the factors of the number.
 **/
package javaproject;
import java.util.Scanner;
public class Code03 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//positive numbers only
		System.out.println("please enter the number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i);
			}
			
			
		}
		
		
		
	

}}

	
