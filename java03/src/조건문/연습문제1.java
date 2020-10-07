package 조건문;

import javax.swing.JOptionPane;

public class 연습문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 0; //계산한 값을 넣을 변수 선언
		String num1 = JOptionPane.showInputDialog("첫번째 수를 입력");
		String num2 = JOptionPane.showInputDialog("두번째 수를 입력"); //계산을 위한 값 두개 입력 받기
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2); //받은 값들을 숫자로 변환

		String x = JOptionPane.showInputDialog("하려고 하는 사칙연산을 입력"); //사칙연산을 입력 받기
		char y = x.charAt(0); //받은 문자열을 캐릭 값으로 가져와야 함으로, 받은 값의 첫번째 자리를 가져옴

		switch (y) { //경우를 따짐
		case '+': // 더하기면
			total = num11 + num22;
			System.out.println("더한 값은 " + total); //출력
			break; //정지
		case '-':
			total = num11 - num22;
			System.out.println("뺀 값은 " + total); //출력
			break; //정지
		case '*':
			total = num11 * num22;
			System.out.println("곱한 값은 " + total); //출력
			break; //정지
		case '/':
			total = num11 / num22;
			System.out.println("나눈 값은 " + total); //출력
			break; //정지

		default: //연산을 잘못 입력할 경우
			System.out.println("잘못된 입력입니다."); //출력
			break; //정지
		} //switch
	} //main

}
