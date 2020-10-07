package 재정의;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPanel;

public class test {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setLayout(null);
		f.setSize(1000, 800);

		String header[] = {"예매번호","영화제목","영화관위치","날짜","상영관번호","상영시간","좌석번호"};
		String contents[][] = new String[5][7];
		
		JTable table = new JTable(contents, header);
		table.setBounds(28, 123, 633, 416);
		f.getContentPane().add(table);
		table.setVisible(true);
//		JScrollPane scroll = new JScrollPane(table);
//		f.getContentPane().add(scroll);
		

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
