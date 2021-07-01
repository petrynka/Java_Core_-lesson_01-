package ua.lviv.logos;

public class Lesson1 {

		public static void main(String[] args) {
			
			byte b;
			short s;
			int i;
			long l;
			
			float f;
			double d;
			
			char ch;
			boolean bl;
			
			System.out.println("Byte min =" + Byte.MIN_VALUE);
			System.out.println("Byte max =" + Byte.MAX_VALUE);
			
			System.out.println("Short min =" + Short.MIN_VALUE);
			System.out.println("Byte max =" + Short.MAX_VALUE);
			
			System.out.println("INT min =" + Integer.MIN_VALUE);
			System.out.println("INT max =" + Integer.MAX_VALUE);
			
			System.out.println("Long min =" + Long.MIN_VALUE);
			System.out.println("Long max =" + Long.MAX_VALUE);
			
			System.out.println("Float min =" + Float.MIN_VALUE);
			System.out.println("Float max =" + Float.MAX_VALUE);
			
			System.out.println("Double min =" + Double.MIN_VALUE);
			System.out.println("Double max =" + Double.MAX_VALUE);
			
			System.out.println("Char min =" + Character.MIN_VALUE);
			System.out.println("Char max =" + Character.MAX_VALUE);
			
			int array [] =  {5, 10, -25, 45, 155, 500, 65,-83, 150, 790, -1, 52, 320, 560};
			
			int max = 0;
			int min = 0;
			
			for (int j = 0; j < array.length; j++) {
				if (array[j] > max) {
					max = array[j];
				}
				if (array[j] < min) {
					min = array[j];
				}
			}
			
			System.out.println("max =" + max);
			System.out.println("min =" + min);
		}
}
