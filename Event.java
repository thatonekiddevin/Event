import java.util.Date;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public abstract class Event implements Serializable {
	
	abstract int getAmount();
	
	abstract String getTime();

}
