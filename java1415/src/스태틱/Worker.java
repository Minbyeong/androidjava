package 스태틱;

public class Worker {

	public static void main(String[] args) {
		NewShop wk1 = new NewShop("홍길동", '남', 24); // 직원 정보 입력.
		System.out.println(NewShop.count + "명"); // 인원 카운트.
		NewShop wk2 = new NewShop("으흘컥", '여', 23); // 직원 정보 입력.
		System.out.println(NewShop.count + "명"); // 인원 카운트.
		NewShop wk3 = new NewShop("으헝헛", '남', 25); // 직원 정보 입력.
		System.out.println(NewShop.count + "명"); // 인원 카운트.

		System.out.println(wk1);
		System.out.println(wk2);
		System.out.println(wk3); // 입력된 직원 정보 출력. 출력 시에만 메모리 할당.
		System.out.println("직원들의 평균 나이: " + NewShop.average);
		// 직원들의 평균 나이 출력. 출력 시에만 메모리 할당.
	}
}
