package Stingclass;

public class ImmutabilityTest {

	public static void main(String[] args) {
		
		Immutableclass obj = new Immutableclass("vaibhav", 0034);
		
		System.out.println(obj);
		
		// getting value from customized immutable class
		System.out.println(obj.getName() + " " + obj.getId() + " ");	
																		
	}

}
