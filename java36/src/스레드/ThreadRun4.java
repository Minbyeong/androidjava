package 스레드;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Date;
import java.awt.Color;

public class ThreadRun4 extends JFrame {
	JLabel l_counter = new JLabel("count");
	JLabel l_img = new JLabel();
	JLabel l_timer = new JLabel("time");

	public ThreadRun4() {
		getContentPane().setBackground(Color.ORANGE);
		setTitle("나의 멀티스레드");
		setSize(800, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		l_counter.setForeground(Color.BLUE);
		l_counter.setBackground(Color.WHITE);
		l_counter.setFont(new Font("굴림", Font.BOLD, 30));
		l_counter.setBounds(12, 57, 760, 50);
		getContentPane().add(l_counter);

		l_img.setBounds(288, 273, 200, 150);
		getContentPane().add(l_img);

		l_timer.setForeground(Color.RED);
		l_timer.setBackground(Color.WHITE);
		l_timer.setFont(new Font("굴림", Font.BOLD, 30));
		l_timer.setBounds(12, 625, 760, 62);
		getContentPane().add(l_timer);

		CounterThread2 counter = new CounterThread2();
		counter.start();

		TimerThread2 time = new TimerThread2();
		time.start();

		ImgThread2 img = new ImgThread2();
		img.start();

		setVisible(true);
	}

	// 내부클래스(inner class)
	// 변수를 다른 클래스와 공유할 목적으로 사용
	// 단점: 내부클래스는 독립적으로 사용 불가.
	// 교재 449page 참조
	public class CounterThread2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				l_counter.setText("카운터: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public class TimerThread2 extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 300; i++) {
				Date date = new Date();
				l_timer.setText(date.toString());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public class ImgThread2 extends Thread {

		@Override
		public void run() {
			String[] img = { "images/1.png", "images/2.png", "images/3.png", "images/4.png", "images/5.png" };

			for (int i = 0; i < img.length; i++) {
				l_img.setIcon(new ImageIcon(img[i]));
				if (i == 4) {
					i = -1;
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		ThreadRun4 t = new ThreadRun4();

	}
}
