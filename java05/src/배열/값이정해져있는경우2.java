package 배열;

public class 값이정해져있는경우2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = { "으흘컥", "으헝헛", "으헝헠" };
//		for (int i = 0; i < name.length; i++) {
//			System.out.println((i + 1) + "번 째 이름은 " + name[i]);
//		}
		for (String string : name) {
			System.out.println(string); //string말고 x든 뭐든 해놔도 상관 없음
		}
		
		int[] age = { 20, 30, 40 };
//		for (int i = 0; i < age.length; i++) {
//			System.out.println((i + 1) + "번 째 나이는 " + age[i]);
//		}
		for (int i : age) {
			System.out.println(i);
		}
		
		char[] gender = { '남', '남', '여' };
//		for (int i = 0; i < gender.length; i++) {
//			System.out.println((i + 1) + "번 째 성별은 " + gender[i]);
//		}
		for (char c : gender) {
			System.out.println(c);
		}
		
		boolean[] morning = { true, false, true };
//		for (int i = 0; i < morning.length; i++) {
//			System.out.println((i + 1) + "번 째는 아침을 먹었니? " + morning[i]);
//		}
		for (boolean b : morning) {
			System.out.println(b);
		}

		double[] weight = { 70.2, 80.5, 90.3 };
//		for (int i = 0; i < weight.length; i++) {
//			System.out.println((i + 1) + "번 째 몸무게는 " + weight[i]);
//		}
		for (double d : weight) {
			System.out.println(d);
		}
	}

}
