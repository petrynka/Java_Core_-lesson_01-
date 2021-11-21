package ua.lviv.lgs;

import java.util.Random;

public class FlyControl {
	
	Random rnd = new Random();

	public void mooveUp() {
		int number = rnd.nextInt(100) + 1;
		System.out.println("Літак Летить прямо " + number + " km");
	}
	
	public void mooveDown() {
		int number = rnd.nextInt(100) + 1;
		System.out.println("Літак Летить вниз " + number + " km");
	}
	
	public void mooveLeft() {
		int number = rnd.nextInt(10) + 5;
		System.out.println("Літак Летить вліво " + number + " km");
	}
	
	public void mooveRight() {
		int number = rnd.nextInt(100) + 1;
		System.out.println("Літак Летить вправо " + number + " km");
	}
	
	public static void main(String[] args) {
		FlyControl fc =  new FlyControl();
		fc.mooveLeft();
	}
	
}
