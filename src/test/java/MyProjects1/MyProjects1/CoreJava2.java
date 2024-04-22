package MyProjects1.MyProjects1;

public class CoreJava2 {

	public static void main(String[] args) 
	{
		// String in JAVA- String is an object that represent the sequence of character.
		//there are to type way to declear the String
		//String Literal and String Object 
		
		//String Literal- If we have the same value , it won't create the new object , the value will be stored in existing object
		//String Object-  No matter the value is same it will create the new object. by using the "new" keyword.
		
		//String Literal
		String s="Akash";
		String s1="Akash";
		
		
		//String Object new keyword
		
		String s2=new String("Welcome");
		String s3=new String("Welcome");
		
		//Break the String using the Slpit
		
		String s4= "Selenium Java Core";
		String[] slpit=s4.split(" ");
		
		System.out.println(slpit[0]);
		System.out.println(slpit[1]);
		System.out.println(slpit[2]);
		
		//Slpit one String
		
		String[]oneslpit=s4.split("Java");
	    System.out.println(oneslpit[0]);
	    System.out.println(oneslpit[1]);
	    
	    //I want to trime that space
	    System.out.println(oneslpit[1].trim());
	    
	    //Character by Character Prints
	    for(int i=0; i<s4.length(); i++)
	    {
	    	System.out.println(s4.charAt(i));
	    	
	     	
	    }
	    
	    //how to reverse the String
	    
	    for(int i=s4.length()-1;i>=0; i--)
	    {
	    	System.out.println(s4.charAt(i));
	    }
	    
	    //Example
	    String d1="Best way to learn the Selenium";
	    for(int i=d1.length()-1;i>=0;i--)
	    {
	    	System.out.println(d1.charAt(i));
	    }
	    
	     
	    
	    
	    

	}

}
