package ua.lgs.lviv.part2;

public class Methods {
	
	public static void plus(int a, int b) throws MyException, IllegalAccessException{
		numberTest(a,b);
		System.out.println(a+b);
	}
	
	public static void minus(int a, int b) throws MyException, IllegalAccessException{
		numberTest(a,b);
		System.out.println(a-b);
	}
	
	public static void multipply(int a, int b) throws MyException, IllegalAccessException{
		numberTest(a,b);
		System.out.println(a*b);
	}
	
	public static void devide(int a, int b) throws MyException, IllegalAccessException{
		numberTest(a,b);
		System.out.println(a/b);
	}
	
	public static void numberTest(int a, int b) throws IllegalAccessException, MyException{
		if(a<0 && b<0)
			throw new IllegalArgumentException();
		if(a==0 && b!=0)
			throw new ArithmeticException();
		if(a!=0 && b==0)
			throw new ArithmeticException();
		if(a==0 && b==0)
			throw new IllegalAccessException();
		if(a>0 && b>0)
			throw new MyException()
;	}

	public static void main(String[] args) {
		try {
			plus(-3, -5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			minus(0,5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			multipply(0,3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			devide(5,0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
