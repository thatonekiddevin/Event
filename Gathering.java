import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Gathering {
	
	private ArrayList<Event> eventHolder = new ArrayList<Event>();
	
	public Gathering() {
		
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
	
	public void override() {
		
	}
	
	public void delete() {
		
	}
}
