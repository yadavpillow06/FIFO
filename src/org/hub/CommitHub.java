package org.hub;

public class CommitHub {

	public static void main(String[] args) {
		int result = replaceZeroes(500);
		System.out.println(result);
	}

	public static int replaceZeroes(int num) {
		int result = 0;
		int multiplier = 1;
		while (num != 0) {
			int rem = num % 10;
			if (rem != 0) {
				result += rem * multiplier;
				multiplier *= 10;
			}
			num /= 10;
		}
		return result;
	}
}