package 영화예매;

import java.util.Scanner;

public class 무한루프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int[] seat = new int[10]; // 좌석마다 예매 상황을 저장할 공간

		int count = 0;
		while (true) {
			System.out.println("--------------------------------");
			for (int i = 1; i < seat.length + 1; i++) {
				System.out.print(i + "  ");

			} // for
			System.out.println();
			System.out.println("--------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "  ");
			} // for
			System.out.println();

			System.out.print("원하는 좌석을 입력(종료-1)>> ");
			int choice = scan.nextInt();
			if (choice == -1) {
				System.out.println("프로그램 종료");
				break;
			} // if

			if (seat[choice - 1] == 1) {
				System.out.println("이미 예약된 자리입니다.");
				System.out.println("다른 자리를 선택해 주세요.");
				if (seat[choice - 1]==1) {
					break;
				}
			} else {
				seat[choice - 1] = 1; // 이미 돌고 있는 애들
				System.out.println("예약을 완료했습니다.");
				count++;
			}
		} // while
		System.out.println("총 " + count + "석이 예매되었습니다.");
		System.out.println("결제 금액은 " + (count * 10000) + "원 입니다.");
	} // main

}

//			System.out.print("게임을 계속 하실래요? 1)예 2)아니요>>");
//			int choice = scan.nextInt();
//			if (choice == 2) {
//				System.out.println("프로그램 종료");
//				break;
//			} // if
