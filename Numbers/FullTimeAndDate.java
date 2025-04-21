import java.util.Calendar;

public class FullTimeAndDate {
	public void getFullTimeAndDate() {
		Calendar now = Calendar.getInstance();
		System.out.println("Current full date and time is : " + (now.get(Calendar.MONTH) + 1) + "-"
		        + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR) + " "
		        + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":"
		        + now.get(Calendar.SECOND) + "." + now.get(Calendar.MILLISECOND));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeAndDate fd = new FullTimeAndDate();
		fd.getFullTimeAndDate();

	}

}
