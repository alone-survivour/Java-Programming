import java.util.Scanner;

public class SqCbFourthPower {
	public void getPowers(int inputNum) {
		int SquareOfNum = (int) Math.pow(inputNum, 2);
		int CubeOfNum = (int) Math.pow(inputNum, 3);
		int FourthPowerOfNum = (int) Math.pow(inputNum, 4);
		System.out.println("Square of "+inputNum+" is: "+SquareOfNum+", Cube of "+inputNum+" is: "+CubeOfNum+" and fourth power of "+inputNum+" is: "+FourthPowerOfNum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the positive integer: ");
		int numInt = sc.nextInt();
		sc.close();
		SqCbFourthPower scfp = new SqCbFourthPower();
		scfp.getPowers(numInt);
	}

}
