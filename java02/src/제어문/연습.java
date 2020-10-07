package 제어문;

public class 연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 100;
		int y = 1;
		//int z = 1;
		while (x >= y) { // x가 y값보다 크거나 같은 경우 while문 안에 값을 계속 반복
			System.out.println(x); // x값을 출력
			//x = x - z; // x에서 z를 빼서 다시 x에 입력
			x--; // 증감연산자 일씩 감소
		}

		int x2 = 5;
		int y2 = 10;
		while (x2 <= y2) { // x2가 y2값보다 작거나 같은 경우 while문 안에 값을 계속 반복
			System.out.println(x2); // x2값을 출력
			//x2 = x2 + z; //위에 이미 z값을 선언/ x2와 z를 더해서 다시 x2에 집어넣음
			x2++; // 증감연산자 일씩 증가 
		}

		int x3 = 1;
		int y3 = 100;
		int z3 = 2;
		while (x3 <= y3) { // x3가 y3값보다 작거나 같은 경우 while문 안에 값을 계속 반복
			System.out.println(x3); // x3값을 출력
			x3 = x3 + z3; // x3와 z3를 더해서 x3에 대입
		}
	}
}
