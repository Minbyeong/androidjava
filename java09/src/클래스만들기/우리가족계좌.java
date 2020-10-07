package 클래스만들기;

public class 우리가족계좌 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		계좌 ac1 = new 계좌();
		ac1.name = "아빠";
		ac1.account = "튼튼적금";
		ac1.money = 1000;
		계좌 ac2 = new 계좌();
		ac2.name = "엄마";
		ac2.account = "튼튼예금";
		ac2.money = 2000;
		계좌 ac3 = new 계좌();
		ac3.name = "딸";
		ac3.account = "다음적금";
		ac3.money = 3000;

		System.out.println("우리 가족 계좌 정보");
		System.out.println("--------------------------");
		System.out.println("이름\t계좌이름\t금액");
		System.out.println("--------------------------");
		System.out.print(ac1.name + "\t");
		System.out.print(ac1.account + "\t");
		System.out.println(ac1.money);
		System.out.print(ac2.name + "\t");
		System.out.print(ac2.account + "\t");
		System.out.println(ac2.money);
		System.out.print(ac3.name + "\t");
		System.out.print(ac3.account + "\t");
		System.out.println(ac3.money);
		System.out.println();
		
		System.out.println("입금하다, 출금하다");
		System.out.print("=> 아빠는 ");
		ac1.in();
		System.out.print("=> 딸은 ");
		ac3.out();

	}

}
