import java.util.Calendar;

public class ActualMinDateAndYear {
	public void getMinimumDayAndYear() {
		Calendar Cal = Calendar.getInstance();
		System.out.println("Current date and time: "+Cal.getTime());
		System.out.println();
		System.out.println("Actual minimum year: "+Cal.getActualMinimum(Calendar.YEAR));
		System.out.println("Actual minimum month: "+Cal.getActualMinimum(Calendar.MONTH));
		System.out.println("Actual minimum Week: "+Cal.getActualMinimum(Calendar.WEEK_OF_YEAR));
		System.out.println("Actual minimum Week: "+Cal.getActualMinimum(Calendar.DATE));
	}

	public static void main(String[] args) {
		ActualMinDateAndYear amdkrj = new ActualMinDateAndYear();
		amdkrj.getMinimumDayAndYear();

	}

}
