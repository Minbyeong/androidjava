package ½º·¹µå;

public class ThreadRun2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlusThread plus = new PlusThread();
		MinusThread minus = new MinusThread();

		plus.start();
		minus.start();
	}

}
