package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int 가입id = 1111;
		int 가입pwd = 2222;

		int 로그인id = 1111;
		int 로그인pwd = 2222;

		if (가입id == 로그인id && 가입pwd == 로그인pwd) { 
			// 논리연산자 중 and연산자, 여러조건이 모두 true일 때 
			// 전체 논리적인 판단을 true라고 판단하는 경우
			System.out.println("로그인 ok");
		} else {
			System.out.println("로그인 not");
		}
	}

}
