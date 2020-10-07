package 배열정리;

public class 이차원배열2 {

	public static void main(String[] args) {

		int[][] seat = new int[3][5]; // 각 행마다 열이 똑같으면 뒤의 괄호에 수를 넣어주고([3][5]) 아니면 비워둔다([3][])
		// 배열을 선언하는 순간 공간이 할당
		// seat는 주소가 들어가는 참조형 변수 int[][]는 기본형변수
		// 참조형 변수는 참조하는 주소가 들어간 변수, 기본형 변수는 값이 들어간다
		// 배열은 기본적으로 자동 초기화 int->0

		System.out.println(seat);
		// int[3][5]
		// 0 1 2 3 4
		// 0 0 0 0 0 0
		// 1 0 0 0 0 0
		// 2 0 0 0 0 0
		seat[0][0] = 1;
		seat[0][4] = 1;
		seat[2][4] = 1;
		// 0 1 2 3 4
		// 0 1 0 0 0 1
		// 1 0 0 0 0 0
		// 2 0 0 0 0 1 -> 이렇게 바뀜

		seat[1][2] = 1;
		seat[2][1] = 1;
		System.out.println("행의 개수: " + seat.length);
		for (int i = 0; i < seat.length; i++) { // 0, 1, 2 찍힘
			for (int j = 0; j < seat[i].length; j++) { // seat[?] 행의 열 길이보다 작을 때까지
				System.out.print(seat[i][j] + "\t");
			} // for
			System.out.println();
		} // for

	} // main

}
