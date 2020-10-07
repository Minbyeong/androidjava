package 반복문;

public class 별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 1; i < 6; i++) { //5줄 코드를 찍을거다
			for (int j = 0; j < i; j++) { //j가 i보다 작을때 별을 찍는데 그 갯수가 하나씩 증가
				System.out.print("*"); //print를 사용하여 가로방향으로 출력
			}
			System.out.println(""); //줄을 매번 하나씩 아래로
		} //for
		for (int i = 0; i < 4; i++) { //4줄을 만들고
			for (int j = 4-i; j > 0; j--) { //별의 갯수가 4부터 차례로 내려가도록 
				System.out.print("*"); 
			}
			System.out.println("");
		} //for
	} //main
}

