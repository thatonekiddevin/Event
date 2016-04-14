
public class Reporting {
	
	private Liquid liquidEvent = new Liquid();
	private Steps stepsEvent = new Steps();
	private Sleep sleepEvent = new Sleep();
	private int[] Calendar = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
	
	public Reporting(Liquid liquidObject, Steps stepObject, Sleep sleepObject) {
		
		liquidEvent = liquidObject;
		sleepEvent = sleepObject;
		stepsEvent = stepObject;
		
	}
	
	public String reportLiquidDay(String date) {
		String reportString = "";
		
		for (int loopIndex = 0; loopIndex < liquidEvent.getArraySize(); loopIndex++) {
			if ((liquidEvent.getTime(loopIndex).substring(0, 10)).equals(date)) {
				reportString += "Time: " + liquidEvent.getTime(loopIndex) + " Amount: " + Integer.toString(liquidEvent.getAmount(loopIndex)) + " | ";
			}
		}
		
		return reportString;
	}
	
	/*public String reportLiquidWeek(String date) {
		
	}
	
	public String reportLiquidMonth(int month) {
		
	}
	
	public String reportLiquidYear(int year) {
		
	}
	*/
	
}
