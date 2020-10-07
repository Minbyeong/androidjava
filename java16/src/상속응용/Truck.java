package 상속응용;

public class Truck extends Car{

	String size;
	
	public void trade() {
		System.out.println("물건을 실어 나르다");
	}

	@Override
	public String toString() {
		return "Truck [size=" + size + ", type=" + type + ", company=" + company + "]";
	}
	
}
