package 스태틱;

import java.util.ArrayList;

public class 나의일지 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남");
//		System.out.println(Day.count + "일차");
//		System.out.println(day1);

		Day day2 = new Day("여행", 15, "강원도");
//		System.out.println(Day.count + "일차");
//		System.out.println(day2);

		Day day3 = new Day("운동", 11, "피트니스");
//		System.out.println(Day.count + "일차");
//		System.out.println(day3);

		ArrayList<Day> list = new ArrayList<Day>(); // 꺽쇠 앞에만 써도 됨.
		list.add(day1);
		list.add(day2);
		list.add(day3);
		
		파일로저장 file = new 파일로저장();
		file.save(list); 
		// save메소드 호출해서 list를 넘긴다 => call by reference
	}
}
