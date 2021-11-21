package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {
		
		Su_27 su_27 = new Su_27(10, 6, 1200, 390, "Black");
		
		su_27.angineStart();
		su_27.takeOf();
		su_27.moveUp();
		su_27.moveDown();
		su_27.moveLeft();
		su_27.moveRight();
		su_27.stels();
		su_27.nuclearBomb();
		su_27.turbo();
		su_27.landing();
	}

}
