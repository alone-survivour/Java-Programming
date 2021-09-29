import java.util.Scanner;

public class CheckLeapYearOrNot {
	public boolean checkLeapYear(int inputYear) {
		boolean isLeapYear = false;
		if(inputYear%4 == 0) {
			if(inputYear%100 == 0) {
				if(inputYear%400 == 0) {
					isLeapYear = true;
				} else {
					isLeapYear = false;
				}
			} else {
				isLeapYear = true;
			}
		} else {
			isLeapYear = false;
		}
		return isLeapYear;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year to check: ");
		int yearGiven = s.nextInt();
		CheckLeapYearOrNot clpry = new CheckLeapYearOrNot();
		if(clpry.checkLeapYear(yearGiven)) {
			System.out.println(yearGiven+" is a leap year");
		} else {
			System.out.println(yearGiven+" is not a leap year");
		}
		s.close();

	}

}
