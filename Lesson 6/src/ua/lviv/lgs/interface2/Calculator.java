package ua.lviv.lgs.interface2;

import ua.lviv.lgs.interface1.Numerable;

public class Calculator implements Numerable {

	@Override
	public void plus(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a+b));
	}

	@Override
	public void minus(int a, int b) {
		System.out.println(a + "-" + b + "=" + (a-b));
		
		
	}

	@Override
	public void multiply(int a, int b) {
		System.out.println(a + "*" + b + "=" + (a*b));
		
		
	}

	@Override
	public void devide(int a, int b) {
		System.out.println(a + "/" + b + "=" + (a/b));
		
		
	}


	
	

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.plus(12,10);
		calc.minus(140, 81);
		calc.multiply(33, 220);
		calc.devide(100, 5);
	}

	
	
		
	}


