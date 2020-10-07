package 스레드;

import java.util.Date;

public class TimerThread extends Thread {

	// @ => asd@naver.com (at, -에)
	// @ => Annotation(표시, 표기): 기능없음. 지워도 됨.
	// @Component => 기능있음. new!(객체생성)
	@Override // 오버라이드, 재정의, 부모로부터 상속받은 메서드를 다시 정의함, 지워도 상관없음.
	public void run() {
		for (int i = 0; i < 300; i++) {
			Date date = new Date();
			System.out.println(date);
			try { // 외부 자원을 가져다 쓸때 예외발생 가능, 예외 처리 해줘야 됨.
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
