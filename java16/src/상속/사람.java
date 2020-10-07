package 상속;

public class 사람 extends Object {
//멤버변수, 멤버메서드

	String name;
	int age;

	// 파라메터있는 생성자를 정의하게 되면,
	// 파라케터없는 기본생성자는 자동으로 만들어지지 않는다.
	// new 사람(); // 불가

	public void eat() {
		System.out.println("먹다");
	}

	public 사람(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "사람 [name=" + name + ", age=" + age + "]";
	}

}
