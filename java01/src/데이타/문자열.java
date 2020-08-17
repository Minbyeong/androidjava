package 데이타;

public class 문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 코드 자동 정렬 : ctrl + shift + f
		// 기본데이터는 아닌데, 사람이 워낙 많이 쓰는 데이터의 형태이므로
		// 기본데이터처럼 쓰게 해둔 문자열을 나타내는 키워드: String
		String name = "홍길동";
		String company = "메가 더 조은";

		System.out.println(name + "은 " + company + " 소속이다.");
		// +연산자는 하나라도 String이면 모두 다 String결합을 의미
		int age = 100;
		System.out.println(name + "은 " + age + "살이다.");
		// 위 또한 스트링
		String subject; // 선언 : 아직 값은 넣지 않았지만 자바에서 메모리가 할당된다
		subject = "자바"; // 값을 넣음 =:대입연산자,할당연산자
		System.out.println("내 과목은 " + subject);

		// String day;// day 라는 이름으로 선언
		// String은 day라는 변수에 들어갈 테이터 유형
		// data type(자료형)
		// System.out.println(day); // 현재 상태: 스레기값 상태, 연산도 안되고 출력도 안됨

	}

}
