package javaproject;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class Code14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the string to remove duplicates");
		String line=sc.nextLine();
		String result=removeduplistring(line);
		System.out.println(result);
	}
	public static String removeduplistring(String line) {
		Set<Character> set=new HashSet<>();
		StringBuilder sb=new StringBuilder();
		  for(int i=0;i<line.length();i++) {
			  char c=line.charAt(i);
			  if(!set.contains(c)) {
			  set.add(c);
			  sb.append(c);
		  }
		  }
		return sb.toString();
		
		
	}

}
