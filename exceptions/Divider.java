package exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Divider {
	private static Scanner scanner = new Scanner(System.in);

	private static int getIntegerOperand() {
		while (true) {
			try {
				System.out.println("Introdu o valoare intreaga:");
				return scanner.nextInt();
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.out.println("Nu ai introdus o valoare intreaga. Te rog sa reincerci.");
			} catch (NoSuchElementException e) {
				System.out.println("INPUT was closed and cannot be reopened! Abort...");
				return 0;
			}
		}
	}

	private static int division2(int dividend, int divisor) {
		try {
			return dividend / divisor;
		} catch (ArithmeticException e) {
			System.out.println("One should not divide by 0!");
			return 0;
		}
	}

	private static int division(int dividend, int divisor) throws ArithmeticException {
		if (divisor == 0) {
			throw new ArithmeticException("'divisor' cannot be 0!");
		}
		return dividend / divisor;
	}

	public static void main(String[] args) {
		
		int dividend = getIntegerOperand();
	    while (true) {
	      try {
	        int divisor = getIntegerOperand();
	        int result = division(dividend, divisor);
	        System.out.println("Rezultatul este: " + result);
	        break;
	      } catch (ArithmeticException e) {
	        System.out.println("Nu se poate realiza impartirea la 0...");
	        System.out.println("Introdu iar impartitorul");
	      }
	    }
	  }
	
}
