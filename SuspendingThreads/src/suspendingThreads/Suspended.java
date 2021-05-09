package suspendingThreads;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Suspended implements Runnable {

	
	private static boolean status = false;
	
	
	public void random() {
	
		String arr[] = { "It", "is", "recommended", "to", "use", "Calendar", "class" };
		Random randomNum = new Random();
		
		Set<Integer> set = new LinkedHashSet<Integer>();

		while (set.size() < arr.length) {

			set.add(randomNum.nextInt(arr.length));
		}

		Object ArrOftextOrder[] = set.toArray();

		String reOrderText = "";
		for (int i = 0; i < arr.length; i++) {
			status = true;
			reOrderText += arr[(int) ArrOftextOrder[i]] + " ";
			System.out.println(reOrderText);
			
		}		
		

	}

	public void randomorder(String threadName) {
		
			String arr[] = { "It", "is", "recommended", "to", "use", "Calendar", "class" };
			Random randomNum = new Random();
			
			Set<Integer> set = new LinkedHashSet<Integer>();

			while (set.size() < arr.length) {

				set.add(randomNum.nextInt(arr.length));
			}

			Object ArrOftextOrder[] = set.toArray();

			String reOrderText = "";
			for (int i = 0; i < arr.length; i++) {
				reOrderText += arr[(int) ArrOftextOrder[i]] + " ";
				try {	
					if (status == true) {
						
						System.out.println("\n"+ threadName + " sleeping\n");
						Thread.sleep(4000);
						status = false;
					}

				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println(threadName + " : " + reOrderText);
			}
			
		

	}

	public void exText() {

		String text = "Java is fun.";
		String tempText = "";
		char extractChar;

		for (int i = 0; i < 10; i++) {

			extractChar = text.charAt(i);
			tempText += extractChar;
			System.out.println(tempText);

		}

	}

	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		String Name = currentThread.getName();
		if (Name.equals("text"))
			exText();
		else if (Name.equals("word1"))
			random();
		else
			randomorder(currentThread.getName());
	}

}