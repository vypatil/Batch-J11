package Stingclass;

public class Stringpalindrom {

	public static void main(String[] args) {

		String name = "madam";
		System.out.println(ispalindrom(name));
	}

	public static boolean ispalindrom (String name) {

		String s = "";
		for (int i=name.length()-1 ; i>=0 ; i--) {

			s=s+name.charAt(i);
		}
		if (s.equalsIgnoreCase(name)) {
			return true;

		} else {
			return false;
		}

	}
}

