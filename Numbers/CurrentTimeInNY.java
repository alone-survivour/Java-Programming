import java.util.Calendar;
import java.util.TimeZone;

public class CurrentTimeInNY {
	public void getCurrentTimeNY() {
		Calendar cal = Calendar.getInstance();
		cal.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		int hourInNY = cal.get(Calendar.HOUR_OF_DAY);
		int minInNY = cal.get(Calendar.MINUTE);
		int secInNY = cal.get(Calendar.SECOND);
		System.out.println("Current time in New York: "+hourInNY+" : "+minInNY+" : "+secInNY);
	}

	public static void main(String[] args) {
		CurrentTimeInNY cnty = new CurrentTimeInNY();
		cnty.getCurrentTimeNY();
	}

}
