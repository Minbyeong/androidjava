package 스태틱;

public class 나의일지2 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남");
		System.out.println(Day.count + "일차"); // static변수는 클래스당 하나, 클래스 이름으로 사용.
		// 자바에서는 클래스만 대문자로 만들것.
		System.out.println(day1);

		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(Day.count + "일차");
		System.out.println(day2);
		System.out.println(Day.sum + "시간 누적 됨.");

		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(Day.count + "일차");
		System.out.println(day3);
		System.out.println(Day.sum + "시간 누적 됨.");

		System.out.println("평균시간은 " + day1.getAvg() + "시간");
		System.out.println("평균 시간은 " + Day.sum / Day.count + "시간");
		System.out.println("회사이름은 " + Day.getName());

	}
}
