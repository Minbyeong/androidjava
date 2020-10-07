package 스태틱;

public class Day {

	String doing;
	int time;
	String location;
	// 입값이 위 3개가 다 있어야 이 부품을 이용할 수 있음.
	// 입력값(파라미터, 매개변수)가 있는 클래스 이름과 동일한,
	// 메서드를 만들어주세요. 객체 생성시 자동 호출됨.
	// 생성자(메서드, constructor)

	static int count; // 선언의 위치가 변수를 사용할 수 있는 범위. 전역변수는 자동초기화.
	static int sum; // 시간 누적.
	final static String company = "mega"; // final 이 붙으면 이거 변화 없음 이라는 소리 그대로 한번 쓰겠다.
	// static 동적 변수가 아니라고 선언해주는 것.

	public Day(String doing, int time, String location) {
		super();
		count++;
		sum = sum + time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	} // 무조건 얘 세개 값이 다 있어야 객체를 생성할거야 하면 이렇게,

	// static 메서드(정적 메서드): 객체 생성하지 않아도, 이 기능을 바로 사용 가능.
	// 클래스 이름으로 바로 접근해서 사용할 수 있는 메서드로 만드는 것이 좋다.
	// heap영역 메모리 할당 안해도 됨. 개꿀.
	public static String getName() {
		return company; // static 메서드 내에서는 인스턴스 변수 사용 불가.
		// 인스턴스 변수는 객체 생성 후 접근하는 변
	}
	// 자주사용하는 기능의 메서드는 바로바로 쓸 수 있게 만들어두는 것이 좋다.
	// Integer.parseInt(), JOpionpane.showInputDialog() 같은 애들.

	// 일반 메서드: 객체 생성 후, 그 주소값이 생기면, 참조형 변수의 주소로 접근 가능.
	// 객체 생성 다 하고 heap 영역에 메모리 할당까지 다 해야 쓸 수 있음.
	public int getAvg() {
		return sum / count;
	}

	// 그게 아니라 만들고 나중에 넣어도 되게 할거야 하면 밑에 기본생성자 만들어두기.
//	public Day() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	// 메서드 이름을 동일하게 할 수 있음.
	// 단, 입력값이 달라야 함.
	// 하나의 이름을 메서드 이름으로 해서 여러개 만들 수 있음.
	// 오버로딩(overloading)
	// =>다형성(하나의 이름으로 다양한 형태의 메서드를 구현)
	// (polymorphism, 폴리모피즘)

	// 파라메터를 통해서 만든 멤버변수값을 한꺼번에 출력하고자 하는 경우,
	// toString을 재정의.
	@Override // 재정의, 오버라이드, 오버라이딩한다.
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}

}
