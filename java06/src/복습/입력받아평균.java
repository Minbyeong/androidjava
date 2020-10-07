package 복습;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] jumsu = new int[5];
		for (int i = 0; i < 5; i++) {
			String data = JOptionPane.showInputDialog("점수를 입력");
			jumsu[i] = Integer.parseInt(data);
		}
		// System.out.println(jumsu[0]+jumsu[1]+jumsu[2]+jumsu[3]+jumsu[4]);
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
			// i의값 sum sum jumsu
			// i=0 10 0 10
			// i=1 30 10 20
			// i=2 60 30 30
			// i=3 100 60 40
			// i=4 150 100 50

		}
		System.out.println(sum);

	}

}
