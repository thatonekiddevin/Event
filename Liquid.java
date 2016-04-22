import java.io.Serializable;

public class Liquid extends Event implements Serializable {
	
	private String liquidTime;
	private int liquidAmount;
	
	public Liquid(String time, int amount) {
		this.liquidAmount = amount;
		this.liquidTime = time;
		System.out.println("You drank " + this.liquidAmount + "fl oz, recorded at " + this.liquidTime);
	}
	
	int getAmount() {
		return this.liquidAmount;
	}
	
	String getTime() {
		return this.liquidTime;
	}
	
	void override(String time, int amount) {
		this.liquidAmount = amount;
		this.liquidTime = time;
	}
	
	
	
}
