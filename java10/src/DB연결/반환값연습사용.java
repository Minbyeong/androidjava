package DB연결;


public class 반환값연습사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		반환값연습 p = new 반환값연습();
		// 오버로딩 = 다형성 / 하나의 메서드로 다양한 것을 만들 수 있는것
		java.util.Date date = p.add();
		System.out.println(date.getDate());
		System.out.println(date.getHours());
		
		boolean result = p.equals(true);
		System.out.println(result);
		
		int[] result2 = p.add(100);
		for (int i : result2) {
			System.out.println(i);
		}
		
		double result3 = p.add(55.5, 100);
		System.out.println(result3);
		
		int result4 = p.add(500, 400);
		System.out.println(result4);
		
		String result5 = p.add("나는", 100);
		System.out.println(result5);
	}

}
