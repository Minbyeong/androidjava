package 배열의응용;

import java.util.Arrays;

public class 배열정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] age = { 99, 10, 100, 88, 33, 24, 10, 77 };
		// 배열 복사할 때는 clone()함수를 사용
		// 깊은 복사, 배열은 깊은 복사를 사용해야한다.
		// 깊은 복사를 해야 배열은 따로 따로 만들어진다.
		int[] age2 = age.clone();

		for (int i : age) {
			System.out.print(i + "\t");
		}

		System.out.println();

		age2[0] = 999;
		for (int i : age2) {
			System.out.print(i + "\t");
		}

		System.out.println();
		System.out.println("------------------------------------");

		Arrays.sort(age);
		// 파괴함수, 비파괴함수
		for (int i : age) {
			System.out.print(i + "\t");
		}
	}

}
