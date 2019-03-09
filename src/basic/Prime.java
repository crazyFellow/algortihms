package basic;

import java.util.Scanner;
import java.util.function.LongPredicate;
import java.util.stream.LongStream;

public class Prime {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		if (isPrime(x)) {
			System.out.println(x + " is Prime.");
		} else {
			System.out.println(x + " is not Prime.");
		}
		if (isPrimeStreamVersion(x)) {
			System.out.println(x + " is Prime(Stream Version).");
		} else {
			System.out.println(x + " is not Prime(Stream Version).");
		}
		s.close();
	}

	public static boolean isPrime(long x) {
		if (x <= 1) {
			return false;
		} else if (x == 2 || x == 3) {
			return true;
		} else {
			long y = (long) Math.sqrt(x) + 1L;
			for (long i = 2; i <= y; i++) {
				if (x % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isPrimeStreamVersion(long x) {
		if (x <= 1) {
			return false;
		} else if (x == 2 || x == 3) {
			return true;
		} else {
			LongPredicate isDivisible = i -> x % i == 0;
			return !(LongStream.rangeClosed(2L, (long) (Math.sqrt(x) + 1)).anyMatch(isDivisible));
		}
	}
}
