package Stingclass;

public class Intanagram {

	public static void main(String[] args) {

		String name1="abcd";
		String name2="DCBA";

		if(name1.length() == name2.length()) {

			name1=name1.toUpperCase();
			name2=name2.toUpperCase();

			name1.equals(name2);

			System.out.println("is anagram");
		}
		else {
			System.out.println("no anagram");
		}

	}

}
