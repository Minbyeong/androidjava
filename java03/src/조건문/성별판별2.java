package 조건문;

import javax.swing.JOptionPane;

public class 성별판별2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ssn = JOptionPane.showInputDialog("주민번호 입력");
		// 스트링은 위치 값이 있음, 0번부터 시작
		// 프로그램 언어로 문자를 char로 받을 수 있는 방법은 없다
		// string으로 입력 받아서, 원하는 char만 추출을 함
		char gender = ssn.charAt(7);
		//String sub = ssn.substring(7, 10);
		// 위치를 가지고 특정한 문자 한개를 추출하면 됨
		// 위치 = index,인덱스
		// 인덱스는 0부터 시작
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		default:
			System.out.println("잘못입력");
			break;
		}
	}

}
