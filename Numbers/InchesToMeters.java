import java.util.Scanner;

public class InchesToMeters {
	public double inchesTometers(double InputInInches) {
		double ResultInMeters = InputInInches * 0.0254;
		return ResultInMeters;
	}
	public double truncateTo(double value, int decimalPlaces) {
		int truncatedNumberInt=(int)(value*Math.pow(10, decimalPlaces));
		double truncatedNumber=(double)(truncatedNumberInt/Math.pow(10, decimalPlaces));
		return truncatedNumber;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height in inches: ");
		double userGivenInput = sc.nextDouble();
		InchesToMeters im = new InchesToMeters();
		System.out.println(userGivenInput+" inches is equal to "+im.truncateTo(im.inchesTometers(userGivenInput), 3)+" meters");
		sc.close();
	}

}
