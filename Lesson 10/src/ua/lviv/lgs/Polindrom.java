package ua.lviv.lgs;

import java.util.Scanner;

public class Polindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		while(true) {
			System.out.println("������ ����� � 5-�� ����");
			 str = sc.next().toUpperCase();
			 StringBuffer rev = new StringBuffer(str).reverse();
			 String strRev = rev.toString();
			 if(str.equalsIgnoreCase(strRev)) {
				 System.out.println("³��� ���� ����� �������� !");
			 }
			 else if(str.length()!= 4) {
				 System.out.println("���� ����� �� �������� �� ����, ��������� ��");
			 }
		}
	}
}
