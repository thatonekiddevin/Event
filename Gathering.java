import java.io.File;

public class Gathering {
	
	private Sleep sleepEvent = new Sleep();
	private Liquid liquidEvent = new Liquid();
	private Steps stepEvent = new Steps();
	private EventIO Serializable = new EventIO();
	private Reporting report;
	
	public Gathering() {
		
		File stepsFile = new File("Steps.txt");
		if (stepsFile.exists()) {
			stepEvent = Serializable.readSteps();
		}
		File sleepFile = new File("Sleep.txt");
		if (sleepFile.exists()) {
			sleepEvent = Serializable.readSleep();
		}
		File liquidFile = new File("Liquid.txt");
		if (liquidFile.exists()) {
			liquidEvent = Serializable.readLiquid();
		}
		
		report = new Reporting(liquidEvent, stepEvent, sleepEvent);
		
	}
	
	public void addLiquid(int addAmount) {
		liquidEvent.Set(addAmount, liquidEvent.TimeStamp());
		Serializable.writeLiquid(liquidEvent);
	}
	
	public void addSteps(int addAmount) {
		stepEvent.Set(addAmount, stepEvent.TimeStamp());
		Serializable.writeSteps(stepEvent);
	}
	
	public void addSleep(int addAmount) {
		sleepEvent.Set(addAmount, sleepEvent.TimeStamp());
		Serializable.writeSleep(sleepEvent);
	}
	
	public String testLiquidReport(String date) {
		return report.reportLiquidDay(date);
	}
	
	
}
