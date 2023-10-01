package LeetCode;

public class ReverseWord {

	public static String reverseWords(String s) {
		String[] words = s.split(" ");
		String revString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord = revWord + word.charAt(j);
			}
			revString = revString + revWord; // Concatenate reversed word
			if (i < words.length - 1) {
				revString = revString + " "; // Add space between words
			}
		}
		return revString;
	}

	public static void main(String[] args) {
		String str = "Let's take LeetCode contest";
		System.out.println(reverseWords(str));
	}
}
