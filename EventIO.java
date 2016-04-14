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
	
	public void writeSleep(Sleep sleepObject) {
		try
		{
	    	FileOutputStream fileOutputStreamSleep = new FileOutputStream("Sleep.txt", false);
	    	OutputStream bufferSleep = new BufferedOutputStream(fileOutputStreamSleep);
	    	ObjectOutputStream outputSleep = new ObjectOutputStream(bufferSleep);
	    	
	    	outputSleep.writeObject(sleepObject);
	    	
	    	outputSleep.close();
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
	
	public void writeLiquid(Liquid liquidObject) {
		try
		{
	    	
	    	FileOutputStream fileOutputStreamLiquid = new FileOutputStream("Liquid.txt", false);
	    	OutputStream bufferLiquid = new BufferedOutputStream(fileOutputStreamLiquid);
	    	ObjectOutputStream outputLiquid = new ObjectOutputStream(bufferLiquid);
	    	
	    	outputLiquid.writeObject(liquidObject);
	    	
	    	outputLiquid.close();
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
	
	public void writeSteps(Steps stepsObject) {
		try
		{
	    	
	    	FileOutputStream fileOutputStreamSteps = new FileOutputStream("Steps.txt", false);
	    	OutputStream bufferSteps = new BufferedOutputStream(fileOutputStreamSteps);
	    	ObjectOutputStream outputSteps = new ObjectOutputStream(bufferSteps);
	    	
	    	outputSteps.writeObject(stepsObject);
	    	
	    	
	    	outputSteps.close();
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
	
	public Steps readSteps() {
		
		Steps stepEvent = new Steps();
		
		try
		  {
			FileInputStream listFile = new FileInputStream("Steps.txt");
			InputStream buffer = new BufferedInputStream(listFile);
			ObjectInputStream inputFile = new ObjectInputStream(buffer);
			

			  try
			  {
				stepEvent = (Steps) inputFile.readObject();
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
		
		return stepEvent;
	}
	
	public Liquid readLiquid() {
		
		Liquid liquidEvent = new Liquid();
		
		try
		  {
			FileInputStream listFile = new FileInputStream("Liquid.txt");
			InputStream buffer = new BufferedInputStream(listFile);
			ObjectInputStream inputFile = new ObjectInputStream(buffer);
			

			  try
			  {
				liquidEvent = (Liquid) inputFile.readObject();
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
		
		return liquidEvent;
	}
	
	public Sleep readSleep() {
		Sleep sleepEvent = new Sleep();
		
		try
		  {
			FileInputStream listFile = new FileInputStream("Sleep.txt");
			InputStream buffer = new BufferedInputStream(listFile);
			ObjectInputStream inputFile = new ObjectInputStream(buffer);
			

			  try
			  {
				sleepEvent = (Sleep) inputFile.readObject();
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
		
		return sleepEvent;
	}
}
