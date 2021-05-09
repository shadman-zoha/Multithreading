package suspendingThreads;

public class SuspendedApp {

	public static void main(String[] args) {

		
		Runnable statement1 = new Suspended();
		Runnable statement2 = new Suspended();
		Runnable statement3 = new Suspended();

		
		Thread word1 = new Thread(statement1, "word1");
		Thread word2 = new Thread(statement2, "word2");
		Thread text = new Thread(statement3, "text");

		word1.start();
	
		text.start();
		word2.start();

	}

}