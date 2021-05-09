package extendThread;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class ThreadMain extends Thread{

	public void printNum (String activeThreadName)
	{
		LocalTime time = LocalTime.now();
		DateTimeFormatter Time = DateTimeFormatter.ofPattern("HH:mm:ss");
	    String FormettedTime = time.format(Time);
	    
		for(int i=0 ; i<10 ;i++)
		{
			System.out.println("Round " + i + " : " + activeThreadName + " at " + FormettedTime );
		}
	}
	
	public void run ()
	{
		
		Thread activeThread = Thread.currentThread();
				
		
		printNum(activeThread.getName());
	}
	
}