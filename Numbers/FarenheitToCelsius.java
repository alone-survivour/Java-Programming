import java.util.Scanner;

public class FarenheitToCelsius {
	public double convertFtoC(double tempF) {
		double tempC = (tempF - 32)*(0.5556);
		return tempC;
	}
	public double truncateTo(double value, int decimalPlaces) {
		int truncatedNumberInt=(int)(value*Math.pow(10, decimalPlaces));
		double truncatedNumber=(double)(truncatedNumberInt/Math.pow(10, decimalPlaces));
		return truncatedNumber;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Farenheit: ");
		double userGivenTemp = sc.nextDouble();
		FarenheitToCelsius conv1 = new FarenheitToCelsius();
		System.out.println(userGivenTemp+" deg F means "+conv1.truncateTo(conv1.convertFtoC(userGivenTemp), 2)+" deg C");
		sc.close();
	}

}
