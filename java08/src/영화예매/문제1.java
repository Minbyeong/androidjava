package 영화예매;

import java.util.Random;

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random(); // 랜덤 생성

		int[] num = new int[100]; // 100명의 인원 배열하고 주민번호 뒷자리를 넣겠다
		String numch; // 랜덤으로 받은 주민을 문자열로 바꿈
		char x; // 문자열의 1번째 글자
		char y; // 문자열의 2번째 글자

		for (int i = 0; i < num.length; i++) { // 주민번호 뒷자리 100개 생성
			num[i] = r.nextInt(5000000); // 주민 뒷 7자리의 숫자 중 앞자리가 5가 안나오도록 생성
			while (num[i] < 1000000) { // 7자리가 안되면 계속 반복해서 다시 뽑기
				num[i] = r.nextInt(5000000);
			}
			System.out.println(num[i]); // 제대로 나오나 출력해보고
		}

		int manseoul = 0;// 개수를 카운트하기 위한 변수 선언
		int manbusan = 0;
		int manjeju = 0;
		int manetc = 0;
		int womseoul = 0;
		int wombusan = 0;
		int womjeju = 0;
		int wometc = 0;

		for (int i = 0; i < num.length; i++) { // 100의 배열을 판별
			numch = String.valueOf(num[i]); // 생성한 주민번호를 문자로 바꿔줌 임시 저장
			x = numch.charAt(0); // 바꾼 문자열에 1번째 값 추출,임시저장
			y = numch.charAt(1); // 바꾼 문자열에 2번째 값 추출,임시저장
			if (x == '1' && y == '1' || x == '3' && y == '1') { // 임시로 저장된 값을 조건과 비교
				// 성별값이 1이고 지역값이 1인 사람과 성별값이 3이고 지역값이 1인 사람 골라서
				manseoul++;
			} else if (x == '1' && y == '2' || x == '3' && y == '2') {
				// 위와 비슷한 의미의 내용
				manbusan++;
			} else if (x == '1' && y == '3' || x == '3' && y == '3') {
				manjeju++;
			} else if (x == '1' && y != '1' && y != '2' && y != '3' || x == '3' && y != '1' && y != '2' && y != '3') {
				manetc++;
			} else if (x == '2' && y == '1' || x == '4' && y == '1') {
				womseoul++;
			} else if (x == '2' && y == '2' || x == '4' && y == '2') {
				wombusan++;
			} else if (x == '2' && y == '3' || x == '4' && y == '3') {
				womjeju++;
			} else {
				wometc++;
			}
		}
		System.out.println("서울 지역 " + (manseoul + womseoul) + "명 중 남자는 " + manseoul + "명, 여자는 " + womseoul + "명이다.");
		System.out.println("부산 지역 " + (manbusan + wombusan) + "명 중 남자는 " + manbusan + "명, 여자는 " + wombusan + "명이다.");
		System.out.println("제주 지역 " + (manjeju + womjeju) + "명 중 남자는 " + manjeju + "명, 여자는 " + womjeju + "명이다.");
		System.out.println("기타 지역 " + (manetc + wometc) + "명 중 남자는 " + manetc + "명, 여자는 " + wometc + "명이다.");
	}// main

}
