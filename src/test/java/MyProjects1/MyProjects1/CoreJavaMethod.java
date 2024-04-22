package MyProjects1.MyProjects1;

public class CoreJavaMethod {

	public static void main(String[] args) 
	{
		//now call the below method by creating the object of the class 
		
		CoreJavaMethod d=new CoreJavaMethod();
		d.getdata();
		
		//String
		String name=d.gets();
		System.out.println(name);
		
		//Static keyword
		d.cone();
		
		//Access the method from another class
		
		DemocorejavaMethod d3=new DemocorejavaMethod();
		d3.name2();
		

	}
	
	//Lets Create the method- Method is always outside the class
	
	public void getdata() 
	{
	
		System.out.println("hello Akash welcome to Selenium");
	}
	
	//if method have return type
	
	public String gets() 
	{
	  System.out.println("You can do it Akash");
	  return "yes i can do it";
	}
	
	//if the method is present on own class than we can do without create the object of class we can access the method using Static key word-static keyword move to method to class level
	
	public static String cone() 
	{
		System.out.println("if the method is present on own class than we can do without create the object of class we can access the method using Static key word-static keyword move to method to class level");
	    return "yes we can";
	}

}
