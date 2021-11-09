package ua.lviv.lgs;

public class Circle {

	int r;
	int d;
	double p = 3.14;
	
	Circle(){
		this.r = 25;
		this.d = 50;
	}
	
	public void getLeangth() {
		double leangth = p * d;
		System.out.println("Довжини кола = " + leangth);
	}
	
	public void getCircleArea() {
		double circleArea = p * (r * r);
		System.out.println("Площа круга = " + circleArea);
	}
}
