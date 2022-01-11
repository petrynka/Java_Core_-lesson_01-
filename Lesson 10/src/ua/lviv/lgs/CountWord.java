package ua.lviv.lgs;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		while(true) {
			System.out.println("Enter Text: ");
			str = sc.nextLine();
			
			String [] strArray = str.split(" ");
			int [] frequency = new int[strArray.length];
			int count = 0;
			
			for(int i = 0; i < strArray.length; i++) {
				for(int j = 0; j < strArray.length; j++) {
					if(strArray[i].equals(strArray[j])) {
						count++;
					}
				}
				frequency[i] = count;
				count = 0;
			}
			
			int max = frequency[0];
            int address = 0;
            for (int i = 0; i < frequency.length; i++) {
                if(frequency[i] > max){
                    max = frequency[i];
                    address = i;
                }
            }
            System.out.println("The most frequent word is '" + strArray[address] + "'");
		}
	}

}
