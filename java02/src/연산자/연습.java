package 연산자;

public class 연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x = 100;
		int y = x; // 자동형변화
		System.out.println(y);

		// int x2 = 300;
		// byte y = x; // 형변환불가: 이미 x2의 값이 byte의 범위를 초과함

		double x3 = 400;
		int y2 = (int) x3; // 강제형변환
		System.out.println(y2);

		int x4 = 400;
		double y3 = x4; // 자동형변환
		System.out.println(y3);
	}

}
