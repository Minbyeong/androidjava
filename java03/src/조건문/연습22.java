package 조건문;

import javax.swing.JOptionPane;

public class 연습22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int target = 88; // 목표 숫자 지정
		int count = 0; // 총횟수 지정
		int non = 0; // 틀린 횟수 지정
		while (true) { // 무한 반복 시작
			String input = JOptionPane.showInputDialog("수를 입력하시오"); // 수를 입력받도록 해줌
			int target2 = Integer.parseInt(input); // 문자열로 입력된 것을 수로 바꿔줌
			count++; // 총횟수 추가
			if (target2 == target) { // 목표값과 입력값이 같으면 출력
				System.out.println("축하합니다, 정답입니다.");
				break; // 정지
			} else { // 같지 않다면 정답이 아니란 것을 출력
				System.out.println("정답이 아닙니닷");
				non++;// 틀린 횟수를 카운팅
				if (target2 > target) { // 두값을 비교해서 입력값이 크다면 출력
					System.out.println("커용");
				} else { // 두값 비교해서 입력값이 작으면 출력
					System.out.println("작아용");
				} // else
			} // else

		} // while // break 전까지 반복
		System.out.println("총 " + count + "번 시도");
		System.out.println("님 " + non + "번 틀림"); // 반복 종료 후 총 시도 횟수와 틀린 횟수 출력
	}// main
}
