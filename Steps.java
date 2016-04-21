import java.io.Serializable;

public class Steps extends Event implements Serializable {
	
	private String stepsTime;
	private int stepsAmount;
	
	public Steps(String time, int amount) {
		this.stepsAmount = amount;
		this.stepsTime = time;
		System.out.println("You took " + this.stepsAmount + " steps, recorded at " + this.stepsTime);
	}
	
	int getAmount() {
		return this.stepsAmount;
	}
	
	String getTime() {
		return this.stepsTime;
	}

	void override(String time, int amount) {
		this.stepsAmount = amount;
		this.stepsTime = time;
	}
	
	

}
