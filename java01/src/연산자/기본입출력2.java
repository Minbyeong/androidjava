package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = JOptionPane.showInputDialog("첫번째 수를 입력");
		// ctrl + alt + 화살표 아래 : 한줄 복사
		// alt + 화살표 방향: 이동
		String num2 = JOptionPane.showInputDialog("두번째 수를 입력");
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		int num12 = num11 + num22;
		//+연산자: cpu가 계산해준다
		System.out.println("결과 값은 " + num12);
	}

}
