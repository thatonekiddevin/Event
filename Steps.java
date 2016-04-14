import java.io.Serializable;
import java.util.ArrayList;

public class Steps extends Event implements Serializable {
	
	private ArrayList<Integer> stepsArray = new ArrayList<Integer>();
	private ArrayList<String> stepsTimeArray = new ArrayList<String>();
	
	void Set(int setValue, String timeStamp) {
		stepsArray.add(setValue);
		stepsTimeArray.add(timeStamp);
		System.out.println("You took  " + setValue + " steps at " + timeStamp);
	}

	int getAmount(int ArrayIndex) {
		return stepsArray.get(ArrayIndex);
	}

	String getTime(int ArrayIndex) {
		return stepsTimeArray.get(ArrayIndex);
	}

	int getArraySize() {
		return stepsTimeArray.size();
	}

}
