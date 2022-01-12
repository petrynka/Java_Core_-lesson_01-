package ua.lviv.lgs;

public class SteringWheel {

	String material;
	int diametr;
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getDiametr() {
		return diametr;
	}
	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}
	public SteringWheel(String material, int diametr) {
		super();
		this.material = material;
		this.diametr = diametr;
	}
	@Override
	public String toString() {
		return "SteringWheel [material=" + material + ", diametr=" + diametr + "]";
	}
	
	
}
