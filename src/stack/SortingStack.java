package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SortingStack {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print(" How many numbers do you want to add to the stack? ");
		int count = s.nextInt();
		s.nextLine();
		Deque<Integer> stack = new ArrayDeque<>();
		for (int counter = 0; counter < count; counter++) {
			stack.push(s.nextInt());
			s.nextLine();
		}

		System.out.println("Before : " + stack);
		stack = sort(stack);
		System.out.println("After : " + stack);

		s.close();

	}

	public static Deque<Integer> sort(Deque<Integer> stack) {
		Deque<Integer> tempStack = new ArrayDeque<Integer>();
		while (!stack.isEmpty()) {
			int temp = stack.pop();
			while (!tempStack.isEmpty() && tempStack.peek() > temp) {
				stack.push(tempStack.pop());
			}
			tempStack.push(temp);
		}
		return tempStack;
	}

}
