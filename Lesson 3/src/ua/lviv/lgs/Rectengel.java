package ua.lviv.lgs;

public class Rectengel {

	 int a;
	 int b;
	
	Rectengel(){
		this.a = 10;
		this.b = 15;
	}
	
	Rectengel(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public void getPerymetr() {
		int perymetr = (a + b) * 2;
		System.out.println("Периметр прямокутника =" + perymetr);
	}
	
	public void getArea() {
		int area = a * b;
		System.out.println("Площа прямокутника = " + area);
	}
	
}
