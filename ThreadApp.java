package javaproject;

public class ThreadApp {

	public static void main(String[] args) {
		//creating object of classes
		TypeThread tt=new TypeThread();
		SyntaxThread st=new SyntaxThread();
		//creating theread object
		Thread t1=new Thread(tt);
		Thread t2=new Thread(st);
		//starting the thread
		t1.start();
		t2.start();
	}

}
