package 컬렉션복습;

public class 계좌 {

	String name; // 이름.
	String field; // 계좌종류.
	int money; // 금액.

//	public 계좌(String n, String f, int m) {
//		name = n;
//		field = f;
//		money = m;
//	}

	// source -> constructor using field로 만들 수 있음.(파라미터있는 생성자 만드는 메뉴)
	// constructor from superclass 하면 기본생성자 만들어 줌.
	public 계좌(String name, String field, int money) {
		super(); // 지워도 됨.
		this.name = name; // this 클래스 바로 밑에 있는 변수야, 전역변수야 라고 말해줌.
		this.field = field;
		this.money = money;
	}

	// 기본생성자는 다른 생성자가 하나도 없을 때만 자동으로 만들어진다.
	// 입력값이 없으면서, 클래스 이름과 동일한 메서드 => 기본 생성자 메서드.
	// 프로그래머가 메서드를 정의하지 않아도, 자동으로 만들어진다. (밑에 있는 애, 자동생성)
//	public 계좌() { // 생성자는 반황유무를 명시하지 않음.
//		// 생성자 메서드는 무조건 void.
//		// 기본성격이 void 인 경우, 보통 생략을 많이 함.
//		// 그렇다고 앞에 void 를 넣으면 안됨, 넣으면 일반 메서드라고 생각해버려서 작동이 안됨.
//
//		// 객체 생성시마다, 자동으로 실행해주어야 하는 처리 내용.
//		// 초기화시킬 내용이 있으면, 이 메서드에다 처리 내용 입력.
//		// new를 이용해서 객체 생성시 무조건 호출되므로,
//		// 생성자 메서드(생성자)
//		System.out.println("내가 객체 생성시마다 자동 호출 됨.");
//		System.out.println("보통 멤버변수 초기화같은 처리를 넣어주는 편입니다.");
//	}

	// 계좌 객체를 생성할 때, name, field, money를 넣지 않으면,
	// 객체를 생성하지 못하게 해야함.
	// 세가지의 값을 엏었을 때만 계좌를 개설하도록 정의.

	// 객체 생성 후, 멤버변수에 들어가있는 값들을 한꺼번에 확인하고자 하는 경우,
	// toString()을 만들어 놓음 됨. => 출력용.
	@Override
	public String toString() {
		return "계좌 [이름=" + name + ", 계좌종류=" + field + ", 금액=" + money + "]";
	}

}
