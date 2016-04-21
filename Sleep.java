import java.io.Serializable;

public class Sleep extends Event implements Serializable {
	
	private String sleepTime;
	private int sleepAmount;
	
	public Sleep(String time, int amount) {
		this.sleepAmount = amount;
		this.sleepTime = time;
		System.out.println("You slept " + this.sleepAmount + "hrs, recorded at " + this.sleepTime);
	}
	
	int getAmount() {
		return this.sleepAmount;
	}
	
	String getTime() {
		return this.sleepTime;
	}

	void override(String time, int amount) {
		this.sleepAmount = amount;
		this.sleepTime = time;
	}
	
	

}