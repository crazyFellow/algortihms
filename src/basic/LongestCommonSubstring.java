package basic;

import java.util.Scanner;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first string : ");
		String str1 = s.nextLine();
		System.out.print("Enter second string : ");
		String str2 = s.nextLine();

		if (str1.equals(str2)) {
			System.out.println("Length of longest common substring : " + str1.length());
			System.out.println("Longest common substring : " + str1);
		}

		String s1, s2;
		if (str1.length() > str2.length()) {
			s1 = str1;
			s2 = str2;
		} else {
			s1 = str2;
			s2 = str1;
		}
		int sLen = s2.length();
		int maxLen = 0;
		String maxSubstring = "";
		for (int counter = 1; counter <= sLen; counter++) {
			int count = 0;
			int pos = 0;
			StringBuilder temp = new StringBuilder();
			while ((pos + counter - 1) < sLen) {
				temp = new StringBuilder();
				count = 0;
				while (count < counter) {
					temp.append(s2.charAt(pos));
					pos++;
					count++;
				}
				pos -= counter - 1;
				if(s1.contains(temp.toString())) {
					if(maxLen < temp.length()) {
						maxLen = temp.length();
						maxSubstring = temp.toString();
					}
				}
			}
		}
		
		System.out.println("Length of longest common substring : " + maxLen);
		System.out.println("Longest common substring : " + maxSubstring);
		s.close();
	}

}
