/*
 * Write a program to remove duplicates from an array.
 */
package javaproject;
import java.util.LinkedHashSet;
public class Code10 {
	//Function to remove duplicate from array
	public static void removeduplicates(int[] array) {
		LinkedHashSet<Integer>set=new LinkedHashSet<Integer>();
	//adding elements to LinkedhashSet
		for(int i=0;i<array.length;i++) {
			set.add(array[i]);
		}
		//printing the elements of LinkedHashSet
		System.out.print(set);	
	}
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,1,2,3,6,7,8,7};
			//function call
			removeduplicates(array);
		}
		
	}

