import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class EventIO {
	
public EventIO() {
		
	}
	
	public void writeSleep(Gathering gatherObject) {
		try
		{
	    	FileOutputStream fileOutputStream = new FileOutputStream("Information.ser", false);
	    	OutputStream buffer = new BufferedOutputStream(fileOutputStream);
	    	ObjectOutputStream output = new ObjectOutputStream(buffer);
	    	
	    	output.writeObject(gatherObject);
	    	
	    	output.close();
		}
		catch (FileNotFoundException fileNotFoundEx)
		{
		  System.out.println("Invalid file name");
		}
		catch (IOException ioEx)
		{
		  System.out.println("Problem creating object stream");
		  
		}
	}
	
	public Gathering readSleep() {
		Gathering gatherEvent = new Gathering();
		
		try
		  {
			FileInputStream listFile = new FileInputStream("Information.ser");
			InputStream buffer = new BufferedInputStream(listFile);
			ObjectInputStream inputFile = new ObjectInputStream(buffer);
			

			  try
			  {
				gatherEvent = (Gathering) inputFile.readObject();
				inputFile.close();
			  }
			  catch (ClassNotFoundException e)
			  {
				// TODO Auto-generated catch block
				e.printStackTrace();
			  }
			
		  }
		  catch (FileNotFoundException fileIOEx)
		  {
			System.out.println("The file is not available");
		  }
		  catch (IOException IOEx)
		  {
			System.out.println("BadFile");
		  }
		
		return gatherEvent;
	}
	
}
