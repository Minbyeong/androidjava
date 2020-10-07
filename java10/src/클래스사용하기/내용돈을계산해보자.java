package 클래스사용하기;

import 클래스만들기.용돈계산기;

public class 내용돈을계산해보자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		용돈계산기 money1 = new 용돈계산기();
		int period = 6;
		int onemonth = 10;
		int sum = money1.mul(period, onemonth);
		if (sum < 50) {
			sum = sum + 15;
			System.out.println("6개월 동안 받은 용돈은 " + sum);
		} else {
			System.out.println("6개월 동안 받은 용돈은 " + sum);
		}

		용돈계산기 money2 = new 용돈계산기();
		int firsthalf = 50;
		int secondhalf = 60;
		money2.add(firsthalf, secondhalf);
	} // main

}
