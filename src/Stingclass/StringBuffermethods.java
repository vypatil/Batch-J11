package Stingclass;

public class StringBuffermethods {

	public static void main(String[] args) {
		
//		String name = new String("maharashtra");
//		
//		StringBuffer country = new StringBuffer("India");
//		String mod = new String(country);	// converting SB into String
//		
//				
//		System.out.println(name.equals(country));
//		System.out.println(name==mod);
//		System.out.println(name.equals(mod));
//		System.out.println(mod);
		
		StringBuffer car = new StringBuffer("Lamborghini");
		StringBuffer emptycar = new StringBuffer("");
		
		System.out.println(emptycar.capacity());	// default capacity of SB
		System.out.println(car.capacity());
		
		System.out.println(car.append("fastest"));	// appending the stringbuffer
		
		System.out.println(car.replace(10, 17,"loved")); // replace with new sb
		
		System.out.println(car.deleteCharAt(10));	// delete specific index
		
		System.out.println(car.reverse()); // reversing 
		
	}

}
