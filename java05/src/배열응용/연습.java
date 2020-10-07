package 배열응용;

import java.util.Random;

public class 연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 임의의값 100개를 만들어서
		// 배열에 넣고
		// 전체출력
		// 첫번째 마지막 더하기
		Random r = new Random();
		int[] data = new int[100];
		for (int i = 0; i < data.length; i++) {
			data[i] = r.nextInt(1000);
		} // for
		for (int i : data) {
			System.out.println(i);
		} // for

		int sum = data[0] + data[99];
		System.out.println(sum);
	}// main

}
