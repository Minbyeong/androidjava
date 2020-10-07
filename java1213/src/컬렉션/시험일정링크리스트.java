package 컬렉션;

import java.util.LinkedList;

public class 시험일정링크리스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList test = new LinkedList();
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");
//		System.out.print("전체 시험 과목: ");
//		for (int i = 0; i < test.size(); i++) {
//			System.out.print(test.get(i) + " ");
//		}
		System.out.println("전체 시험 과목 :" + test);

		System.out.println();
		for (int i = 0; i <= test.size(); i++) {
			test.remove();
			System.out.print((i+1) + "일차 시험본 후 과목: " + test);
			System.out.println();
		}
	}

}
