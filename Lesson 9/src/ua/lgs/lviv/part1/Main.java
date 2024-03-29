/**
 * Logos IT Academy
 * Java Core
 * Lesson 9
 */

package ua.lgs.lviv.part1;

import java.util.Scanner;


/**
 * @since java 1.8
 * @author Petrynka Arsen
 * @vesrsion 1.1
 */

public class Main {

	enum Seasons {
		WINTER, SPRING, SUMMER, FALL;
	}

	enum Months {
		/* fill enum Months with 12 months */
		JANURARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 28), MARCH(Seasons.SPRING, 31),
		APRIL(Seasons.SPRING, 30), MAY(Seasons.SPRING, 31), JUNE(Seasons.SUMMER, 30), JULY(Seasons.SUMMER, 31),
		AUGUST(Seasons.SUMMER, 30), SEPTEMBER(Seasons.FALL, 31), OCTOBER(Seasons.FALL, 30), NOVEMBER(Seasons.FALL, 31),
		DECEMBER(Seasons.WINTER, 30);
		
		 /* contains number of days in month */
		int days;
		/* private variable that's shows to what season belong month */
		Seasons seasons;
		
		/* this is constructor */
		private Months(Seasons seasons, int days) {
			this.days = days;
			this.seasons = seasons;

		}
		
		/* return the days that's month belong to */
		public int getDays() {
			return days;
		}
		
		/* return the season that's month belong to */
		public Seasons getSeasons() {
			return seasons;
		}
		
		/**
	     * @author Petrynka Arsen
	     * @return null
	     * @use java code convection
	     *
	     * Display on console menu items
	     **/

		static void menu() {
			System.out.println("��������� 1, ��� ��������� �� ����� ����� ����");
			System.out.println("��������� 2, ��� ������� �� ����� � ����� � ����� ����");
			System.out.println("��������� 3, ��� ������� �� ����� �� ����� ���� ���� ������� ����");
			System.out.println("��������� 4, ��� ������� �� ����� �� ����� �� ����� ����� ������� ����");
			System.out.println("��������� 5, ��� ������� �� ����� �� ����� �� ����� ����� ������� ����");
			System.out.println("��������� 6, ��� ������� �� ����� �������� ���� ����");
			System.out.println("��������� 7, ��� ������� �� ����� ��������� ���� ����");
			System.out.println("��������� 8, ��� ������� �� ����� �� ����� �� ����� ����� ������� ����");
			System.out.println("��������� 9, ��� ������� �� ����� �� ����� �� ����� ������� ������� ����");
			System.out.println(
					"��������� 10, ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ����");
		}

		/**
	     * @param str
	     * @author Petrynka Arsen
	     * @return boolean
	     *
	     * Check if given string equals to the one of months and return true if yes and false if result is negative
	     **/
		
		static boolean isMonth(String str) {
			boolean isMonth = false;
			for (Months month : Months.values()) {
				if (str.equalsIgnoreCase(month.name())) {
					isMonth = true;
					break;
				}
			}
			return isMonth;
		}

		/**
	     * @param str
	     * @author Petrynka Arsen
	     * @return boolean
	     *
	     * Check if given string equals to the one of months and return true if yes and false if result is negative
	     **/
		
		static boolean isSeason(String str) {
			boolean isSeason = false;
			for (Seasons season : Seasons.values()) {
				if (str.equalsIgnoreCase(season.name())) {
					isSeason = true;
					break;
				}
			}
			return isSeason;
		}

		public static void main(String[] args) throws WrongInputConsoleParametersException {

			Scanner sc = new Scanner(System.in);
			Months[] mas = Months.values();
			String str;

			while (true) {
				menu();

				switch (sc.nextInt()) {
				case 1: {
					System.out.println("Enter month");
					sc = new Scanner(System.in);

					str = sc.next().toUpperCase();

					if (isMonth(str)) {
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

					if (isSeason(str)) {
						for (Months month : Months.values()) {
							if (month.getSeasons().name().equalsIgnoreCase(str)) {
								System.out.println(month);
							}
						}
					} else {
						System.out.println("Season dosent exist");
					}
					System.out.println("=======================================================================");
					break;
				}
				case 3: {
					System.out.println("Enter Month");
					str = sc.next();

					if (isMonth(str)) {
						System.out.println("Months with equals days: ");
						Months month = Months.valueOf(str.toUpperCase());
						for (Months m : Months.values()) {
							if (m.getDays() == month.getDays()) {
								System.out.println(m);
							}
						}
					} else {
						System.out.println("Month dosent exist");
					}
					System.out.println("=========================================================================");
					break;
				}
				case 4: {
					System.out.println("Enter Month: ");
					str = sc.next();

					if (isMonth(str)) {
						System.out.println("Month with fewer days: ");
						Months month = Months.valueOf(str.toUpperCase());
						for (Months m : Months.values()) {
							if (m.getDays() < month.getDays()) {
								System.out.println(m);
							}
						}
					} else {
						System.out.println("Month dosent exist");
					}
					System.out.println("===========================================================================");
					break;

				}
				case 5: {
					System.out.println("Enter Month: ");
					str = sc.next();

					if (isMonth(str)) {
						System.out.println("months with more days: ");
						Months month = Months.valueOf(str.toUpperCase());
						for (Months m : Months.values()) {
							if (m.getDays() > month.getDays()) {
								System.out.println(m);
							}
						}
					} else {
						System.out.println("Month dosent exist");
					}
					System.out.println(
							"================================================================================");
					break;
				}
				case 6: {
					System.out.println("Enter Season: ");
					str = sc.next();

					if (isSeason(str)) {
						System.out.println("Next season: ");
						System.out.println(Seasons.values()[(Seasons.valueOf(str.toUpperCase()).ordinal() + 1) % 4]);
					} else {
						System.out.println("Season dosent exist");
					}
					System.out
							.println("===============================================================================");
					break;
				}
				case 7: {
					System.out.println("Enter Season: ");
					str = sc.next();

					if (isSeason(str)) {
						System.out.println("Previous season: ");
						int ord = Seasons.valueOf(str.toUpperCase()).ordinal() - 1;
						System.out.println(Seasons.values()[ord < 0 ? 3 : ord]);
					} else {
						System.out.println("Season dosent exist");
					}
					System.out
							.println("===============================================================================");
					break;
				}
				case 8: {
					for (Months month : Months.values()) {
						if (month.getDays() % 2 == 0) {
							System.out.println(month);
						}
					}
					System.out
							.println("===============================================================================");
					break;
				}

				case 9: {
					for (Months month : Months.values()) {
						if (month.getDays() % 2 != 0) {
							System.out.println(month);
						}
					}
					System.out
							.println("===============================================================================");
					break;
				}

				case 10: {
					System.out.println("Enter Months");
					str = sc.next();

					if (isMonth(str)) {
						Months m = Months.valueOf(str.toUpperCase());
						if (m.getDays() % 2 == 0) {
							System.out.println("Month even");
						} else {
							System.out.println("Month dosent even");
						}

					} else
						System.out.println("Month dosent exist");
					System.out.println(
							"====================================================================================");
					break;
				}

				default: {
					throw new WrongInputConsoleParametersException();
				}

				}

			}
		}
	}

}
