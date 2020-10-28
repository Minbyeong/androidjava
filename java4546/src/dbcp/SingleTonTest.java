package dbcp;

public class SingleTonTest {

	public static void main(String[] args) {
		ConManager con = ConManager.getInstance();
		System.out.println(con);
	}
}
