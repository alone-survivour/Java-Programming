//import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//import java.time.LocalDateTime;   
public class GMTTimeZone {
	public void getGMTTime(long inputOffSet) {
		long timeZoneChange = inputOffSet;
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + timeZoneChange) % 24);
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input the time zone offset to GMT: ");
		long timeZoneChange = input.nextInt();
		input.close();
		GMTTimeZone gt = new GMTTimeZone();
		gt.getGMTTime(timeZoneChange);
		
		
		/**
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String currentTime = dtf.format(now);
		String[] seperated = currentTime.split(":");
		int hoursNow = Integer.parseInt(seperated[0]);
		int minNow = Integer.parseInt(seperated[1]);
		int hourGMT = hoursNow - 5;
		int minGMT = minNow - 30;
		String[] seperated2 = new String[seperated.length];
		seperated2[0]=String.valueOf(hourGMT);
		seperated2[1]=String.valueOf(minGMT);
		seperated2[2]=seperated[2];
		String currentTimeGMT = seperated2[0]+":"+seperated2[1]+":"+seperated2[2];
		System.out.println("Current time in IST: "+currentTime);
		System.out.println("Curren time in GMT: "+currentTimeGMT);
		**/
	}

}
