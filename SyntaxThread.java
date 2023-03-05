package javaproject;

public class SyntaxThread extends Thread {
	public void run() {
		System.out.println("Starting syntax checking");
		for (int i=0;i<=10;i++) {
			System.out.println("continueing syntax checking...");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
