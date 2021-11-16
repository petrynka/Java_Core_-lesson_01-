package ua.lviv.lgs.Abstract;

public class Aplication {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Cow cow = new Cow();
		
		cat.voice();
		dog.voice();
		cow.voice();

	}

}
