package 영화예매;

import java.util.Scanner;

public class 극장예매2차원 {

	public static void main(String[] args) {
		// 2차원 배열은 각 해마다 열을 다르게 가질 수 있다.
		// 2차원 배열은 1차원 배열을 여러 개 붙여놓은 것.

		Scanner scan = new Scanner(System.in); // 스캐너 사용
		int[][] seat = new int[3][10]; // 3행 10열의 배열을 만듬
		char[] row = { 'A', 'B', 'C' }; // 행 번호를 표현해줄 문자열 배열
		int count = 0; // 예매 좌석 개수 확인용 변수
//		seat[1][0] = 1;
		while (true) { // 무한반복
			System.out.println("--------------------------------");
			System.out.print("   ");
			for (int i = 1; i < 11; i++) {
				System.out.print(i + "  "); // 열의 좌석 번호를 찍어줌
			} // for
			System.out.println();
			System.out.println("--------------------------------");
			for (int i = 0; i < seat.length; i++) {// 행(0~2), 3번 찍어줄거임
				System.out.print(row[i] + "  "); // 문자배열을 차례로 뿌려줌
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + "  "); // 고를 좌석 표시, 배열을 찍어주겠다
				}
				System.out.println();
			} // for

			System.out.println("원하는 좌석을 입력하시오");
			System.out.println("예매를 그만하시려면 'exit'을 입력하시오");
			System.out.print("원하는 행>> ");
			String x = scan.nextLine(); // 행값 입력
			int choice1 = 0;

			if (x.equals("A")) {
				choice1 = 1;
			} else if (x.equals("B")) {
				choice1 = 2;
			} else if (x.equals("C")) {
				choice1 = 3;
			} else if (x.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.print("원하는 열>> ");
			int choice2 = scan.nextInt(); // 열값 입력
			if (seat[choice1 - 1][choice2 - 1] == 1) { // 고른 좌석의 값이 이미 1이면 다시 골라라
				System.out.println("이미 예약된 자리입니다.");
				System.out.println("다른 자리를 선택해 주세요.");
			} else {
				seat[choice1 - 1][choice2 - 1] = 1; // 이차원 배열 안에 예매가 되었다고 1값을 대입
				System.out.println("예약을 완료했습니다.");
				count++; // 1로 바뀌면 카운트
			}
			scan.nextLine(); // 위에서 스탠 라인을 받으면 엔터값이 남아서 반복이 돌아오면 작동을 안함 엔터값을 먹어줄 넥스트 라인 추가
		} // while
		System.out.println("총 " + count + "석이 예매되었습니다."); // 카운트 출력
		System.out.println("결제 금액은 " + (count * 10000) + "원 입니다.");
	}// main

}
