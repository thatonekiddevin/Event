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
	
	public void writeSleep(Sleep sleepObject, Liquid liquidObject, Steps stepsObject) {
		try
		{
	    	FileOutputStream fileOutputStreamSleep = new FileOutputStream("Sleep.txt", false);
	    	OutputStream bufferSleep = new BufferedOutputStream(fileOutputStreamSleep);
	    	ObjectOutputStream outputSleep = new ObjectOutputStream(bufferSleep);
	    	
	    	outputSleep.writeObject(sleepObject);
	    	
	    	FileOutputStream fileOutputStreamSteps = new FileOutputStream("Steps.txt", false);
	    	OutputStream bufferSteps = new BufferedOutputStream(fileOutputStreamSteps);
	    	ObjectOutputStream outputSteps = new ObjectOutputStream(bufferSteps);
	    	
	    	outputSteps.writeObject(stepsObject);
	    	
	    	FileOutputStream fileOutputStreamLiquid = new FileOutputStream("Liquid.txt", false);
	    	OutputStream bufferLiquid = new BufferedOutputStream(fileOutputStreamLiquid);
	    	ObjectOutputStream outputLiquid = new ObjectOutputStream(bufferLiquid);
	    	
	    	outputLiquid.writeObject(liquidObject);
	    	
	    	outputLiquid.close();
	    	outputSteps.close();
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
}
