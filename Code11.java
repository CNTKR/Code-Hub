/*
 * Write a program to print the elements of an array in spiral order.
 */
package javaproject;
public class Code11 {
	public static void main(String[] args) {
		int[][] array= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		spiralorder(array);
	}
	public static void spiralorder(int[][] array) {
		int i;
		int top=0, bottom=array.length-1, left=0, right=array[0].length-1;
		while(top<=bottom && left<=right) {
			//print top row
			for(i=left;i<=right;i++) {
				System.out.print(array[top][i]+" ");
			}
			top++;
			//print right column
			for(i=top;i<=bottom;i++) {
				System.out.print(array[i][right]+" ");
			}
			right--;
			//print bottom row
			if(top<=bottom) {
			for(i=right;i>=left;i--) {
				System.out.print(array[bottom][i]+" ");
			}
			bottom--;
			}
			//print left column
			if(left<=right) {
			for(i=bottom;i>=top;i--) {
				System.out.print(array[i][left]+" ");
			}
			
			
		}
	}
}}
