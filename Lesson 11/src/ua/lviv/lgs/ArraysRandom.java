package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class ArraysRandom {
	public static void main(String[] args) {
		Random r = new Random();
		Integer array[] = new Integer [25];
		
		for(int i=0; i<array.length;i++) {
			array[i] = r.nextInt(1000-1+1)+1;
		}
		System.out.println("Before sorting: ");
		System.out.println("array = "+ Arrays.toString(array));
		
		System.out.println("Sorting by asc: ");
		Arrays.sort(array);
		System.out.println("Sorted array asc = "+ Arrays.toString(array));
		
		System.out.println("Sorting by desc: ");
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Sorted array desc = "+ Arrays.toString(array));
	}
		
	
}