package ua.lviv.lgs.Salary;

public class Main {

	public static void main(String[] args) {
		
		WorkerPerHour wpr = new WorkerPerHour();
		WorkerPerMonth wpm = new WorkerPerMonth();
		
		wpr.salary();
		wpm.salary();

	}

}
