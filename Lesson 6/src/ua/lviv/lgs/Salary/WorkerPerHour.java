package ua.lviv.lgs.Salary;

public class WorkerPerHour implements Salary {

	private int hour = 36;
	private int perHour = 11;
	private int c = hour * perHour;
	
	@Override
	public void salary() {
		System.out.println("Місячна зарплата працівника становить " + c +" $");
		
	}

	
	
}
