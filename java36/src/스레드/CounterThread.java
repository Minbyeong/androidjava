package ������;

public class CounterThread extends Thread {
	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("ī����: " + i);
			try { // �ܺ� �ڿ��� ������ ���� ���ܹ߻� ����, ���� ó�� ����� ��.
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

//	private void view() {
//		super.run();
//		// �θ�Ŭ������ �ִ� �޼��带 ����ϰ� ������, super�� ���
//		System.out.println("������ ����Ʈ");
//	}