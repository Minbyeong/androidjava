package 배열응용;

import java.util.Random;

import javax.swing.JOptionPane;

public class 입력해서넣어보자4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력을 받아서 저장공간에 넣어두고
		// 나중에 꺼내서 연산이나 출력을 하고자하는 경우
		Random r = new Random();
		int[] data = new int[1000];// 참조형은 초기화를 null로 초기화
		for (int i = 0; i < 1000; i++) {
			// 변수 선언의 위치가 변수를 사용할 수 있는 범위(지역을) 결정
			// String s = JOptionPane.showInputDialog("수 입력");
			data[i] = r.nextInt(100);
		}
		for (int x : data) {
			System.out.println(x);
		}
	}

}
