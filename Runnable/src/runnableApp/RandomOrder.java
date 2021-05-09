package runnableApp;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class RandomOrder implements Runnable {


	public void randomOrderText() {
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
		}
		System.out.println(reOrderText);

	}

	public void extractText() {
		
		String text = "Java is fun.";
		String tempText = "";
		char extractChar;
		
		for (int i = 0; i<10; i++){
			
			extractChar = text.charAt(i);
			tempText += extractChar;
			System.out.println(tempText);
			
		}

	}

	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();		
		if (currentThread.getName().equals("text"))
			extractText();
		else 
			randomOrderText();
	}


}