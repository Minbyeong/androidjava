package ������;

import java.util.Date;

public class TimerThread extends Thread {

	// @ => asd@naver.com (at, -��)
	// @ => Annotation(ǥ��, ǥ��): ��ɾ���. ������ ��.
	// @Component => �������. new!(��ü����)
	@Override // �������̵�, ������, �θ�κ��� ��ӹ��� �޼��带 �ٽ� ������, ������ �������.
	public void run() {
		for (int i = 0; i < 300; i++) {
			Date date = new Date();
			System.out.println(date);
			try { // �ܺ� �ڿ��� ������ ���� ���ܹ߻� ����, ���� ó�� ����� ��.
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
