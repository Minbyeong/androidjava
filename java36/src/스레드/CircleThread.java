package ½º·¹µå;

public class CircleThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("¡Ý");
		}
	}
}
