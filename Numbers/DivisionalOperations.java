import java.util.Scanner;

public class DivisionalOperations {
	public void getDivisionMethods(int inputNum1, int inputNum2) {
		System.out.println("===============Floor and modulo divisions using operators=====================");
		float divisionResult1 = inputNum1/inputNum2;
		float divisionResult2 = inputNum1%inputNum2;
		System.out.println("Floor division of the "+inputNum1+" and "+inputNum2+" is: "+divisionResult1);
		System.out.println("Modulo division of the "+inputNum1+" and "+inputNum2+" is: "+divisionResult2);
		System.out.println();
		System.out.println("===============Floor and modulo divisions using Math module=====================");
		float divisionResult3 = Math.floorDiv(inputNum1, inputNum2);
		float divisionResult4 = Math.floorMod(inputNum1, inputNum2);
		System.out.println("Floor division of the "+inputNum1+" and "+inputNum2+" is: "+divisionResult3);
		System.out.println("Modulo division of the "+inputNum1+" and "+inputNum2+" is: "+divisionResult4);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first num: ");
		int inputNum1 = sc.nextInt();
		System.out.println("Enter the second num: ");
		int inputNum2 = sc.nextInt();
		sc.close();
		DivisionalOperations d = new DivisionalOperations();
		d.getDivisionMethods(inputNum1, inputNum2);
	}

}
