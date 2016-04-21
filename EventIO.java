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
import java.util.ArrayList;

public class EventIO {
	
public EventIO() {
		
	}
	
	public void write(ArrayList<Event> eventHolder) {
		try
		{
	    	FileOutputStream fileOutputStream = new FileOutputStream("Information.txt", true);
	    	OutputStream buffer = new BufferedOutputStream(fileOutputStream);
	    	ObjectOutputStream output = new ObjectOutputStream(buffer);
	    	
	    	output.writeObject(eventHolder);
	    	System.out.println("Added to the file");
	    	
	    	output.close();
		}
		catch (FileNotFoundException fileNotFoundEx)
		{
		  System.out.println("Invalid file name");
		}
		catch (IOException ioEx)
		{
		  System.out.println("Problem creating object stream");
		  System.out.println(ioEx.getClass() + " " + ioEx.getMessage());
		  ioEx.printStackTrace();
		  
		}
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Event> read() {
		ArrayList<Event> eventHolder = new ArrayList<Event>();
		
		try
		  {
			FileInputStream listFile = new FileInputStream("Information.txt");
			InputStream buffer = new BufferedInputStream(listFile);
			ObjectInputStream inputFile = new ObjectInputStream(buffer);
			

			  try
			  {
				eventHolder = (ArrayList<Event>) inputFile.readObject();
				inputFile.close();
			  }
			  catch (ClassNotFoundException e)
			  {
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
		
		return eventHolder;
	}
	
}
