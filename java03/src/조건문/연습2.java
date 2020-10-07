package 조건문;

import javax.swing.JOptionPane;

public class 연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int target = 88;
		int non = 0;
		while (true) {
			String input = JOptionPane.showInputDialog("수를 입력하시오");
			int target2 = Integer.parseInt(input);
			if (target2 == target) {
				System.out.println("축하합니다, 정답입니다.");
				break;
			} else if (target2 > target) {
				System.out.println("커용");
				non++;
			} else if (target2 < target) {
				System.out.println("작아용");
				non++;
			}

		} // while
		System.out.println("님 " + non + "번 틀림");
	}// main

}
