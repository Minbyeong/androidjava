package dbcp;

public class SingleTonTest2 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			ConManager con = ConManager.getInstance();
			System.out.println(con);
		}
	}
}
