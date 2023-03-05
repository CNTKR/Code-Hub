
/*
 * Write a program to reverse a string preserving the position of spaces.
 */
package javaproject;
import java.util.Scanner;
public class Code13 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the string to reverse");
		String input=sc.nextLine();
		stringreverse(input);
		 System.out.print(stringreverse(input));
	}
	private static String stringreverse(String input) {
	char[] line=input.toCharArray();
	int left =0, right =line.length-1;
	while(left<right) {
		if(line[left]==' ') {
			left++;
		}
		else if(line[right]==' ') {
			right--;
		}else {
			char temp=line[left];
			line[left]=line[right];
			line[right]=temp;
			left++;
			right--;
		}
		
	}
	return new String(line);
		
	

}}
