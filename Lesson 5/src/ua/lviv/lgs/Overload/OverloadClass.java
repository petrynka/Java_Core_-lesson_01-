package ua.lviv.lgs.Overload;

public class OverloadClass {

	private int a;
	private int b;
	private int c;
	
	OverloadClass(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	OverloadClass(int a, int b, int c){
		this(a,b);
		this.c = c;
	}
	
	public void show() {
		System.out.println("Параметр а = " + a);
		System.out.println("Параметр b = " + b);
		System.out.println("Параметр c = " + c);
	}
}
