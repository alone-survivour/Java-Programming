import java.util.Calendar;

public class LastDayOfMonth {
	public int getLastDayOfTheMonth() {
		Calendar cal = Calendar.getInstance();
		int lastDayOfMon = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		return lastDayOfMon;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastDayOfMonth ldm = new LastDayOfMonth();
		System.out.println("Last day of the current month is "+ldm.getLastDayOfTheMonth());

	}

}
