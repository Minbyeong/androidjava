package 배열정리;

public class 참조형변수족사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2, 3, 4, 5 };
//		int[] y = x; // 주소복사 (얕은 복사)
		int[] y = x.clone(); // 주소가 가르키는 값의 리스트를 복사(깊은 복사)
		// 배열인 참조형변수는 깉은복사를 해야함

		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		} // for
		System.out.println();
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		} // for

		System.out.println();
		System.out.println("--------------------");
		x[0] = 9;
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		} // for
		System.out.println();
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		} // for

		System.out.println();
		System.out.println("x의 주소: " + x);
		System.out.println("y의 주소: " + y); // 찍어보면 주소가 다른것을 볼 수 있음
	} // main

}
