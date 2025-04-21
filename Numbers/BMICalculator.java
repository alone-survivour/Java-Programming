import java.util.Scanner;

public class BMICalculator {
	public double calculateBMI(double inputWeight, double inputHeight) {
		double userWeight = inputWeight*0.45359237;
		double userHeight = inputHeight*0.0254;
		double BMICalculated = (userWeight/(userHeight*userHeight));
		return BMICalculated;
	}
	public double truncateTo(double value, int decimalPlaces) {
		int truncatedNumberInt=(int)(value*Math.pow(10, decimalPlaces));
		double truncatedNumber=(double)(truncatedNumberInt/Math.pow(10, decimalPlaces));
		return truncatedNumber;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight in pounds: ");
		double userWeight = sc.nextDouble();
		System.out.println("Enter the height in inches: ");
		double userHeight = sc.nextDouble();
		BMICalculator bmi = new BMICalculator();
		System.out.print("Your BMI is: "+bmi.truncateTo(bmi.calculateBMI(userWeight, userHeight), 3));
		sc.close();
	}

}
