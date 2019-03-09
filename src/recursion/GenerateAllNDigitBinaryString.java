package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class GenerateAllNDigitBinaryString {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		long[] arr = new long[x];
		generateAllNDigitBinaryString(arr, x);
		s.close();
	}
	
	public static void generateAllNDigitBinaryString(long[] arr, int index) {
		if(index<=0) {
			System.out.println(Arrays.toString(arr));
		} else {
			arr[index-1] = 0;
			generateAllNDigitBinaryString(arr, index-1);
			arr[index-1] = 1;
			generateAllNDigitBinaryString(arr, index-1);
		}
	}

}
