import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class LocaliseTime {
	public String[] getLocalisedWeekDayNames(String inputStr) {
		DateFormatSymbols dm = new DateFormatSymbols(new Locale(inputStr));
		String[] weekDaysGot = dm.getWeekdays();
		return weekDaysGot;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the localised serial code: ");
		String userInputGiven = sc.next();
		LocaliseTime lttte = new LocaliseTime();
		String[] outputDaysGot = lttte.getLocalisedWeekDayNames(userInputGiven);
		for(String s: outputDaysGot) {
			System.out.println(s);
		}
		sc.close();
	}

}
