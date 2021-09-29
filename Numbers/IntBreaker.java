import java.util.Scanner;

public class IntBreaker {
	public String getSpacesBwDig(int inputNum) {
		String strWithDigitsWSpaces = "";
		String numInStrForm = String.valueOf(inputNum);
		char[] digitsInnumInStrForm = numInStrForm.toCharArray();
		for(char x: digitsInnumInStrForm) {
			strWithDigitsWSpaces = strWithDigitsWSpaces + String.valueOf(x) + " ";
		}
		return strWithDigitsWSpaces;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Positive integer: ");
		int userInput = sc.nextInt();
		IntBreaker ib = new IntBreaker();
		String resultant = ib.getSpacesBwDig(userInput);
		System.out.println(userInput+" with spaces between digits "+resultant.trim());
		sc.close();
	}

}