package 스태틱;

public class NewShop {

	String name;
	char gender;
	int age; // 이름, 성별, 나이를 받아주는 동적변수.

	static int count;
	static int sum;
	static int average; // 인원 수, 나이의 합-평균을 구하기 위한 정적변수.

	public NewShop(String name, char gender, int age) {
		super(); // 생략 가능.
		count++; // 인원 수 카운트.
		sum += age; // 나이합.
		average = sum / count; // 나이평균, 합을 카운트된 수로 나눠주기.
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "NewShop [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	} // 출력은 스트링으로 하고 싶다.

}
