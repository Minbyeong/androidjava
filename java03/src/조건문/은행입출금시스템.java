package 조건문;

import javax.swing.JOptionPane;

public class 은행입출금시스템 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int save = 0;// 잔고 설정
		while (true) {// 무한반복
			String input = JOptionPane.showInputDialog("1)입금 2)출금 3)잔고 4)종료 / 번호 입력");// 어떤 동작을 실행할지 선택
			int selec = Integer.parseInt(input);// 선택값을 받고 문자열로 입력된 값을 숫자로 처리

			if (selec == 4) { // 종료 시 먼저 설정, 종료되었음을 출력
				System.out.println("시스템 종료");
				break; // 종료
			} else if (selec == 1) { // 입금 선택 시
				String in = JOptionPane.showInputDialog("입금액 입력"); // 입금액을 입력받고
				int in2 = Integer.parseInt(in); // 입금액을 수로 변환
				save = save + in2; // 잔고에 추가
			} else if (selec == 2) { // 출금 선택 시
				String out = JOptionPane.showInputDialog("출금액 입력"); // 출금액 입력
				int out2 = Integer.parseInt(out); // 출금액 수로 전환
				save = save - out2; // 잔액에서 출금액을 빼줌
			} else { // 잔고를 출력
				System.out.println(save);
			}
		} // while

	}// main

}// class
