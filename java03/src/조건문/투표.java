package 조건문;

import javax.swing.JOptionPane;

public class 투표 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iu = 0, ujs = 0, bts = 0, count = 0;
		while (true) {
			String input = JOptionPane.showInputDialog("1)아이유 2)유재석 3)방탄소년단 4)종료 / 투표할 번호를 선택해");
			int x = Integer.parseInt(input);
			
			if (x == 4) {
				System.out.println("투표를 종료합니다");
				break;
			} else {
				if (x == 1) {
					iu++;
				} else if (x == 2) {
					ujs++;
				} else if (x == 3) {
					bts++;
				}
			} // else
			count++;
		} // while
		System.out.println("총 투표수는 " + count + "개 입니다.");
		System.out.println("iu의 득표수는 " + iu + "개 입니다.");
		System.out.println("유재석의 득표수는 " + ujs + "개 입니다.");
		System.out.println("방탄소년단의 득표수는 " + bts + "개 입니다.");
	} // main

}
