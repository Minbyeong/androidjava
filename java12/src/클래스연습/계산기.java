package 클래스연습;

public class 계산기 {
	// 계산기 => 클래스
	// 프로그램하려고 하는 대상은 2가지 특성을 가지고 있음.
	// 1)눈에 보이는 속성: 색, 크기, 가
	// => 멤버변수(전역변수, global변수, 클래스 전체영역에서 사용이 가능)
	String color; // 참조형(null로 초기화)
	int price;
	int size; // 기본형(0으로 초기화)
	// 2)동작: 더하다, 빼다, 곱하다, 나누
	// => 멤버메서드(입력값, 반환값 유무)

	public int 더하다(int c1, int c2) { // 메서드(기능) 정
		// 괄호 안 중간에 값을 받아주는 매개변수(parameter)

		// void 부분은 반환값의 부분, 뒤의 괄호가 입력값의 부분
		// void: 없다, 반환값이 없다.
		int result = c1 + c2;
		return result;
	}

	public int 빼다(int c1, int c2) {
		int result = c1 - c2;
		return result;
	}

	public int 곱하다(int c1, int c2) {
		int result = c1 * c2;
		return result;
	}

	public void 나누다() {

	}
}
