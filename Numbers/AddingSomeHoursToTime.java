import java.time.LocalTime;
import java.util.Scanner;

public class AddingSomeHoursToTime {
	
	public void getAddedLocalTime(int numOfhoursToadd) {
		LocalTime time = LocalTime.now();
		LocalTime timeModified = time.plusHours(numOfhoursToadd);
		System.out.println("Current time: "+time);
		System.out.println("Time after adding "+numOfhoursToadd+" hours is "+timeModified);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of hours you want to add: ");
		int hoursToBeAdded = s.nextInt();
		AddingSomeHoursToTime adderst = new AddingSomeHoursToTime();
		adderst.getAddedLocalTime(hoursToBeAdded);
		s.close();
	}

}
