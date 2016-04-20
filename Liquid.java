import java.io.Serializable;

public class Liquid extends Event implements Serializable {
	
	private String liquidTime;
	private int liquidAmount;
	
	public Liquid(String time, int amount) {
		this.liquidAmount = amount;
		this.liquidTime = time;
	}
	
	int getAmount() {
		return this.liquidAmount;
	}
	
	String getTime() {
		return this.liquidTime;
	}
	
	
	
}
