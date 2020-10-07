package 상속응용;

public class CoffeeTruck extends Truck{

	String shop;
	
	public void sell() {
		System.out.println("팔다");
	}

	@Override
	public String toString() {
		return "CoffeeTruck [shop=" + shop + ", size=" + size + ", type=" + type + ", company=" + company + "]";
	}
	
}
