
public class Gathering {
	
	private Sleep sleepEvent = new Sleep();
	private Liquid liquidEvent = new Liquid();
	private Steps stepEvent = new Steps();
	private EventIO Serializable = new EventIO();
	
	public Gathering() {
	}
	
	public void addSleep() {
		
	}
	
	public void addLiquid(int addAmount) {
		liquidEvent.Set(addAmount, liquidEvent.TimeStamp());
		Serializable.writeLiquid(liquidEvent);
	}
	
	
}
