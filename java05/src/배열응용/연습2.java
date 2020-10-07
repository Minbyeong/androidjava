package 배열응용;

import java.util.Random;

public class 연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제1000문제
		// 답안지 0-3까지 중 1000개를 만드세요
		// 내 답안지 0-3까지 중 1000개를 만드세요
		// 채점
		// 각 문항 당 오답처리
		Random r = new Random();
		int count = 0;
		int[] num1 = new int[1000]; // 답안지
		int[] num2 = new int[1000]; // 내 답안지
		for (int i = 0; i < num1.length; i++) {
			num1[i] = r.nextInt(4);
			num2[i] = r.nextInt(4);
		}

		for (int i = 0; i < num1.length; i++) {
			if (num1[i] == num2[i]) {
				System.out.println("문항" + (i + 1) + "의 정답은 " + num1[i] + "내답은 " + num2[i] + "처리=정답");
				count++;
			} else {
				System.out.println("문항" + (i + 1) + "의 정답은 " + num1[i] + "내답은 " + num2[i] + "처리=오답");
			}
		}
		System.out.println("점수는 " + count);

	}

}
