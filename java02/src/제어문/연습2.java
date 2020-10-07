package 제어문;

import javax.swing.JOptionPane;

public class 연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력
		String want = JOptionPane.showInputDialog("먹고 싶은게 뭐야?");
		// 처리
		String result = "";
		if (want.equals("아이스크림")) {
			result = "뚜레";
		} else if (want.equals("아이스커피")) {
			result = "이디야";
		} else {
			result = "물";
		}
		// 츌력
		System.out.println(result);
	}

}
