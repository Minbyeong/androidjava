package 조건문;

import javax.swing.JOptionPane;

public class 사원번호입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String com = JOptionPane.showInputDialog("사원번호 입력");
		char dep = com.charAt(0);
		String num = com.substring(1, 4);
		// index 1~3범위 추출이면 substring(1,4)써줌
		// endindex는 3보다 1큰 4를 써주어야 함
		switch (dep) {
		case 'A':
			System.out.println("사원부서는 기획부입니다.");
			break;
		case 'B':
			System.out.println("사원부서는 총무부입니다.");
			break;
		case 'C':
			System.out.println("사원부서는 개발부입니다.");
			break;
		default:
			System.out.println("해당부서 없음.");
			break;
		}
		System.out.println("사원고유 번호는 " + num + "입니다.");
	}

}
