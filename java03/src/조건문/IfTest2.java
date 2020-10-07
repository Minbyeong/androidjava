package 조건문;

import javax.swing.JOptionPane;

public class IfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// alt + 화살표는 줄 이동
		// 누적시키는 변수는 반복문 안에 넣으면 안됨.
		// 반복할 때 마다 누적되지 않고, 초기화되버림
		int ok = 0, no = 0, etc = 0;
		for (int i = 0; i < 5; i++) {
			String data = JOptionPane.showInputDialog("긍정이면 ok, 부적이면 no, 아니면 알아서");
			if (data.equals("ok")) {
				System.out.println("긍정");
				ok++; // 증감연산자
			} else if (data.equals("no")) {
				System.out.println("부정");
				no++;
			} else {
				System.out.println("모르겐쉔");
				etc++;
			}
		}
		System.out.println("긍정횟수" + ok);
		System.out.println("부정횟수" + no);
		System.out.println("모름횟수" + etc);
	}

}
