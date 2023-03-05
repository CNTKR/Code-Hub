/*
 * Write a java program to accept 2 integers from the user and perform arithmetic operations based on user choice (any 1 of addition, subtraction, multiplication, division).
 */
package javaproject;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		int num1,num2,opt,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the first number");
		num1=sc.nextInt();
		System.out.println("please enter the second number");
		num2=sc.nextInt();
		System.out.println("1:ADD"+'\n'+"2:SUB"+'\n'+"3:DIV"+'\n'+"4:MUL");
		System.out.println("please enter the operation no. to perfoam");
		opt=sc.nextInt();
		switch(opt) {
		case 1: 
			result=num1+num2;
			System.out.println("Result:"+result);
			break;
		case 2:
			result=num1-num2;
			System.out.println("Result:"+result);
			break;
		case 3:
			result=num1/num2;
			System.out.println("Result:"+result);
			break;
		case 4:
			double Result=num1*num2;
			System.out.println("Result:"+Result);
			break;
		default:
			System.out.println("please select the valid operator");
			
		}
	}

}
