package Stingclass;

public final class Immutableclass {			// make final

	private final String name;		// make final and private for not change value and scope fix.
		 private final int id;		
	 
	public Immutableclass(String name, int id) {
		super();								
		this.name = name;		// constructor for assigning value passing parameter. 
		this.id = id;
	}

	public String getName() {	// only getting values .
		return name;
	}

	public int getId() {
		return id;
	}
	
	@Override						// toString for printing value of objects
	public String toString() {			
		return "Immutableclass [name=" + name + ", id=" + id + "]";
	}
	
	

}
