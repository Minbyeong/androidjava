package ½º·¹µå;

public class ThreadRun1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StarThread star = new StarThread();
		CircleThread circle = new CircleThread();
		
		star.start();
		circle.start();
	}

}
