package ua.lviv.lgs.Animal;

public class Animal {
	
	private String animalName;
	private int animalSpeed;
	private int animalAge;
	
	public Animal(String animalName, int animalSpeed, int animalAge) {
		this.animalName = animalName;
		this.animalSpeed = animalSpeed;
		this.animalAge = animalAge;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public int getAnimalSpeed() {
		return animalSpeed;
	}

	public void setAnimalSpeed(int animalSpeed) {
		this.animalSpeed = animalSpeed;
	}

	public int getAnimalAge() {
		return animalAge;
	}

	public void setAnimalAge(int animalAge) {
		this.animalAge = animalAge;
	}

	@Override
	public String toString() {
		return "Назва тварини = " + animalName + ", Швидкість тварини = " + animalSpeed + " км/год, Вік тварини = " + animalAge + "років";
	}

	
	
	

}
