import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.File;

public class Gathering {
	
	EventIO io = new EventIO();
	
	private Reporting report = new Reporting();
	private ArrayList<Event> eventHolder = new ArrayList<Event>();
	
	public Gathering() {
		
		File file = new File("Information.txt");
		if (file.exists()) {
			eventHolder = io.read();
		}
		
	}
	
	public void newEvent(String eventType, int amount) {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Date date = new Date();
		
		if (eventType.equals("Liquid")) {
			Liquid Liquid = new Liquid(dateFormat.format(date), amount);
			eventHolder.add(Liquid);
		}
		else if (eventType.equals("Steps")) {
			Steps Steps = new Steps(dateFormat.format(date), amount);
			eventHolder.add(Steps);
		}
		else {
			Sleep Sleep = new Sleep(dateFormat.format(date), amount);
		}
		
	}
	
	public String getAllEvents() {
		String returnString = "";
		
		for (int arrayIndex = 0; arrayIndex < eventHolder.size(); arrayIndex++) {
			returnString += "Amount: " + eventHolder.get(arrayIndex).getAmount() + " Time: " + eventHolder.get(arrayIndex).getTime() + " | ";
		}
		
		return returnString;
	}
	
	public void override(int oldamount, int newAmount, String oldTime, String newTime) {
		for (int arrayIndex = 0; arrayIndex < eventHolder.size(); arrayIndex++) {
		}
	}
	
	public void delete() {
		
	}
	
	public void testName() {
		System.out.println(eventHolder.get(1).getClass().getSimpleName());
	}
	
	public String report(String eventType, String typeOfReport, String date) {
		
		if (typeOfReport.equals("Day")) {
			return report.reportDay(date, eventHolder, eventType);
		}
		else if(typeOfReport.equals("Month")) {
			return report.reportMonth(date, eventHolder, eventType);
		}
		else if(typeOfReport.equals("Year")) {
			return report.reportYear(date, eventHolder, eventType);
		}
		else {
			return "week";
		}
	}
	
	public void save() {
		io.write(eventHolder);
	}
	
}
