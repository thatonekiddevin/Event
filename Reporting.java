import java.util.ArrayList;

public class Reporting {
	
	private int[] Calendar = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
	
	public Reporting() {
		
	}
	
	public String reportDay(String date, ArrayList<Event> eventHolder, String eventType) {
		String reportString = "";
		
		for (int arrayIndex = 0; arrayIndex < eventHolder.size(); arrayIndex++) {
			if (eventHolder.get(arrayIndex).getClass().getSimpleName().equals(eventType) && eventHolder.get(arrayIndex).getTime().substring(0, 10).equals(date)) {
				reportString += "Amount: " + eventHolder.get(arrayIndex).getAmount() + " Time: " + eventHolder.get(arrayIndex).getTime() + " Event: " + eventHolder.get(arrayIndex).getClass().getSimpleName() + " | ";
			}
		}
		
		return reportString;
	}
	
	public String reportWeek(String date, ArrayList<Event> eventHolder, String eventType) {
		
		String reportString = "";
		String newDate;
		for (int outerIndex = 0; outerIndex < 7; outerIndex++) {
			for (int innerIndex = 0; innerIndex < eventHolder.size(); innerIndex++) {
				if (Integer.parseInt(date.substring(8,10))+outerIndex > Calendar[Integer.parseInt(date.substring(5,7))-1]) {
					if (Integer.parseInt(date.substring(5,7)) < 10) {
						newDate = date.replace(date.substring(5, 10), "0" + Integer.toString(Integer.parseInt(date.substring(5, 7))+1) + "/0" + Integer.toString(Integer.parseInt(date.substring(8,10))+outerIndex-Calendar[Integer.parseInt(date.substring(5,7))-1]));
						System.out.println(newDate);
					}
					else if (Integer.parseInt(date.substring(5,7)) >= 12) {
						newDate = date.replace(date.substring(5, 10), "01/0" + Integer.toString(Integer.parseInt(date.substring(8,10))+outerIndex-Calendar[Integer.parseInt(date.substring(5,7))-1]));
					}
					else {
						newDate = date.replace(date.substring(8, 10), "0" + Integer.toString(Integer.parseInt(date.substring(8,10))+outerIndex-Calendar[Integer.parseInt(date.substring(5,7))-1]));
						System.out.println(newDate);
					}
					if (eventHolder.get(innerIndex).getClass().getSimpleName().equals(eventType) && eventHolder.get(innerIndex).getTime().substring(0, 10).equals(newDate)) {
						reportString += "Amount: " + eventHolder.get(innerIndex).getAmount() + " Time: " + eventHolder.get(innerIndex).getTime() + " Event: " + eventHolder.get(innerIndex).getClass().getSimpleName() + " | ";
					}
				}
				else {
					newDate = date.replace(date.substring(8, 10), Integer.toString(Integer.parseInt(date.substring(8,10))+outerIndex));
					System.out.println(newDate);
					if (eventHolder.get(innerIndex).getClass().getSimpleName().equals(eventType) && eventHolder.get(innerIndex).getTime().substring(0, 10).equals(newDate)) {
						reportString += "Amount: " + eventHolder.get(innerIndex).getAmount() + " Time: " + eventHolder.get(innerIndex).getTime() + " Event: " + eventHolder.get(innerIndex).getClass().getSimpleName() + " | ";
					}
				}
			}
		}
		
		
		return reportString;
	}
	
	public String reportWeekWorking(String date, ArrayList<Event> eventHolder, String eventType) {
		String reportString = "";
		String newDate;
		
		for (int outerIndex = 0; outerIndex < 7; outerIndex++) {
			newDate = date.replace(date.substring(8, 10), Integer.toString(Integer.parseInt(date.substring(8,10))+outerIndex));
			for (int innerIndex = 0; innerIndex < eventHolder.size(); innerIndex++) {
				System.out.println(newDate);
				System.out.println(Calendar[Integer.parseInt(date.substring(5,7))-1]);
				System.out.println(Integer.parseInt(date.substring(8,10))+outerIndex);
				if (eventHolder.get(innerIndex).getClass().getSimpleName().equals(eventType) && eventHolder.get(innerIndex).getTime().substring(0, 10).equals(newDate)) {
					reportString += "Amount: " + eventHolder.get(innerIndex).getAmount() + " Time: " + eventHolder.get(innerIndex).getTime() + " Event: " + eventHolder.get(innerIndex).getClass().getSimpleName() + " | ";
				}
			}
		}
		
		return reportString;
	}
	
	public String reportMonth(String month, ArrayList<Event> eventHolder, String eventType) {
		String reportString = "";
		
		for (int arrayIndex = 0; arrayIndex < eventHolder.size(); arrayIndex++) {
			if (eventHolder.get(arrayIndex).getClass().getSimpleName().equals(eventType) && eventHolder.get(arrayIndex).getTime().substring(0,7).equals(month)) {
				reportString += "Amount: " + eventHolder.get(arrayIndex).getAmount() + " Time: " + eventHolder.get(arrayIndex).getTime() + " Event: " + eventHolder.get(arrayIndex).getClass().getSimpleName() + " | ";
			}
		}
		
		return reportString;
	}
	
	public String reportYear(String year, ArrayList<Event> eventHolder, String eventType) {
		String reportString = "";
		
		for (int arrayIndex = 0; arrayIndex < eventHolder.size(); arrayIndex++) {
			if (eventHolder.get(arrayIndex).getClass().getSimpleName().equals(eventType) && eventHolder.get(arrayIndex).getTime().substring(0, 4).equals(year)) {
				reportString += "Amount: " + eventHolder.get(arrayIndex).getAmount() + " Time: " + eventHolder.get(arrayIndex).getTime() + " Event: " + eventHolder.get(arrayIndex).getClass().getSimpleName() + " | ";
				
			}
		}
		
		return reportString;
	}	
}
