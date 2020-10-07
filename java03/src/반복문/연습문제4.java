package 반복문;

public class 연습문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<4;i++){
			for(int j=0;j<(3-i);j++){
				System.out.print(" "); 
			}
			for(int j=0;j<(2*i)+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		}
	}

}
