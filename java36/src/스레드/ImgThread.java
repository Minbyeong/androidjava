package ������;

public class ImgThread extends Thread {

	@Override // ������
	public void run() {
		String[] img = { "1.png", "2.png", "3.png", "4.png", "5.png" };
		for (int i = 0; i < img.length; i++) {
			System.out.println("�̹���: " + img[i]);
			try { 
				// �ܺ� �ڿ��� ������ ���� ���ܹ߻� ����, ���� ó�� ����� ��.
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
