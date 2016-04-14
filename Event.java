import java.util.Date;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public abstract class Event implements Serializable {
	
	abstract void Set(int setValue, String timeStamp);
	
	abstract int getAmount(int ArrayIndex);
	
	abstract String getTime(int ArrayIndex);
	
	public String TimeStamp() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		   Date date = new Date();
		   return (dateFormat.format(date));
	}
	
	abstract int getArraySize();
	
}
