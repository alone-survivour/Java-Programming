import java.util.Scanner;

public class MinutesToDaysYears {
	public void geetDaysAndYears(int inputMin) {
		int yearsSpent = ((inputMin/60)/24)/365;
		int daysSpent = ((3456789/60)/24)%365;
		System.out.println(inputMin+ " minutes is "+yearsSpent+" years and "+daysSpent+" days");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the minutes: ");
		int userInputMin = sc.nextInt();
		MinutesToDaysYears m = new MinutesToDaysYears();
		m.geetDaysAndYears(userInputMin);
		sc.close();
	}

}
