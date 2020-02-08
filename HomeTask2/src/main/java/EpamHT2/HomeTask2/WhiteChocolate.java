package EpamHT2.HomeTask2;

public class WhiteChocolate extends Sweet{
	float weight, price;
	int quantity;
	
	float calculateWeight(float weight, int quantity) {
		return quantity * weight;
	}
	public WhiteChocolate(int quantity, float weight, float price) {
		super();
		this.quantity = quantity;
		this.weight = weight;
		this.price = price;
	}
	
	public WhiteChocolate() {
		super();
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}