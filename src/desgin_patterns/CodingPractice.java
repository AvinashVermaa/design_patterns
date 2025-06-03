package desgin_patterns;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class CodingPractice {

	// Remove Duplicate Chars from String
	public static void main(String[] args) {
		// removeDuplicateChars();
		// reverseStringWords();
		// openTextProgram();
		// longestLengthOfSubString();
		// sortTheString();
		// goToJohoProgram();
		// checkVowelAndConstants();
		//reverseNumber();
		//swapNumberInArray();
		//moveZeroToRightSide();
		moveZeroToLeftSide();
	}
	
	public static void moveZeroToLeftSide() {
		int[] arr = {1,23,5,7,9,0,23,34,0,42,12};
		System.out.println("Before Moving : "+Arrays.toString(arr));
		
		int j = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		System.out.println("After Moving : "+Arrays.toString(arr));
	}
	
	public static void moveZeroToRightSide() {
		int[] arr = {1,23,5,7,9,0,23,34,0,42,12};
		
		System.out.println("Before Moving : "+Arrays.toString(arr));
		
		int j = 0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		System.out.println("After Moving : "+Arrays.toString(arr));
	}
	
	public static void swapNumberInArray() {
		int[] arr = {1,-3,4,-88,2,85};
		System.out.println("Before Swapping : "+Arrays.toString(arr));
		int n = arr.length-1;
		
		for(int i=0;i<n/2;i++) {
			arr[i] = arr[i] + arr[n-i];
			arr[n-i] = arr[i] - arr[n-i];
			arr[i] = arr[i] - arr[n-i];
		}
		
		System.out.println("After Swapping : "+Arrays.toString(arr));
		
	}

	private static void reverseNumber() {
		int number = 4321;
		int temp = 0;
		int rev = 0;
		temp = number;

		System.out.println("Before Reverse : " + number);

		while (temp != 0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}

		System.out.println("After Reverse : " + rev);
	}

	private static void checkVowelAndConstants() {
		String str = "Chak De! India";
		int vowelCount = 0;
		int constantsCount = 0;

		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ' && (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u')) {
				vowelCount++;
			} else {
				constantsCount++;
			}
		}

		System.out.println("Vowel Count : " + vowelCount);
		System.out.println("Constants Count : " + constantsCount);
	}

	private static void goToJohoProgram() {
		String str = "Go to Joho";
		char charToReplace = '$';
		StringBuilder sb = new StringBuilder();
		int count = 1;

		System.out.println("Before : " + str);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'o' && str.charAt(i) != ' ') {
				for (int j = 1; j <= count; j++) {
					sb.append(charToReplace);
				}
				count++;
			} else {
				sb.append(str.charAt(i));
			}
		}

		System.out.println("After : " + sb);
	}

	private static void sortTheString() {
		String str = "rock";
		char temp;

		char[] ch = str.toCharArray();

		System.out.println("Before : " + new String(ch));

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}

		System.out.println("After : " + new String(ch));

	}

	private static void longestLengthOfSubString() {
		String str = "abcbcabs";
		String longestSubString = "";
		int count = 0;

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, i);
			} else {
				i = map.get(c);
				map.clear();
			}
		}

		if (map.size() > count) {
			count = map.size();
		}

		longestSubString = map.keySet().toString();

		System.out.println("Length : " + count);
		System.out.println("Longest SubString : " + longestSubString);
	}

	// output -> open1ex2 ->replace t with increase order number format:
	private static void openTextProgram() {
		String str = "opentextexit";
		char charToReplace = 't';

		if (str.indexOf(charToReplace) == -1) {
			System.out.println("Character was not present : " + charToReplace);
			System.exit(0);
		}

		System.out.println("Before : " + str);

		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == charToReplace) {
				str = str.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
				count++;
			}
		}

		System.out.println("After : " + str);
	}

	private static void reverseStringWords() {
		String str = "Avinash Verma Noida Delhi";

		String[] arr1 = str.split(" ");

		String output = "";

		System.out.println("Before : " + str);

		for (int i = arr1.length - 1; i >= 0; i--) {
			String s1 = arr1[i];
			String reverseWord = "";
			for (int j = s1.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + s1.charAt(j);
			}
			output = output + reverseWord + " ";
		}

		System.out.println("After : " + output);
	}

	private static void removeDuplicateChars() {
		String str = "avinash";
		System.out.println("Before Operation : " + str);

		StringBuilder sb = new StringBuilder();

		str.chars().distinct().forEach(c -> sb.append((char) c));

		System.out.println("After Operation : " + sb.toString());
	}
}
