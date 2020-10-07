package 클래스만들기;

public class 계산기2 {
	// 변수의 종류는 값을 저장하는 기본형변수와 참조형변수
	// 사용하는 범위를 나타내는 전역변수와 지역변수
	// 클래스 안에서 사용되어 반복되어 사용하는 인스턴스(멤버)변수가 있음

	// 각 부품의 기능을 정의할 때는 메서드를 쓴다.
	// 메소드의 입력값 잠깐 저장할 용도로 선언된 변수, 메소드의
	// 사용과 처리의 중간 다리역할을 변수: 매개변수(parameter, 파리메터)
	public void add(int x, int y) { // void == 없다(갖고오는 값이).
		// x, y 변수는 add메서드 지역에서만 쓸 수 있는 지역변수
		// local변수, 로컬변수
		// 지역변수는 자동초기화 되지 않음.
		int result = x + y;
		System.out.println("합은 " + result);
	}

	public void minus() {
		System.out.println("빼기");
	}

	public int mul(int x, int y) {
		int result = x * y;
		return result; //30000
	}

	public void div() {
		System.out.println("나누기");
	}

}
