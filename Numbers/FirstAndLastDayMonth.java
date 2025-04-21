import java.time.YearMonth;
import java.util.Scanner;

public class FirstAndLastDayMonth {
	public void getFirstAndLastDayOfMonth(int yearGiven, int dayGiven) {
		YearMonth ym = YearMonth.of(yearGiven, dayGiven);
		String firstDayOfMonth = ym.atDay(1).getDayOfWeek().name();
		String lastDayOfMonth = ym.atEndOfMonth().getDayOfWeek().name();
		System.out.println("First day of the month "+firstDayOfMonth+" and last day of the month "+lastDayOfMonth);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int userInputYear = sc.nextInt();
		System.out.println("Enter the month: ");
		int userInputMonth = sc.nextInt();
		FirstAndLastDayMonth fdms = new FirstAndLastDayMonth();
		fdms.getFirstAndLastDayOfMonth(userInputYear, userInputMonth);
		sc.close();

	}

}
