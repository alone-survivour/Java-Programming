import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DaysAfterTwoWeeks {
	public void getDateAfterTwoWeeks(int noOfDays) {
		Calendar cal = Calendar.getInstance();
		Date dt = cal.getTime();
		System.out.println("Current time: "+dt);
		cal.add(Calendar.DAY_OF_YEAR, noOfDays);
		Date mdt = cal.getTime();
		System.out.println("After adding "+noOfDays+" days, date will be "+mdt);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of days you want to add: ");
		int daysTobeAdded = s.nextInt();
		DaysAfterTwoWeeks dtoer = new DaysAfterTwoWeeks();
		dtoer.getDateAfterTwoWeeks(daysTobeAdded);
		s.close();
	}

}
