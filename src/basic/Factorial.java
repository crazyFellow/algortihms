package basic;

import java.util.Optional;
import java.util.OptionalLong;
import java.util.Scanner;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Factorial {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		System.out.println("Using recursion : "+factorial(x));
		System.out.println("Using Stream : "+factorialStreamVersion(x));
		System.out.println("Using LongStream : "+factorialLongStreamVersion(x));
		s.close();
	}
	
	public static long factorial(long x) {
		if(x==1) {
			return 1;
		} else {
			return x*factorial(x-1);
		}
	}
	
	public static long factorialStreamVersion(long x) {
		Optional<Long> optional= Stream.iterate(1L, n->n+1).limit(x).reduce((n1,n2) -> n1*n2);
		return optional.isPresent()?optional.get():0;
	}
	
	public static long factorialLongStreamVersion(long x) {
		OptionalLong optional= LongStream.rangeClosed(1L, x).reduce((n1,n2)->n1*n2);
		return optional.isPresent()?optional.getAsLong():0;
	}

}
