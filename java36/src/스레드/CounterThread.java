package 스레드;

public class CounterThread extends Thread {
	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운터: " + i);
			try { // 외부 자원을 가져다 쓸때 예외발생 가능, 예외 처리 해줘야 됨.
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

//	private void view() {
//		super.run();
//		// 부모클래스에 있는 메서드를 사용하고 싶을때, super를 사용
//		System.out.println("내용을 프린트");
//	}