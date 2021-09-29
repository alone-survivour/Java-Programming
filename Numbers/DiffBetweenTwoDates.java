import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DiffBetweenTwoDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate userGiven = LocalDate.of(2015, Month.MAY, 15);
		Period diff = Period.between(userGiven, today);
		System.out.println("Difference between "+today+" and "+userGiven+" is "+diff.getMonths()+" Year(s) and "+diff.getMonths()+" Month(s)");
	}
}
