package ua.lviv.lgs;

import java.util.Iterator;
import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		char chars [] = {'�', '�', '�', '�', '�', '�' };
		while(true) {
			System.out.println("������ ����-��� �������: ");
			str = sc.next().toUpperCase();
			
			char strChar [] = str.toLowerCase().toCharArray();
			
			for(int i=0; i < strChar.length; i++) {
				for(int j = 0; j < chars.length; j++) {
					if(strChar[i] == chars[j]) {
						strChar[i] = '-';
						continue;
					}
				}
			}
			
			System.out.println("���������: ");
			System.out.println(strChar);
			
		}
	}
}
