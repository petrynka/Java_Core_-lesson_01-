package ua.lviv.lgs.consolProg;

import java.util.Iterator;
import java.util.Scanner;

public class Aplication {

	enum Seasons{
		WINTER, SPRING, SUMMER, FALL;
	}
	
	enum Months{
		JANURARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 28), MARCH(Seasons.SPRING, 31), APRIL(Seasons.SPRING, 30), MAY(Seasons.SPRING, 31), 
		JUNE(Seasons.SUMMER, 30), JULY(Seasons.SUMMER,31), AUGUST(Seasons.SUMMER, 30), SEPTEMBER(Seasons.FALL, 31), OCTOBER(Seasons.FALL, 30), NOVEMBER(Seasons.FALL, 31), 
		DECEMBER(Seasons.WINTER, 30);
		
		int days;
		Seasons seasons;
		
		private Months(Seasons seasons, int days) {
			this.days = days;
			this.seasons = seasons;
			
			
			
			
		}
		
		public int getDays() {
			return days;
		}

		public Seasons getSeasons() {
			return seasons;
		}

		static void menu(){
			System.out.println("Натичніть 1, щоб перевірити чи такий місяць існує");
			System.out.println("Натичніть 2, щоб вивести всі місяці з такою ж порою року");
			System.out.println("Натичніть 3, щоб вивести всі місяці які мають таку саму кількість днів");
			System.out.println("Натичніть 4, щоб вивести на екран всі місяці які мають меншу кількість днів");
			System.out.println("Натичніть 5, щоб вивести на екран всі місяці які мають більшу кількість днів");
			System.out.println("Натичніть 6, щоб вивести на екран наступну пору року");
			System.out.println("Натичніть 7, щоб вивести на екран попередню пору року");
			System.out.println("Натичніть 8, щоб вивести на екран всі місяці які мають парну кількість днів");
			System.out.println("Натичніть 9, щоб вивести на екран всі місяці які мають непарну кількість днів");
			System.out.println("Натичніть 10, щоб вивести на екран чи введений з консолі місяць має парну кількість днів");
		}
		
		static boolean isMonth(String str) {
			boolean isMonth = false;
			for(Months month : Months.values()) {
				if(str.equalsIgnoreCase(month.name())) {
					isMonth = true;
					break;
				}
			}
			return isMonth;
		}
		
		static boolean isSeason(String str) {
			boolean isSeason = false;
			for(Seasons season : Seasons.values()) {
				if(str.equalsIgnoreCase(season.name())) {
					isSeason = true;
					break;
				}
			}
				return isSeason;
		}
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			Months[] mas = Months.values();
			String str;
			
			while(true) {
				menu();
				
				switch (sc.nextInt()) {
				case 1: {
					System.out.println("Enter month");
					sc = new Scanner(System.in);
					
					str = sc.next().toUpperCase();
					
					
						if(isMonth(str)) {
							System.out.println("Month exist");
						
						}
					
						else {
						System.out.println("Month dosent exist");
					}
						System.out.println("======================================================================");
						
					break;
				}
				case 2: {
					System.out.println("Enter Season");
					sc = new Scanner(System.in);
					
					str = sc.next().toUpperCase();
					
						if(isSeason(str)) {
							for(Months month : Months.values()) {
								if(month.getSeasons().name().equalsIgnoreCase(str)) {
									System.out.println(month);
								}
							}
						}
						else {
							System.out.println("Season dosent exist");
						}
						System.out.println("=======================================================================");
						break;
					}
				case 3: {
					System.out.println("Enter Month");
					str = sc.next();
					
					if(isMonth(str)) {
						System.out.println("Months with equals days: ");
						Months month = Months.valueOf(str.toUpperCase());
						for(Months m : Months.values()) {
							if(m.getDays() == month.getDays()) {
								System.out.println(m);
							}
						}
					}else {
						System.out.println("Month dosent exist");
					}
						System.out.println("=========================================================================");
						break;
				}
				case 4:{
					System.out.println("Enter Month: ");
					str = sc.next();
					
					if(isMonth(str)) {
						System.out.println("Month with fewer days: ");
						Months month = Months.valueOf(str.toUpperCase());
						for(Months m : Months.values()) {
							if(m.getDays()<month.getDays()) {
								System.out.println(m);
							}
						}
					}else {
						System.out.println("Month dosent exist");
					}
						System.out.println("===========================================================================");
						break;
					
				}
				case 5:{
					System.out.println("Enter Month: ");
					str = sc.next();
					
					if(isMonth(str)) {
						System.out.println("months with more days: ");
						Months month = Months.valueOf(str.toUpperCase());
						for(Months m : Months.values()) {
							if(m.getDays()>month.getDays()) {
								System.out.println(m);
							}
						}
					}else {
						System.out.println("Month dosent exist");
					}
					System.out.println("================================================================================");
					break;
				}
				case 6:{
					System.out.println("Enter Season: ");
					str = sc.next();
					
					if(isSeason(str)) {
						System.out.println("Next season: ");
							System.out.println(Seasons.values()[(Seasons.valueOf(str.toUpperCase()).ordinal()+1)%4]);
						}else {
							System.out.println("Season dosent exist");
						}
					System.out.println("===============================================================================");
					break;
					}
				case 7:{
					System.out.println("Enter Season: ");
					str = sc.next();
					
					if(isSeason(str)) {
						System.out.println("Previous season: ");
						int ord = Seasons.valueOf(str.toUpperCase()).ordinal() - 1;
                        System.out.println(Seasons.values()[ord < 0 ? 3 : ord]);
					}
					else {
						System.out.println("Season dosent exist");
					}
					System.out.println("===============================================================================");
					break;
				}
				case 8:{
					for(Months month : Months.values()) {
						if(month.getDays() %2 == 0) {
							System.out.println(month);
						}
					}
					System.out.println("===============================================================================");
					break;
				}
				
				case 9:{
					for(Months month : Months.values()) {
						if(month.getDays() %2 !=0) {
							System.out.println(month);
						}
					}
					System.out.println("===============================================================================");
					break;
				}
				
				case 10:{
					System.out.println("Enter Months");
					str = sc.next();
					
					if(isMonth(str)) {
						Months m = Months.valueOf(str.toUpperCase());
							if(m.getDays()%2==0) {
								System.out.println("Month even");
							}
							else {
								System.out.println("Month dosent even");
							}
						
					}
					else
						System.out.println("Month dosent exist");
					System.out.println("====================================================================================");
					break;
				}
				
				
				
				
				
				
				
				
				}
				
				}
			}
		}
		
	}
	

