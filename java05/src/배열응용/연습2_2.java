package 배열응용;

import java.util.Random;

public class 연습2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제1000문제
		// 답안지 0-3까지 중 1000개를 만드세요
		// 내 답안지 0-3까지 중 1000개를 만드세요
		// 채점
		// 각 문항 당 오답처리
		Random r = new Random();// 랜덤값
		int count = 0;// 정답수 세줄 변수
		int[] num1 = new int[1000]; // 답안지
		int[] num2 = new int[1000]; // 내 답안지
		for (int i = 0; i < num1.length; i++) {
			num1[i] = r.nextInt(4); // 0-3까지의 수를 랜덤하게 생성
			num2[i] = r.nextInt(4);
		} // for

		System.out.println("문항\t정답\t내답\t처리");

		for (int i = 0; i < num1.length; i++) {
			String result = "오답"; // 결과값 선언
			if (num1[i] == num2[i]) { // 같은면
				result = "정답"; // 결과값을 바꿔주고
				count++;// 개수 세줌
			} // if
			System.out.println(i + "\t" + num1[i] + "\t" + num2[i] + "\t" + result);
		} // for
		System.out.println("점수는 " + count);

	}// main

}
