import java.util.ArrayList;

public class Reporting {
	
	private int[] Calendar = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
	
	public Reporting() {
		
	}
	
	public String reportDay(String date, ArrayList<Event> eventHolder, String eventType) {
		String reportString = "";
		
		for (int arrayIndex = 0; arrayIndex < eventHolder.size(); arrayIndex++) {
			if (eventHolder.get(arrayIndex).getClass().getSimpleName().equals(eventType) && eventHolder.get(arrayIndex).getTime().substring(0, 10).equals(date)) {
				reportString += "Time: " + eventHolder.get(arrayIndex).getTime() + " Amount: " + eventHolder.get(arrayIndex).getAmount() + " | ";
			}
		}
		
		return reportString;
	}
	
	public String reportMonth(String month, ArrayList<Event> eventHolder, String eventType) {
		String reportString = "";
		
		for (int arrayIndex = 0; arrayIndex < eventHolder.size(); arrayIndex++) {
			if (eventHolder.get(arrayIndex).getClass().getSimpleName().equals(eventType) && eventHolder.get(arrayIndex).getTime().substring(0,7).equals(month)) {
				reportString += "Time: " + eventHolder.get(arrayIndex).getTime() + " Amount: " + eventHolder.get(arrayIndex).getAmount() + " | ";
			}
		}
		
		return reportString;
	}
	
	public String reportLiquidYear(String year, ArrayList<Event> eventHolder, String eventType) {
		String reportString = "";
		
		for (int arrayIndex = 0; arrayIndex < eventHolder.size(); arrayIndex++) {
			if (eventHolder.get(arrayIndex).getClass().getSimpleName().equals(eventType) && eventHolder.get(arrayIndex).getTime().substring(0, 4).equals(year)) {
				reportString += "Time: " + eventHolder.get(arrayIndex).getTime() + " Amount: " + eventHolder.get(arrayIndex).getAmount() + " | ";
			}
		}
		
		return reportString;
	}	
}
