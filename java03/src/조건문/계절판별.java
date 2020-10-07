package 조건문;

public class 계절판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = 11;
		System.out.println("지금은 " + month + "월");
		switch (month) {// 정수 (byte, short, int)
						// 실수는 x
						// 문자, 문자열(String)
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("여름");
			break;
		case 10:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		} // switch

		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("31일까지");
			break;
		}
	} // main

}
