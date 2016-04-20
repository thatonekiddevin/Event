import java.io.Serializable;

public class Sleep extends Event implements Serializable {
	
	private String sleepTime;
	private int sleepAmount;
	
	public Sleep(String time, int amount) {
		this.sleepAmount = amount;
		this.sleepTime = time;
	}
	
	int getAmount() {
		return this.sleepAmount;
	}
	
	String getTime() {
		return this.sleepTime;
	}
	
	

}