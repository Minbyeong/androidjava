package 영화예매;

import java.util.Scanner;

public class 콘솔에서입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 콘솔에서 입력: Scanner
		// 모든 입력의 데이터 타입은 String
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력>> ");
		String x = scan.next(); // 단어 입력
		System.out.println("이름: " + x);
		System.out.print("나이를 입력>> ");
		int y = scan.nextInt();
		System.out.println("내년 나이는 " + (y + 1));

		// 현재키 입력:150.5
		// 내년키는 170.5
		System.out.print("현재 키를 입력하시오>> ");
		double a = scan.nextDouble();
		System.out.println("내년 키는 " + (a + 20));
		// 밖에비가 오나 : true
		// true이면 우산을 가지고 가자
		// false이면 우산을 놓고가자
		System.out.print("밖에 비가 오니>> ");
		boolean b = scan.nextBoolean();
		if (b) {
			// boolean은 이미 그 안에 true false가 들어 있어서 ==true 를 안써도 된다
			System.out.println("우산을 가지고 가자");
		} else {
			System.out.println("우산을 놓고 가자");
		}
		System.out.println("당신의 목표는>>");
		scan.nextLine(); // 위에서 입력된 엔터로 밑에 넥스트 라인이 먹지 않기 때문에 한번 앞에서 위의 엔터를 받는 넥스트 라인을 만들어 주고 밑에 문장 실행
		String c = scan.nextLine();// 엔터치기 전까지의 문장
		System.out.println("목표는 " + c);
	}

}
