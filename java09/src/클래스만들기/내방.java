package 클래스만들기;

public class 내방 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// '.' => 접근연산자
		휴대폰 p1 = new 휴대폰();
		// color size company 멤버변수 복사 => 자동 초기화
		// p1변수 생셩 => 멤버변수들을 가르키는 주소가 들어감

		System.out.println(p1.color);
		System.out.println(p1.size); // 찍어보면 초기화값이 들어가 있는 것을 볼 수 있다

		p1.color = "흰색";
		p1.size = 7;
		p1.company = "삼성";
		System.out.println("p1 휴대폰의 색은 " + p1.color);
		System.out.println("p1 휴대폰의 크기는 " + p1.size);
		System.out.println("p1 휴대폰의 회사는 " + p1.company);
		p1.문자하다();

		System.out.println("------------------------------");

		휴대폰 p2 = new 휴대폰();
		p2.color = "빨강";
		p2.size = 11;
		p2.company = "애플";
		System.out.println("p2 휴대폰의 색은 " + p2.color);
		System.out.println("p2 휴대폰의 크기는 " + p2.size);
		System.out.println("p2 휴대폰의 회사는 " + p2.company);
		p2.전화하다();

		System.out.println("------------------------------");

		강아지 dog1 = new 강아지();
		dog1.color = "흰색";
		dog1.size = "소형견";
		System.out.println("dog1 견종의 크기는 " + dog1.size);
		System.out.println("dog1의  털색은 " + dog1.color);
		dog1.꼬리를흔들다();

		System.out.println("------------------------------");

		강아지 dog2 = new 강아지();
		dog2.color = "갈색";
		dog2.size = "대형견";
		System.out.println("dog2 견종의 크기는 " + dog2.size);
		System.out.println("dog2의  털색은 " + dog2.color);
		dog2.물다();
	}

}
