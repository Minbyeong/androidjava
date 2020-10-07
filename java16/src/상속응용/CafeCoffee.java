package 상속응용;

public class CafeCoffee {

	public static void main(String[] args) {
		
		CoffeeTruck cf = new CoffeeTruck();
		cf.type = "트럭";
		cf.size = "소형";
		cf.company = "현대";
		cf.shop = "커피";
		
		
		System.out.println(cf);
		
		cf.drive();
		cf.trade();
		cf.traffic();
		cf.sell();
		

	}

}
