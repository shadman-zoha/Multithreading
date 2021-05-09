package runnableApp;

public class RandomOrderApp {

	public static void main(String[] args) {
		
		
		Runnable statement1 = new RandomOrder ();
		Runnable statement2 = new RandomOrder ();
		Runnable statement3 = new RandomOrder ();
		
		
		Thread word1 = new Thread (statement1, "word1");
		Thread word2 = new Thread (statement2, "word2");		
		Thread text  = new Thread (statement3, "text");		
		
		word1.start();
		word2.start();
		text.start();
		
		

	}

}