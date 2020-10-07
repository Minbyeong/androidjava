package 스레드;

public class PlusThread extends Thread {

	@Override
	public void run() {
//		int plus=1;
//		for (int i = 0; i < 1000; i++) {
//			System.out.println("증가: " + plus);
//			plus++;
//		}
		for (int i = 1; i <= 1000; i++) {
			System.out.println("증가: " + i);
		}
	}
}
