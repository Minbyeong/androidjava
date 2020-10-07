package 스레드;

//import java.lang.*; 랭 아래에 다 쓴다는 표시 *
public class StarThread extends Thread {
	//멤버변수, 멤버메서드 다 들어가 있음
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("★");
		}
	}
}
