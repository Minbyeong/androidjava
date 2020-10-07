package test;

import javax.swing.JOptionPane;

public class Test02 {

	public static void main(String[] args) {

		// 예금자 명, 예금액을 입력받을 배열 생성.
		String[] name = new String[5];
		int[] money = new int[5];

		int sum = 0;

		while (true) { // 종료 전까지 반복 실행.
			int choice = Integer.parseInt(JOptionPane.showInputDialog("1)입력 2)출력 3)수정 4)정리 5)종료   실행하실 번호를 입력하시오."));

			if (choice == 1) { // 1이 실행되면
				for (int i = 0; i < name.length; i++) { // 예금주와 예금액은 5번 입력.
					name[i] = JOptionPane.showInputDialog("예금자의 이름을 입력하시오.");
					money[i] = Integer.parseInt(JOptionPane.showInputDialog("예금액을 입력하시오."));
				}
			} else if (choice == 2) { // 2가 입력되면
				for (int i = 0; i < name.length; i++) { // 예금주 예금액을 출력
					System.out.println(name[i] + "\n" + money[i]);
				}
			} else if (choice == 3) { // 3이 입력되면
				String select; // 변경할 예금주 이름을 입력받을 변수
				select = JOptionPane.showInputDialog("예금액을 변경할 입금자를 선택하시오.");
				int index = 0; // 변경이 되었는지 판단할 변수
				for (int i = 0; i < name.length; i++) { // 저장되어 있는 사람 수만큼
					if (name[i].equals(select)) { // 그 예금주[i]의 값이 입력받은 예금주와 같으면 실행
						money[i] = Integer.parseInt(JOptionPane.showInputDialog("변경할 금액을 입력하시오."));
						JOptionPane.showMessageDialog(null, "변경이 되었습니다.");
						index++; // 변경이 되었다 표시
					} else if (index == 0) { // 돌아보고 변경이 되었단 표시가 없으면
						JOptionPane.showMessageDialog(null, "사용자가 존재하지 않습니다."); // 입력한 예금주는 없는 사람임을 표시
					}
				}
			} else if (choice == 4) { // 4가 입력되면
				for (int i = 0; i < money.length; i++) { // 처음 만들어 놓음 sum에 예금된 금액을 모두 더해서 저장
					sum += money[i];
				}
				JOptionPane.showMessageDialog(null, "입금된 예금액의 총 합: " + sum + "원 입니다.");
				JOptionPane.showMessageDialog(null, "입금된 예금액의 평균: " + (sum / money.length) + "원 입니다."); // 예금된 수만큼을 나눠서
																										// 평균값 내주고
			} else if (choice == 5) { // 5가 입력되면 종료
				System.out.println("프로그램 종료");
				break;
			} else { // 그 외 다른 수가 입력되면 처음으로
				JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
			}

		} // while

	} // main
}
