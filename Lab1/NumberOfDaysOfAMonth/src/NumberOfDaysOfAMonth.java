import java.util.*;
public class NumberOfDaysOfAMonth {
	
	static String[] listMonth = {"1","2","3","4","5","6","7","8","9","10","11","12","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec","Jan.","Feb.","Mar.","Apr.","May","June","July","Aug.","Sept.","Oct.","Nov.","Dec.","January","February","March","April","May","June","July","August","September","October","November","December"};
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String month = scan.nextLine();
		int year = scan.nextInt();
		
		scan.close();
		
		int monthIndex = defineMonth(month, listMonth);
		if (monthIndex == -1) {
			System.out.println("Invalid month");
			return;
		}
		int numDays = getNumDaysOfMonth(monthIndex + 1, year);
		System.out.printf("%d, %s has %d days.%n", year, listMonth[monthIndex + 36], numDays);
		
	}
	public static boolean checkLeapYear(int year) {
		if (year%4==0 && (year%100!=0 || year%400==0)) {
			return true;
		}
		return false;
	}
	public static int defineMonth(String month, String[] listMonth) {
		 int getIndex = Arrays.asList(listMonth).indexOf(month);
		 return getIndex % 12;
	}
	public static int getNumDaysOfMonth(int month, int year) {
		if (month == 2) {
			return checkLeapYear(year)? 29 : 28;
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}
		else {
			return 31;
		}
	}
}                    