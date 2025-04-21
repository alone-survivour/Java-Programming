import java.util.Calendar;
import java.util.Scanner;

public class DateFromCalendar {
	
	public void getDateFromCalendar(int yearGiven, int monthGiven, int dayGiven) {
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(Calendar.YEAR, yearGiven);
		cal.set(Calendar.MONTH, monthGiven);
		cal.set(Calendar.DATE, dayGiven);
		System.out.println(cal.getTime());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int userInputYear = sc.nextInt();
		System.out.println("Enter the month: ");
		int userInputMonth = sc.nextInt();
		System.out.println("Enter the date: ");
		int userInputDate = sc.nextInt();
		DateFromCalendar dc = new DateFromCalendar();
		dc.getDateFromCalendar(userInputYear, userInputMonth, userInputDate);
		sc.close();
	}

}
