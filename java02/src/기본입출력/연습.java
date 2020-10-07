package 기본입출력;

import javax.swing.JOptionPane;

public class 연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String a = JOptionPane.showInputDialog("첫번째 수");
		//String b = JOptionPane.showInputDialog("두번째 수");

		//int aa = Integer.parseInt(a);
		//int bb = Integer.parseInt(b);

		//System.out.println(aa + bb);
		//System.out.println(aa - bb);
		//System.out.println(aa * bb);
		//System.out.println(aa / bb);

		//System.out.println("-----------------");
		
		//for (int i = aa; i <= bb; i++) { //aa 수를 시작값이라고 생각 bb를 끝값이라 생각하고 실행 
		//	System.out.println(i);
		//}
	
		//System.out.println("-----------------");

		String x = JOptionPane.showInputDialog("첫번째 수");
		String y = JOptionPane.showInputDialog("두번째 수");
		
		int xx = Integer.parseInt(x);
		
		for ( int k = 0; k < xx; k++) { // 0부터 시작해서 x보다 작을때만 //0부터 시작하니 작을때로 해주는게 갯수상 맞음
			System.out.println(y); // y를 출력
		}
	}

}
