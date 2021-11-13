package ua.lviv.lgs.Animal;

public class Maine {

	public static void main(String[] args) {
		
		Animal Leopard = new Animal("Леопард", 20, 7);
		
		System.out.println(Leopard);
		
		Leopard.setAnimalName("Бик");
		Leopard.setAnimalSpeed(2);
		Leopard.setAnimalAge(14);
		
		System.out.println(Leopard);
		
		

	}

}
