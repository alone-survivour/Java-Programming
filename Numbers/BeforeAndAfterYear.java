import java.util.Calendar;
import java.util.Date;

public class BeforeAndAfterYear {
	public void getBeforeAfterCurrent() {
		Calendar cal = Calendar.getInstance();
		Date current_date = cal.getTime();
		System.out.println("Current date and time: "+current_date);
		cal.add(Calendar.YEAR, 1);
		Date new_year = cal.getTime();
		System.out.println("Next year date and time: "+new_year);
		cal.add(Calendar.YEAR, -2);
		Date prev_year = cal.getTime();
		System.out.println("Previous year date and time: "+prev_year);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeforeAndAfterYear bff = new BeforeAndAfterYear();
		bff.getBeforeAfterCurrent();

	}

}
