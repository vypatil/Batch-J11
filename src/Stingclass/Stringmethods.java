package Stingclass;

import java.util.Arrays;

public class Stringmethods {

	public static void main(String[] args) {

		String name = "java is the best language ";
		String name2 = "vaibhav patil";

		System.out.println(name.startsWith("j"));	

		System.out.println(name.endsWith("language"));	

		System.out.println(name2.isEmpty());

		System.out.println(name2.toUpperCase());

		char [] arr = name.toCharArray();
		//System.out.println(Arrays.toString(arr));
		
//		for (int i=0 ; i<arr.length ; i++) {
//			System.out.println(arr[i]);}
			
		for (char abc : arr ) {
			System.out.println(abc);
		}
		
		System.out.println(name.substring(5));
		System.out.println(name.substring(5,16));
		
		System.out.println(name.contains("best"));
		
		}
	}


