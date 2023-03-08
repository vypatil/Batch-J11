package Stingclass;

public class Reversestring {

	public static void main(String[] args) {
		String state = "India";

		System.out.println(reverse(state));
		System.out.println(reverse2(state));
		System.out.println(reverse3(state));
	}

	public static String reverse (String state) {	// using StringBuffer object.	1.

		StringBuffer sb = new StringBuffer(state);

		return new String(sb.reverse());
	}

	public static String reverse2 (String state) {	// using stringbuilder append method  2.

		StringBuilder obj = new StringBuilder();

		for (int i=0 ; i<state.length(); i++) {

			obj = obj.append(state.charAt(i));

		}
		return new String(obj.reverse());
	}

	public static String reverse3 (String state) {	// using characters array. 3.

		char [] arr = state.toCharArray();

		char[] result = new char[arr.length];

		int j=0;

		for(int i=arr.length -1 ; i>=0 ; i--) { 

			result[j]=arr[i];
			j++;
		} 
		return new String (result);
	}
}

