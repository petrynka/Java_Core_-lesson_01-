package ua.lviv.lgs;

import java.util.Scanner;

public class Polindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		while(true) {
			System.out.println("Введіть слово з 5-ти букв");
			 str = sc.next().toUpperCase();
			 StringBuffer rev = new StringBuffer(str).reverse();
			 String strRev = rev.toString();
			 if(str.equalsIgnoreCase(strRev)) {
				 System.out.println("Вітаю ваше слово поліндром !");
			 }
			 else if(str.length()!= 4) {
				 System.out.println("Ваше слово не підходить під опис, спробуйте ще");
			 }
		}
	}
}
