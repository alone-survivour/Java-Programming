import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class GetTheDayOfWeek {
	public int getDayOfTheWeek(int givenYear, int givenMonth, int givenDay) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal.set(Calendar.YEAR, givenYear);
		cal.set(Calendar.MONTH, givenMonth);
		cal.set(Calendar.DAY_OF_WEEK, givenDay);
		Date dt = cal.getTime();
		cal2.setTime(dt);
		int daysInWeek = cal2.get(Calendar.DAY_OF_WEEK);
		return daysInWeek;
	}

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int yearGiven = c.nextInt();
		System.out.println("Enter the month: ");
		int monGiven = c.nextInt();
		System.out.println("Enter the day: ");
		int dayGiven = c.nextInt();
		GetTheDayOfWeek gtdow = new GetTheDayOfWeek();
		System.out.println("Day of the week is: "+gtdow.getDayOfTheWeek(yearGiven, monGiven, dayGiven));
		c.close();
	}

}
