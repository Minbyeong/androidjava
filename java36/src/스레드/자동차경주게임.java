package 스레드;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 자동차경주게임 extends JFrame {

	public 자동차경주게임() {
		setTitle("자동차 경주");
		setSize(1400, 600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Car car1 = new Car("images/car01.png", 100, 0);
		Car car2 = new Car("images/car02.png", 100, 150);
		Car car3 = new Car("images/car03.png", 100, 300);

		car1.start();
		car2.start();
		car3.start();

		setVisible(true);
	}

	// 내부클래스
	public class Car extends Thread {
		int x, y;

		JLabel lb;

		public Car(String file, int x, int y) {
			ImageIcon icon = new ImageIcon(file);
			lb = new JLabel(icon);
			this.x = x;
			this.y = y;
			lb.setBounds(x, y, 150, 150);
			add(lb);
		}

		@Override
		public void run() {
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50);
				x += move;
				lb.setBounds(x, y, 150, 150);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	public static void main(String[] args) {
		자동차경주게임 cargame = new 자동차경주게임();
	}

}
