package 배열;

public class 배열기본2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열은 일반적으로 같은 타입을 묶을 때 사용
		// 다양한 타입을 묶을 때는 매열을 쓰지 않음
		// 배열은 고정된 크기를 가진다.(크기 조절 불가)
		double[] temp = new double[7];
		temp[0] = 36.5;
		temp[1] = 36.5;
		temp[2] = 36.5;
		temp[3] = 36.5;
		temp[4] = 36.5;
		temp[5] = 36.5;
		temp[6] = 36.5;
		for (int i = 0; i < temp.length; i++) {
			System.out.println((i + 1) + "번쨰 온도는 " + temp[i]);
		} // for
	} // main

}
