package LeetCode;

public class RverseWord {
	public static int reverse(int x) {
		int reversed = 0;
		while (x != 0) {
			int digit = x % 10;

			if(reversed>Integer.MAX_VALUE/10 || reversed<Integer.MIN_VALUE/10) {
				return 0;
			}

			reversed = reversed * 10 + digit;
			x /= 10;
		}
		return reversed;
	}

	public static void main(String[] args) {
		int x1 = -1230;
		System.out.println("Input: " + x1);
		System.out.println("Output: " + reverse(x1));

		
	}
}
