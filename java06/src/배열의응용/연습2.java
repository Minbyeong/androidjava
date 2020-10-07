package 배열의응용;

public class 연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] subject = { "국어", "수학", "과학", "컴퓨터", "영어" }; // 과목 배열
		int[] score1 = { 100, 99, 77, 87, 66 };// 점수 배열
		int[] score2 = score1.clone();// 점수 배열 복사
		// 2학기에 점수가 변동된 과목지정
		score2[2] = 44; // 특정 위치의 값을 교체
		score2[4] = 55;

		// 1,2 학기 중 평균이 더 높은 학기는?
		int sum1 = 0; // 합계를 담을 초기변수
		int sum2 = 0;
		for (int i = 0; i < score1.length; i++) {
			sum1 += score1[i]; // 배열의 합을 구하는 반복문
			sum2 += score2[i];
		}
		double average1 = (double) sum1 / score1.length; // 구해진 합을 통해 평균을 구하고
		double average2 = (double) sum2 / score2.length; // 평균의 값은 소수점이 나옴으로 더블형으로 변경
		if (average1 > average2) { // 더 높은 평균값을 갖고 있는 학기를 출력
			System.out.println("1학기 평균 " + average1 + "으로 1학기가 더 높다");
		} else {
			System.out.println("2학기 평균 " + average2 + "으로 2학기가 더 높다");
		}

		// 점수가 변동된 과목의 수와 과목명은?
		int count = 0; // 바뀐 과목의 수를 담을 변수를 선언
		for (int i = 0; i < score1.length; i++) {
			if (score1[i] != score2[i]) { // 배열을 비교했을 때 같지 않으면
				System.out.println(subject[i] + "의 점수가 변동됨"); // 어떤과목인지 출력하고
				count++; // 수를 카운트
			}
		}
		System.out.println("점수가 변동된 과목의 수는 " + count + "개 이다.");

	}// main

}// class
