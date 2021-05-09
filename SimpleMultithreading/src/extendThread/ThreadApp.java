package extendThread;


public class ThreadApp {

	public static void main(String[] args) {
		
	
		Thread noOfThread = new ThreadMain();
		Thread noOfThread2 = new ThreadMain();

		
		noOfThread.setName("Thread 1");
		noOfThread2.setName("Thread 2");
		
		
		noOfThread.start();
		noOfThread2.start();

	}

}