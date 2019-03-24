package dynamicprogramming;

import java.util.Scanner;

public class LongestCommonSubstring {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter first string : ");
		String s1 = s.nextLine();
		System.out.print("Enter second string : ");
		String s2 = s.nextLine();
		int m = s1.length();
		int n = s2.length();

		int[][] arr = new int[m + 1][n + 1];
		int maxLen = 0;
		int endingIndex = 0;
		for (int p = 1; p <= m; p++) {
			for (int q = 1; q <= n; q++) {
				if (s1.charAt(p - 1) == s2.charAt(q - 1)) {
					arr[p][q] = arr[p - 1][q - 1] + 1;

					if (maxLen < arr[p][q]) {
						maxLen = arr[p][q];
						endingIndex = p;
					}
				}
			}
		}
		System.out.println("Length of longest common substring : " + maxLen);
		System.out.println("Longest common substring : " + s1.substring(endingIndex - maxLen, endingIndex));
		s.close();
	}

}
