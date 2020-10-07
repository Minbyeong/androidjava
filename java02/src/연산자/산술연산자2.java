package 연산자;

public class 산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 200;
		int y = 100;
		// 더해
		int sum = x + y;
		// 자바에서는 인트 인트 계산은 무조건 인트
		System.out.println("두 수의 합은 " + sum);
		double div = y / x;
		// 8바이트 double <- 4바이트 int 집어넣기 가능
		System.out.println("두 수의 나눗셈은 " + div);
		// 계산시 하나라도 더블이면 무조건 더블
		// 하나만 정수를 실수로 강제로 변환해서 계산시 사용 가능
		// 강제로 타입을 바꾸는 것 : 타입변환(형변환)
		double div2 = (double) y / x;
		System.out.println(div2);

		double div3 = (double) (y / x);
		System.out.println(div3);
		//이미 안에서 계산이 끝난걸 더블로 바꾼거라 0.0이 나옴
	}

}
