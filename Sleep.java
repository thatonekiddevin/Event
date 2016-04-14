import java.io.Serializable;
import java.util.ArrayList;

public class Sleep extends Event implements Serializable {
	
	private ArrayList<Integer> sleepArray = new ArrayList<Integer>();
	private ArrayList<String> sleepTimeArray = new ArrayList<String>();

	void Set(int setValue, String timeStamp) {
		sleepArray.add(setValue);
		sleepTimeArray.add(timeStamp);
		System.out.println("You slept " + setValue + " hours at " + timeStamp);
	}

	int getAmount(int ArrayIndex) {
		return sleepArray.get(ArrayIndex);
		
	}
	
	String getTime(int ArrayIndex) {
		return sleepTimeArray.get(ArrayIndex);
	}

	int getArraySize() {
		return sleepTimeArray.size();
	}
	
}
