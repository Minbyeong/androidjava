package 반복문;

import javax.swing.JOptionPane;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 계속 반복하고자 하는 경우
		while (true) {
			System.out.println("반복");
			String choice = JOptionPane.showInputDialog("계속 하실?yes or not");
			if (choice.equals("n") || choice.equals("no")) {
				System.out.println("프로그램 종료");
				System.exit(0); // 프로그램 자체를 종료
				// break; // while 반복문을 종료, 아래에 있는 것을은 계속 실행
			}
		}
		
		
//		System.out.println("나함?");
		
		// 제한된 횟수를 반복하고자 하는 경우
//		int i = 0; // 시작값
//		while (i < 10) { // 조건문
//			System.out.println("10번 반복"); // 반복내용
//			i++;
//		}
	}

}
