package ua.lviv.lgs.Robots;

public class Aplication {

	public static void main(String[] args) {
		
		Robot r = new Robot();
		CoffeRobot cr = new CoffeRobot();
		RobotDancer rd = new RobotDancer();
		RobotCooker rc = new RobotCooker();
		 
		r.work();
		cr.work();
		rd.work();
		rc.work();
		
		Robot [] array1 = {r,cr,rd,rc};
		
		for (int i = 0; i < array1.length; i++) {
			array1[i].work();
		}
	}

}
