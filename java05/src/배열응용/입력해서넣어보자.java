package 배열응용;

import javax.swing.JOptionPane;

public class 입력해서넣어보자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력을 받아서 저장공간에 넣어두고
		//나중에 꺼내서 연산이나 출력을 하고자하는 경우
		String data = null;//참조형은 초기화를 null로 초기화
		for (int i = 0; i < 3; i++) {
			//변수 선언의 위치가 변수를 사용할 수 있는 범위(지역을) 결정
			data = JOptionPane.showInputDialog("취미입력");
		}
		System.out.println(data);
		
		//안되는 코딩
	}

}
