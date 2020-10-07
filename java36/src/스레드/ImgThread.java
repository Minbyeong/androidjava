package 스레드;

public class ImgThread extends Thread {

	@Override // 재정의
	public void run() {
		String[] img = { "1.png", "2.png", "3.png", "4.png", "5.png" };
		for (int i = 0; i < img.length; i++) {
			System.out.println("이미지: " + img[i]);
			try { 
				// 외부 자원을 가져다 쓸때 예외발생 가능, 예외 처리 해줘야 됨.
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
