package recursion;

import java.util.Scanner;

/*
 * If there are 3 pegs and n-disks then it takes ((2^n)-1) steps to move the disks from 
 * source to target. Algorithm is as follows:
 * 1)Move the top n – 1 disks from Source to Auxiliary tower.
 * 2)Move the nth disk from Source to Destination tower.
 * 3)Move the n – 1 disks from Auxiliary tower to Destination tower.
 * 4)Transferring the top n – 1 disks from Source to Auxiliary tower can again be thought
 *   of as a fresh problem and can be solved in the same manner. Once we solve Towers
 *   of Hanoi with three disks, we can solve it with any number of disks with the above
 *   algorithm.
 */
public class TowerOfHanoi {
	
	private static long counter = 0;

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		char fPeg = 'A';
		char aPeg = 'B';
		char tPeg = 'C';
		System.out.println(towersOfHanoi(x, fPeg, aPeg, tPeg));
		s.close();
	}
	
	public static long towersOfHanoi(long x, char fPeg, char aPeg, char tPeg) {
		if(x==1) {
			System.out.println("Moving from peg "+fPeg+" to peg "+tPeg);
			return ++counter;
		}
		towersOfHanoi(--x, fPeg, tPeg, aPeg);
		System.out.println("Moving from peg "+fPeg+" to peg "+tPeg);
		++counter;
		towersOfHanoi(x, aPeg, fPeg, tPeg);
		return counter;
	}
}
