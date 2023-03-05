/*
 * Write a program to calculate the frequency of vowels, consonants, digits and other special characters present in a string.
 */
package javaproject;
import java.util.Scanner;
public class Code12 {
	public static void main(String[] args) {
		int num1,num2,num,temp,result=0,remainder;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number to check");
		num1=sc.nextInt();
		System.out.println("please enter the second number");
		num2=sc.nextInt();
			for(int i=num1;i<=num2;i++) {
				while(num1>num2) {
				num=i;
				temp=num%10;
				result+=temp*temp*temp;
				temp/=10;	
	}
			if(result == i){
				System.out.print(i);
			}
	}}}
