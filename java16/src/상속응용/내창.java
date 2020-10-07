package 상속응용;

import javax.swing.JFrame;

public class 내창 extends JFrame {
	String title;

//new할때마다 호출되는 메서드 : 생성자
	public 내창(String title) {
		this.title = title;
	}
}
