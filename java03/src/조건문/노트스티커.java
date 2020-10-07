package 조건문;

import javax.swing.JOptionPane;

public class 노트스티커 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalst = 0, totalnt = 0, total = 0; // 초기 총 가격 변수지정
		int st = 3000, nt = 5000; // 스티커 노트의 가격을 지정

		while (true) {
			String input = JOptionPane.showInputDialog("1)스티커 2)노트  / 그만 살거면 아무 번호 입력"); // 어떤 물품을 살지 입력
			int x = Integer.parseInt(input); // 입력된 값을 수로 전환

			if (x == 1) { // 스티커를 고름
				String inputst = JOptionPane.showInputDialog("스티커 몇개 살건데"); // 스티커 개수를 입력
				int x1 = Integer.parseInt(inputst); // 입력받은 값을 수로 전환
				System.out.println("스티커 " + x1 + "개를 사셨습니다"); // 입력한 값을 출력 확인
				totalst = st * x1; // 스티커 갯수와 가격을 곱해서 스티커 총 값을 대입
			} else if (x == 2) { // 노트 고름
				String inputnt = JOptionPane.showInputDialog("노트 몇개 살건데"); // 노트 갯수를 입력 받음
				int x2 = Integer.parseInt(inputnt); // 입력받은 값을 수로 전환
				System.out.println("노트 " + x2 + "개를 사셨습니다"); // 갯수 출력
				totalnt = nt * x2; // 노트 가격에 갯수를 곱해서 총 노트 가격에 대입
			} else { // 구매 완료
				System.out.println("구매를 종료하고 계산합니다"); // 출력
				total = totalst + totalnt; // 스티커와 노트의 총 값을 더한 후 총 가격에 대입
				if (total >= 25000) { // 조건 생성, 총 가격이 25000원 이상이면 조건문 활성
					total = total - 3000; // 총 가격에 3000원 빼서 다시 대입
				}
				break; // 중지
			}

		} // while
		System.out.println("스티커 총 가격은 " + totalst + "원 입니다.");
		System.out.println("노트 총 가격은 " + totalnt + "원 입니다.");
		System.out.println("총 결제금액은 " + total + "원 입니다."); // 출력
	} // main

}
