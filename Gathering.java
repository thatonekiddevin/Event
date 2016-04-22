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
			save();
		}
		else if (eventType.equals("Steps")) {
			Steps Steps = new Steps(dateFormat.format(date), amount);
			eventHolder.add(Steps);
			save();
		}
		else {
			Sleep Sleep = new Sleep(dateFormat.format(date), amount);
			eventHolder.add(Sleep);
			save();
		}
		
	}
	
	public String getAllEvents() {
		String returnString = "";
		
		for (int arrayIndex = 0; arrayIndex < eventHolder.size(); arrayIndex++) {
			returnString += "Amount: " + eventHolder.get(arrayIndex).getAmount() + " Time: " + eventHolder.get(arrayIndex).getTime() + " Event: " + eventHolder.get(arrayIndex).getClass().getSimpleName() + " | ";
		}
		
		return returnString;
	}
	
	public void override(int oldAmount, int newAmount, String oldTime, String newTime, String eventType) {
		for (int arrayIndex = 0; arrayIndex < eventHolder.size(); arrayIndex++) {
			if (eventHolder.get(arrayIndex).getClass().getSimpleName().equals(eventType) && eventHolder.get(arrayIndex).getAmount() == oldAmount && eventHolder.get(arrayIndex).getTime().equals(oldTime)) {
				eventHolder.get(arrayIndex).override(newTime, newAmount);
			}
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
			return report.reportWeek(date, eventHolder, eventType);
		}
	}
	
	public void save() {
		io.write(eventHolder);
	}
	
}
