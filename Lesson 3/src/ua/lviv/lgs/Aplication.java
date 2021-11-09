package ua.lviv.lgs;

public class Aplication {

	public static void main(String[] args) {
		
		Rectengel A2 = new Rectengel();
		Rectengel A4 = new Rectengel(5, 20);
		Circle C1 = new Circle();
		
		A2.getPerymetr();
		A2.getArea();
		
		A4.getPerymetr();
		A4.getArea();
		
		C1.getLeangth();
		C1.getCircleArea();
	}

}
