package 배열의응용;

import javax.swing.JOptionPane;

public class 투표 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 투표 시스템
		String[] name = { "블랙핑크", "유재석", "아이유", "이효리", "비" };
		int[] vote = new int[5];
		for (int i = 0; i < 10; i++) {
			String choice = JOptionPane.showInputDialog("투표할 사람 번호 입력/ 0)블랙핑크 1)유재석 2)아이유 3)이효리 4)비");
			int choice2 = Integer.parseInt(choice);
			// 0
			if (!(choice2 < 0 || choice2 > 4)) {
				vote[choice2]++;
			}
		}
		for (int i = 0; i < vote.length; i++) {
			System.out.println(i + "번은 " + vote[i] + "표");
		}
		int max = vote[0];
		for (int i = 0; i < vote.length; i++) {
			if (max < vote[i]) {
				max = vote[i];
			}
		}
		for (int i = 0; i < vote.length; i++) {
			if (vote[i] == max) {
				System.out.println(i+": "+name[i]);
			}
		}

//		int[] count= new int[5];
//		for (int i = 0; i < 10; i++) {
//			String s = JOptionPane.showInputDialog("1)블랙핑크 2)유재석 3)아이유 4)이효리 5)비 수를 입력하여 투표하시오");
//			int vote = Integer.parseInt(s);
//			if (vote==1) {
//				count[0]++;
//			} else if (vote ==2 ) {
//				count[1]++;
//			} else if (vote ==3 ) {
//				count[2]++;
//			} else if (vote ==4 ) {
//				count[3]++;
//			} else if (vote ==5 ) {
//				count[4]++;
//			}
//		}
	}

}
