package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class GenerateAllNDigitStringsUsingKElements {

	public static void main(String[] args) {
		System.out.print("Enter a number of elements: ");
		Scanner s = new Scanner(System.in);
		int numberOfElements = s.nextInt();
		int[] elements = new int[numberOfElements];
		for(int i=0; i<numberOfElements; i++) {
			System.out.print("Enter an elements: ");
			elements[i] =  s.nextInt();
		}
		int lengthOfString = s.nextInt();
		long[] arr = new long[lengthOfString];
		generateAllNDigitStringsUsingKElements(elements, arr, lengthOfString);
		s.close();
	}
	
	public static void generateAllNDigitStringsUsingKElements(int[] elements, long[] arr, int index) {
		if(index<=0) {
			System.out.println(Arrays.toString(arr));
		} else {
			for(int i=0; i<elements.length; i++) {
				arr[index-1] = elements[i];
				generateAllNDigitStringsUsingKElements(elements, arr, index-1);
			}
		}
	}

}
