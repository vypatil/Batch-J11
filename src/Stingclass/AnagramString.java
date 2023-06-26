package Stingclass;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String str1 = "care";
		String str2 = "Race";

		isanagram(str1, str2);
	}
	
	public static void isanagram (String abc , String xyz){

		abc=abc.toUpperCase();
		xyz=xyz.toUpperCase();

		if (abc.length() == xyz.length()) {

			char [] arr1 = abc.toCharArray();
			char [] arr2 = xyz.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			boolean result = Arrays.equals(arr1,arr2);

			System.out.println(abc + " + " + xyz + " ----> is a anagram");
			
		}
		else {
			System.out.println(abc + " + " + xyz + " ----> are not a anagram");
		}

	}

}
