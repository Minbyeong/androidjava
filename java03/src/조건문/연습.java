package 조건문;

import javax.swing.JOptionPane;

public class 연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ok = 0, no = 0, etc = 0; // 긍정 부정 기타 횟숫 카운팅을 위한 변수 지정
		while (true) { // 종료를 하기 전까지 무한으로 돌리겠다 설정
			String data = JOptionPane.showInputDialog("긍정) ok, 부정) no, 기타) etc, 종료하실?) end");// 어느 항목을 선택할건지 입력받기
			if (data.equals("ok")) { // ok를 입력 받으면 긍정이란 단어를 출력
				System.out.println("긍정");
				ok++; // 증감연산자 //긍정횟수 1추가해서 카운팅
			} else if (data.equals("no")) { // no를 입력하면 부정이란 단어 출력
				System.out.println("부정");
				no++; // 부정횟수 1추가 카운팅
			} else if (data.equals("end")) { // 끝내고 싶다는 것을 설정해서 종료한다는 것을 출력
				// 무한루프 일때,끝내는 조건을 맨처음에 먼저 설정 해주는 것이 좋음
				System.out.println("프로그램 종료");
				break; // 종료
				// System.exit(0); 프로그램을 종료하면 while문 밖의 코드가 작동 x
			} else { // 긍정도 부정도 아닐경우 기타를 출력
				System.out.println("모르겐쉔");
				etc++; // 기타 횟수 1추가 카운팅
			}
		} // while //break가 걸리기 전까지 계속 돌림
		System.out.println("긍정횟수" + ok + "번");
		System.out.println("부정횟수" + no + "번");
		System.out.println("모름횟수" + etc + "번"); // 카운팅 된 값들을 마지막에 알려줌
	}// main

}
