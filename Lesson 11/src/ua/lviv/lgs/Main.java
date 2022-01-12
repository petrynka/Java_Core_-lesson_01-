package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		Auto [][] autos = new Auto[r.nextInt(10)][r.nextInt(10)];
		
		while(true) {
			System.out.println("Choose from menu: ");
			System.out.println("Enter 1 to display array");
			System.out.println("Enter 2 to auto Fill");
			
			String str = sc.nextLine();
			
			switch (str) {
			case "1": {
				System.out.println(Arrays.deepToString(autos));
			}
			
			case "2": {
				for(int i =0; i<autos.length; i++) {
					Arrays.fill(autos[i], new Auto(135, 2012, new SteringWheel("Alcantara",30), new Engine(4)));
				}
			}
			default:
				
			}
		}
		

	}

}
