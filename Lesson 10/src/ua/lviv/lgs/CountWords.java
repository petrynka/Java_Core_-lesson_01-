package ua.lviv.lgs;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("¬вед≥ть реченн€ через проб≥ли");
		str = sc.nextLine();
		int count = 0;
		
		if(str.length()!= 0) {
			count++;
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i) == ' ') {
					count++;
				}
			}
		}
		
		System.out.println("¬и ввели "+count+" сл≥в");
	}

}
