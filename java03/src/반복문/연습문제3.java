package 반복문;

public class 연습문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0; //계산한 값을 집어넣을 변수 선언
		for (int i = 1; i < 10; i++) { //몇단을 출력할 것인가, 1~9단까지 하겠다
			
			for (int j = 1; j < 10; j++) { //각 단의 뒤에 곱해줄 수를 1~9까지 지정
				if (j>i) { //j가 i보다 크면 지나감
					continue;
				}
				x = i * j; // i와 j를 곱해서 x에 대입
				System.out.println(x); //출력
			} // for
			System.out.println("");
		} // for
	} // main

		

	

}
