package com.exercises.conditionalStatements;

import java.util.Scanner;

public class Pattern1 {
	public void generatePattern(int inputRows) {
		for(int i=1; i<=inputRows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
	
	public void generatePattern2(int inputRows) {
		for(int i=1; i<=inputRows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
	
	public void generatePattern3(int inputRows) {
		int k=1;
		for(int i=1; i<=inputRows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(k++ + "\t");
			}
			System.out.print("\n");
		}
	}
	
	public void generatePattern4(int inputRows) {
		for(int i=1; i<=inputRows; i++) {
			for(int spacesReq=1; spacesReq<=(inputRows-i); spacesReq++) {
				System.out.print(" ");
			}
			for(int symbolToPrint=1; symbolToPrint <= ((2*i) - 1); symbolToPrint++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public void generatePattern5(int inputRows) {
		for(int i=1; i<=inputRows; i++) {
			for(int spacesReq=1; spacesReq<=(inputRows-i); spacesReq++) {
				System.out.print(" ");
			}
			for(int symbolToPrint=1; symbolToPrint <= ((2*i) - 1); symbolToPrint++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(int i=inputRows; i>=1; i--) {
			for(int spacesReq=inputRows; spacesReq>i; spacesReq--) {
				System.out.print(" ");
			}
			for(int symbolToPrint=1; symbolToPrint <= ((2*i) - 1); symbolToPrint++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public void generatePascalTriangle(int inputRows) {
		int spaces = inputRows, number = 1;
		for(int i=0; i<inputRows; i++) {
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			number = 1;
			for(int k=0; k<=i; k++) {
				System.out.print(number+ " ");
				number = number * (i-k)/(k+1);
			}
			spaces--;
			System.out.println();
		}
	}
	
	public void generatePattern7(int inputRows) {
		for(int i=inputRows; i>=1; i--) {
			for(int j = inputRows-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	public void generatePattern8(int inputRows) {
		for(int i=1; i<=inputRows; i++) {
			for(int j = inputRows-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("@");
			}
			System.out.print("\n");
		}
	}
	public void generatePattern9(int inputRows) {
		int n = inputRows;
		int count = 1;
        int no_of_spaces = 1;
        int start = 0;
		for (int i = 1; i < (n * 2); i++) 
        {

            for (int spc = n - no_of_spaces; spc > 0; spc--) 
            {
                System.out.print(" ");
            }
            if (i < n) 
            {
                start = i;          //for number
                no_of_spaces++;    //for spaces
            } else 
            {
                start = n * 2 - i;   //for number
                no_of_spaces--;      //for space
            }
            for (int j = 0; j < count; j++) 
            {
                System.out.print(start);
                if (j < count / 2) 
                {
                    start--;
                } else 
                {
                    start++;
                }
            }
            if (i < n)
            {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }
	}
	
	public void generatePattern10(int inputRows) {
		int n = inputRows;
		int count = 1;
        int count2 = 1;
        char c = 'A';
        for (int i = 1; i < (n * 2); i++) 
        {
            for (int spc = n - count2; spc > 0; spc--)   
            //print space
            {
                System.out.print(" ");
            }
            if (i < n) 
            {
                count2++;
            } 
            else 
            {
                count2--;
            }
            for (int j = 0; j < count; j++) 
            {
                System.out.print(c);//print Character
                if (j < count / 2) 
                {
                    c++;
                } else 
                {
                    c--;
                }
            }
            if (i < n)
            {
                count = count + 2;
            } 
            else
            {
                count = count - 2;
            }
            c = 'A';

            System.out.println();
        }
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows to generate: ");
		int userInputRows = sc.nextInt();
		Pattern1 obj = new Pattern1();
		//obj.generatePattern(userInputRows);
		//obj.generatePattern2(userInputRows);
		//obj.generatePattern3(userInputRows);
		//obj.generatePattern4(userInputRows);
		//obj.generatePattern5(userInputRows);
		//obj.generatePascalTriangle(userInputRows);
		//obj.generatePattern7(userInputRows);
		//obj.generatePattern8(userInputRows);
		//obj.generatePattern9(userInputRows);
		obj.generatePattern10(userInputRows);
		sc.close();
	}

}
