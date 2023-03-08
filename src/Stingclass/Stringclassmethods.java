package Stingclass;

public class Stringclassmethods {

	public static void main(String[] args) {
		
		char [] data = {'h','e','l','l','o'};
		
		String s = "hello";
		
		String s3 = new String(data);
		
		System.out.println(s.equals(s3));
		
		System.out.println(s==(s3));	
		
		
		String m1 = new String ("helloworld");
		String m2 = "hello";
		String m3 = "world";
		String m5 = "helloworld";
		String m6 = "hello" + "world";
		
		String m4 = m2.concat(m3);		// concatination
				
		System.out.println(m5==m6); // reference equality
		
		System.out.println(m1.equals(m6)); // content checking
		
		System.out.println(m2.hashCode()); // to check hashcode
		
		
		
		
		

	}

}
