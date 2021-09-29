import java.util.Calendar;

public class ActualMaxandMinDates {
	public void getMaxAndMinDetails() {
		Calendar Cal = Calendar.getInstance();
		System.out.println("Current date and time: "+Cal.getTime());
		System.out.println();
		System.out.println("Actual maximum year: "+Cal.getActualMaximum(Calendar.YEAR));
		System.out.println("Actual maximum month: "+Cal.getActualMaximum(Calendar.MONTH));
		System.out.println("Actual maximum Week: "+Cal.getActualMaximum(Calendar.WEEK_OF_YEAR));
		System.out.println("Actual maximum Week: "+Cal.getActualMaximum(Calendar.DATE));
	}

	public static void main(String[] args) {
		ActualMaxandMinDates amsd = new ActualMaxandMinDates();
		amsd.getMaxAndMinDetails();
	}

}
