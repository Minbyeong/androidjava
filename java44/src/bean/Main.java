package bean;

public class Main {

	public static void main(String[] args) {
		int[] num = {1,2,3};
		//원래의 for문
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		//for-each문(하나씩 순서대로 꺼내온다)
		for (int x : num) { // x 는 임시변
			System.out.println(x);
		}
	}

}
