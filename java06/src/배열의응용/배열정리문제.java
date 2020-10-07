package 배열의응용;

import javax.swing.JOptionPane;

public class 배열정리문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1번 문제
		int[] num = { 10, 20, 30, 40, 50 };
		System.out.println(num[0] + num[1]);

		// 2번 문제
		String[] s = new String[3];
		for (int i = 0; i < s.length; i++) {
			s[i] = JOptionPane.showInputDialog("과목을 입력하시오");
		}
		System.out.println("**" + s[0] + "보다는 " + s[1]);

		// 3번 문제
		int[] num2 = { 11, 22, 33, 44 };
		int target = 33;
		for (int i = 0; i < num2.length; i++) {
			if (num2[i] == target) {
				System.out.println(target + "의 위치는 " + (i + 1) + "번째에 위치");
			}
		}

		// 4번 문제
		int[] num3 = new int[5];
		for (int i = 0; i < num3.length; i++) {
			num3[i] = i + 1;
			System.out.println(i + "위치의 값은 " + num3[i]);
		}
//		for (int i = 0; i < num3.length; i++) {
//			String s2 = JOptionPane.showInputDialog("1~5를 순서대로 입력하시오");
//			num3[i] = Integer.parseInt(s2);
//			System.out.println(num3[i]);
//		}

		// 5번 문제
		int[] num4 = { 66, 77, 88, 99 };
		int max = num4[0];
		for (int i = 0; i < num4.length; i++) {
			if (num4[i] > max) {
				max = num4[i];
			}
		}
		System.out.println("문제 5번 최대값은 " + max);

		// 6번 문제
		int[] num5 = { 66, 77, 88, 99 };
		int temp = num5[0];
		num5[0] = num5[3];
		num5[3] = temp;
		for (int i = 0; i < num5.length; i++) {
			System.out.println(num5[i]);
		}

	}// main

}// class
