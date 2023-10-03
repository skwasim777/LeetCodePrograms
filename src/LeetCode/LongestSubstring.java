package LeetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
		String longestSubstring = null;
		int longestsubstringlength = 0;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}
			if (map.size()>longestsubstringlength) {
				longestsubstringlength = map.size();
				longestSubstring = map.keySet().toString();
			}
		}
		return longestsubstringlength;
	}
	public static void main(String[] args) {
		String s = "abcbabc";
		System.out.println(lengthOfLongestSubstring(s));
		System.out.println();
	}
}
