package EpamHT2.HomeTask2;

public class MilkyBar extends Sweet{
	float weight, price;
	int quantity;
	
	float calculateWeight(float weight, int quantity) {
		return quantity * weight;
	}
	public MilkyBar(int quantity, float weight, float price) {
		super();
		this.quantity = quantity;
		this.weight = weight;
		this.price = price;
	}
	
	public MilkyBar() {
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
