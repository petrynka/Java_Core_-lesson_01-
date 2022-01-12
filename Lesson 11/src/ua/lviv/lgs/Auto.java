package ua.lviv.lgs;

public class Auto {
	
	int hp;
	int modelYear;
	
	public Auto(int hp, int modelYear, SteringWheel steringWheel, Engine engine) {
		super();
		this.hp = hp;
		this.modelYear = modelYear;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	@Override
	public String toString() {
		return "Auto [hp=" + hp + ", modelYear=" + modelYear + "]";
	}
	
	
}
