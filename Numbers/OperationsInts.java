import java.util.Scanner;

public class OperationsInts {
	public void getAllPosiibleOps(int inputNum1, int inputNum2) {
		int additionOfInts = inputNum1+inputNum2;
		int subtractionOfInts = inputNum1 - inputNum2;
		int productOfInts = inputNum1 * inputNum2;
		float floordivisionOfInts = inputNum1/inputNum2;
		int moduloDivisionOfInts = inputNum1%inputNum2;
		float averageOfInts = (inputNum1+inputNum2)/2;
		int maximumInt = 0;
		int minimumInt = 0;
		if(inputNum1 > inputNum2) {
			maximumInt = inputNum1;
		} else {
			maximumInt = inputNum2;
		}
		if(inputNum1 < inputNum2) {
			minimumInt = inputNum1;
		} else {
			minimumInt = inputNum2;
		}
		System.out.println("Addition of "+inputNum1+" and "+inputNum2+" is: "+additionOfInts);
		System.out.println("Subtraction of "+inputNum1+" and "+inputNum2+" is: "+subtractionOfInts);
		System.out.println("Product of "+inputNum1+" and "+inputNum2+" is: "+productOfInts);
		System.out.println("Floor division result of "+inputNum1+" and "+inputNum2+" is: "+floordivisionOfInts);
		System.out.println("Modulo division result of "+inputNum1+" and "+inputNum2+" is: "+moduloDivisionOfInts);
		System.out.println("Average of "+inputNum1+" and "+inputNum2+" is: "+averageOfInts);
		System.out.println("Maximum of "+inputNum1+" and "+inputNum2+" is: "+maximumInt);
		System.out.println("Minimum of "+inputNum1+" and "+inputNum2+" is: "+minimumInt);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int inputNum1 = sc.nextInt();
		System.out.println("Enter the second integer: ");
		int inputNum2 = sc.nextInt();
		sc.close();
		OperationsInts op = new OperationsInts();
		op.getAllPosiibleOps(inputNum1, inputNum2);
	}

}
