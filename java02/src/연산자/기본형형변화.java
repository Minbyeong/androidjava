package 연산자;

public class 기본형형변화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100; // int의 범위는 -21억~21억,4바이트
		byte y = 120; // byte의 범위는 -128~127,1바이트
		// 큰 <- 작: 자동형변환
		x = y; // x에 y를 집어넣음
		System.out.println(x);
		int z = 127;
		// 작 <- 큰: 강제형변환 ()를 사용
		// (자르고 싶은 데이터형)변수명
		byte w = (byte) z;
		System.out.println(w);

		//int q = 1000;
		// byte t = q;
		// 강제형변환 하는 경우는 강제로 변환하고자 하는 타입 범위에 값이 들어가야 한다
		
		
	}

}
