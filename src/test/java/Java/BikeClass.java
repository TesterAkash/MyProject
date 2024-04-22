package Java;

public abstract class BikeClass {

	//Contractor
	
	BikeClass (){
		System.out.println("BikeClass implemented...");
	}
	
	//Create abstract method 
	abstract void run(); //only method declear no method body
	
	//create non abstract method 
	 public void start() {
		System.out.println("non-abstract method implimented");
	}
	 
	 public static void stop() {
		System.out.println("non-abstract method implimented");
	}
	 public final void Engine() {
		System.out.println("bike engine can't be change");//final method can't be implemented in child class
	}
}

