package ua.lviv.lgs;

import java.util.Iterator;

public class Lesson2 {

	public static void main(String[] args) {
		
//		byte a = 25;
//		short b = 300;
//		int c = 5472;
//		long d = 5934934;
//		float f = 25.5f;
//		double e = 4850.47334;
//		char chr = 'x';
//		boolean t = true;
		
		int array [] = {-2, 1, 500, 384, -45, 67, -100, 6559, -34, 544, -12, 457, 8957, -1231, 8435, 0, 213, -43, 632 };
		
		int min = 0;
		int max = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.print("max = " + max);
		System.out.println(" min = " + min);
		
		
		
//		
//		System.out.print(Byte.MIN_VALUE + " ");
//		System.out.println(Byte.MAX_VALUE);
//		System.out.print(Short.MIN_VALUE + " ");
//		System.out.println(Short.MAX_VALUE);
//		System.out.print(Integer.MIN_VALUE + " ");
//		System.out.println(Integer.MAX_VALUE);
//		System.out.print(Long.MIN_VALUE + " ");
//		System.out.println(Long.MAX_VALUE);
//		System.out.print(Float.MIN_VALUE + " ");
//		System.out.println(Float.MAX_VALUE);
//		System.out.print(Double.MIN_VALUE + " ");
//		System.out.println(Double.MAX_VALUE);
//		System.out.print(Character.MIN_VALUE + " ");
//		System.out.println(Character.MAX_VALUE);
		

		int array1 [] = { 32, -34, 65, -5474, 2342, 543, 6, 32, 32424, 4234, 3, -5, 45, 4, 5, 3, 2, 6, 3, -5, 42, 234, 32, 3, 4, 2, -34, 32, 4325434, 34534 };
		
		int minimum = 0;
		int maximum = 0;
		
		for (int j = 0; j < array1.length; j++) {
			if (array1[j] > maximum) {
				maximum = array1[j];
				
			}
			if (array1[j] < minimum){
				minimum = array1[j];
				
			}
			
			System.out.print("max = " + maximum);
			System.out.println(" min = " + minimum);
//		//	System.out.println("min = " + min + " max = " + max);
			}
		
//		int array [] =  {5, 10, 25, -45, 155, 500, 65,83, 150, 790, -1, 52, 320, 560};
//		
//		int max = 0;
//		int min = 0;
//		
//		for (int j = 0; j < array.length; j++) {
//			if (array[j] > max) {
//				max = array[j];
//			}
//			if (array[j] < min) {
//				min = array[j];
//			}
//		}
//		
//		System.out.println("max =" + max);
//		System.out.println("min =" + min);
	
	}
	
}
