import java.util.Scanner;

public class DistanceCalc {
	public void calcDistance(int inputHours, int inputMinutes, int inputSec, int inputMeters) {
		int HoursToSeconds = inputHours * 60 * 60;
		int MinutesToseconds = inputMinutes * 60;
		int TotalSeconds = HoursToSeconds + MinutesToseconds + inputSec;
		System.out.println("Your speed in meters/second: "+(float) inputMeters/TotalSeconds);
		System.out.println("Your speed in km/hr: "+((float) inputMeters/TotalSeconds)*3.6);
		System.out.println("Your speed in miles/hr: "+((float) inputMeters/TotalSeconds)*2.236936);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hours: ");
		int inputHours = sc.nextInt();
		System.out.println("Enter the minutes: ");
		int inputMin = sc.nextInt();
		System.out.println("Enter the seconds: ");
		int inputSeconds = sc.nextInt();
		System.out.println("Enter the distance in meters: ");
		int inputDist = sc.nextInt();
		sc.close();
		DistanceCalc dc = new DistanceCalc();
		dc.calcDistance(inputHours, inputMin, inputSeconds, inputDist);
	}

}
