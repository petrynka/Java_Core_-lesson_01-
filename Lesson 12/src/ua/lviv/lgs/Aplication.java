package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplication {
	
	
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(12);
		list.add("Black");
		list.add(54);
		list.add(true);
		list.add("body");
		list.add('c');
		list.add(7.27);
		
		while(true) {
			System.out.println("Enter 1 if you want to add smth: ");
			System.out.println("Enter 2 if you want to delete smth by index: ");
			System.out.println("Enter 3 to display Collection: ");
			
			Scanner sc = new Scanner(System.in);
			
			switch(sc.nextInt()) {
			case 1:{
				System.out.println("Enter what you want to add: ");
				sc = new Scanner(System.in);
				String str = sc.next();
				list.add(str);
				break;
			}
			case 2:{
				System.out.println("Enter index: ");
				sc = new Scanner(System.in);
				int index = sc.nextInt();
				list.remove(index);
			}break;
			case 3:{
				for(Object o : list) {
					System.out.println(o);
				}
			}break;
			}
		}
	}
}
