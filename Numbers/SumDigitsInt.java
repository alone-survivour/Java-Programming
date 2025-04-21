import java.util.Scanner;

public class SumDigitsInt {
	public int getSumOfDigits(int inputNum) {
		int sumDigits = 0;
		if(inputNum >0 && inputNum < 1000) {
			while(inputNum != 0) {
				int remDivision = inputNum%10;
				sumDigits = sumDigits+remDivision;
				inputNum = inputNum/10;
			}
		} else {
			return 0;
		}
		return sumDigits;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter positive integer less than 1000: ");
		int userInputNum = sc.nextInt();
		SumDigitsInt sdi = new SumDigitsInt();
		System.out.println("Sum of the digits of given integer "+userInputNum+" is: "+sdi.getSumOfDigits(userInputNum));
		sc.close();
	}

}
