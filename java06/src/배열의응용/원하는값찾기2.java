package 배열의응용;

import java.util.Random;

public class 원하는값찾기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		int[] number = new int[100];
		for (int i = 0; i < number.length; i++) {
			number[i] = r.nextInt(100);//-100; 뒤에 -숫자를 해주면 음수가 나옴 // 0~999
		}
//		for (int i = 0; i < number.length; i++) {
//			System.out.println(i + ": " + number[i]);
//		}

		int max = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			}
		}

		System.out.println("최대값은 " + max);
		int maxcount = 0;
		for (int i = 0; i < number.length; i++) {
			if (max == number[i]) {
				System.out.println(max + "의 위치는 " + i);
				maxcount++;
			}
		}
		System.out.println(max + "의 개수는 " + maxcount);

		System.out.println("-----------------------------");

		int min = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] < min) {
				min = number[i];
			}
		}

		System.out.println("최소값은 " + min);

		int mincount = 0;
		for (int i = 0; i < number.length; i++) {
			if (min == number[i]) {
				System.out.println(min + "의 위치는 " + i);
				mincount++;
			}
		}
		System.out.println(min + "의 개수는 " + mincount);
//		int target = 884;
//		int count = 0;
//		for (int i = 0; i < number.length; i++) {
//			if (number[i] == target) {
//				System.out.println(target + "의 위치는 " + i);
//				count++;
//			}
//		}
//		System.out.println(target + "의 개수는 " + count);
	}

}
