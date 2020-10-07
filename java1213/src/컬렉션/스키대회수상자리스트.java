package 컬렉션;

import java.util.ArrayList;

public class 스키대회수상자리스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();

		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키"); // 0~3까지

		for (int i = 0; i < list.size(); i++) {
			System.out.print((i + 1) + ": " + list.get(i) + " ");
		}

		System.out.println();

		// 2등 탈락 처리
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.print((i + 1) + ": " + list.get(i) + " ");
		}

	}

}
