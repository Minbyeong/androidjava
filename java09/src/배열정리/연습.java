package 배열정리;

public class 연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] total = new int[4][];

		int[] kor = { 50, 60, 70, 80, 90 };
		int[] math = { 66, 77, 88 };
		int[] eng = { 90, 80, 70, 60 };
		int[] sci = { 77, 100 };
		
		total[0] = kor;
		total[1] = math;
		total[2] = eng;
		total[3] = sci;
		
		for (int i = 0; i < total.length; i++) {
			for (int j = 0; j < total[i].length; j++) {
				System.out.print(total[i][j]);
			}
			System.out.println();
		}
		
	}

}
