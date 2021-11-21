package ua.lviv.lgs;

import java.util.Random;

public class Su_27 extends Plane implements Featureble{
	
	Random random = new Random();
	
	private FlyControl fc =  new FlyControl();
	
	private int maxSpeed;
	private String color;
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Su_27(int leangth, int weadth, int weigth, int maxSpeed, String color) {
		super(leangth, weadth, weigth);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	public void moveUp() {
		fc.mooveUp();
	}
	
	public void moveDown() {
		fc.mooveDown();
	}
	
	public void moveLeft() {
		fc.mooveLeft();
	}
	
	public void moveRight() {
		fc.mooveRight();
	}

	@Override
	public void angineStart() {
		int min = 20;
		int max = 88;
		
		max -= min;
		
		int a = (int) ((Math.random()*max) + min);
		
		System.out.println("������ ���� ������� �� ������ ����� " + a + " ������");
		
	}

	@Override
	public void takeOf() {
		int number = random.nextInt(1000) + 1;
		System.out.println("�� ������� ���� ���� ��������� " + number + " ��������");
	}

	@Override
	public void landing() {
		System.out.println("˳��� ������ �������");
		
	}

	@Override
	public void turbo() {
		int number = random.nextInt(200) + maxSpeed;
		System.out.println("˳��� ����������� �� �������� " + number + " �������� �� ������");
	}

	@Override
	public void stels() {
		int number = random.nextInt(20) + 1;
		System.out.println("˳��� ���� ��������� �������� " + number + " ������");
	}

	@Override
	public void nuclearBomb() {
		int number = random.nextInt(10) + 1;
		System.out.println("˳��� ������ " + number + " ������� ����");
	}
	
	

}
