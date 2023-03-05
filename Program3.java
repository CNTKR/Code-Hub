/*
 *Write a program to print all the even numbers between ‘a’ & ‘b’, where ‘a’ & ‘b’ are integers entered by the user.
 */
package javaproject;
import java.util.Scanner;
public class Program3 {
	public static void main(String[] args) {
	int num1,num2,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the first number");
	num1=sc.nextInt();
	System.out.println("please enter the second number");
	num2=sc.nextInt();
	System.out.print("Even numbers b/w "+num1+" to "+num2+": ");
	//loop runs from num1 to num2
	for(i=num1;i<=num2;i++) {
	
		if(i%2==0) {
			System.out.print(i+" ");
		}
	}
	
	
	

}}
