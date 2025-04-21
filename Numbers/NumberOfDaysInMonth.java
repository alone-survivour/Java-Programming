import java.util.Calendar;

public class NumberOfDaysInMonth {
	public int getMaxOfDaysInMonth(int monthGiven) {
		Calendar cal = Calendar.getInstance();
		int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		return daysInMonth;
	}

	public static void main(String[] args) {
		NumberOfDaysInMonth mnmnm = new NumberOfDaysInMonth();
		System.out.println("Number of days of current month: "+mnmnm.getMaxOfDaysInMonth(4));
	}

}
