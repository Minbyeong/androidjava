package 스레드;

public class MinusThread extends Thread {

	@Override
	public void run() {
//		int minus = 1000;
//		for (int i = 0; i < 1000; i++) {
//			System.out.println("감소: "+minus);
//			minus--;
//		}
		for (int i = 1000; i >= 1; i--) {
			System.out.println("감소: " + i);
		}
	}
}
