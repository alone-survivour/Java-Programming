import java.util.Calendar;

public class LastDateOfMonth {
	public void getLastDateOfMonth() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(cal.getTime());
	}

	public static void main(String[] args) {
		LastDateOfMonth ldm2 = new LastDateOfMonth();
		ldm2.getLastDateOfMonth();
	}

}
