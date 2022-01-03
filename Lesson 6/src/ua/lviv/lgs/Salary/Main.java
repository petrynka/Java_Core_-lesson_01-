package ua.lviv.lgs.Salary;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {
		
		WorkerPerHour wpr = new WorkerPerHour();
		WorkerPerMonth wpm = new WorkerPerMonth();
		
		wpr.salary();
		wpm.salary();
		
		// Random rnd = new Random();
	      //  int number = rnd.nextInt(6) + 1;
	        //System.out.println("Random number: " + number);
	        
	        int rand = ThreadLocalRandom.current().nextInt(30,37);
	    	System.out.println("Value: " + rand);

	}

}
