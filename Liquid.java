import java.io.Serializable;
import java.util.ArrayList;

public class Liquid extends Event implements Serializable {
	
	private ArrayList<Integer> liquidArray = new ArrayList<Integer>();
	private ArrayList<String> liquidTimeArray = new ArrayList<String>();
	
	void Set(int setValue, String timeStamp) {
		liquidArray.add(setValue);
		liquidTimeArray.add(timeStamp);
		System.out.println("You drank  " + setValue + "L of liquids at  " + timeStamp);
	}

	int getAmount(int ArrayIndex) {
		return liquidArray.get(ArrayIndex);
	}

	String getTime(int ArrayIndex) {
		return liquidTimeArray.get(ArrayIndex);
	}

}