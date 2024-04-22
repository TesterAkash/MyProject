package Java;

public class TestAbstraction {

	public static void main(String[] args) {
		
		BikeClass obj =new Honda(); 
		obj.start();//non abstract method 
		obj.run(); //abstract method
		BikeClass.stop();//non abstract method //static method we can call with class name

		BikeClass obj2 =new hero(); 
		obj2.start();//non abstract method 
		obj2.run(); //abstract method
		BikeClass.stop();//non abstract method //static method we can call with class name
		
		BikeClass obj3 =new bajaj(); 
		obj3.start();//non abstract method 
		obj3.run(); //abstract method
		BikeClass.stop();//non abstract method //static method we can call with class name
		
		
	}

}
