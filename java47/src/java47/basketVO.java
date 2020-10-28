package java47;

public class basketVO {
	private String product;
	private String price;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "basketVO [product=" + product + ", price=" + price + "]";
	}
	
}
