import java.util.Calendar;

public class DefaultCalendar {
	public void getDefaultDateDetails() {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		
	}

	public static void main(String[] args) {
		DefaultCalendar dc2 = new DefaultCalendar();
		dc2.getDefaultDateDetails();
	}

}
