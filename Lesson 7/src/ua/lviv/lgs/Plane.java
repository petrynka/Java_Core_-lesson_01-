package ua.lviv.lgs;

public abstract class Plane {
	
	int leangth;
	int weadth;
	int weigth;
	
	public Plane(int leangth, int weadth, int weigth) {
		super();
		this.leangth = leangth;
		this.weadth = weadth;
		this.weigth = weigth;
	}

	public abstract void angineStart();
	
	public abstract void takeOf();
	
	public abstract void landing();

}
