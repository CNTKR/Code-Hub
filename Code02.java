/*
 * Write a program to accept an integer from user and print it’s table (till 10 times) in the following format: For example, if user enters 5, output should be:

                                5 x 1 = 5

                                5 x 2 = 10

                                5 x 3 = 15

                                              . . .

     											. . .

										5 x 10 = 50    
 */
package javaproject;
import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) {
		int num,sum;
		Scanner sc=new Scanner(System.in);
//positive number
		System.out.println("please enter a number");
		num=sc.nextInt();
//loop runs from 1 to 10
		for(int i=1;i<=10;i++) {
			sum=5*i;
			System.out.println("5"+"x"+i+"="+sum);
		}
		
		
		
	}

}
