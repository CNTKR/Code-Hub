package javaproject;

public class TypeThread extends Thread{
	public void run() {
		System.out.println("Typing has started");
		for(int i=0;i<=10;i++) {
			System.out.println("typing continues");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
