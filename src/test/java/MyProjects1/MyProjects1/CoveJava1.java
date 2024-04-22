package MyProjects1.MyProjects1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoveJava1 {

	public static void main(String[] args) 
	{
		// If Else Condition
		
		int[] arr2= {1,2,3,4,5,6,7,8,9,10};
		
		//Check array for multiple of 2
		
		for(int i=0; i<arr2.length; i++)
		{
			if(arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
			
			}
			else
			{
				System.out.println(arr2[i]+"is not mulitple of 2");
			}
		}
		
		//ArrayList- Use When the value is not Fixed [we have to create the object]
		
		ArrayList<String> Name=new ArrayList();
		Name.add("Akaash");
		Name.add("Zade");
		Name.add("Selenium");
		
		System.out.println(Name.get(2));
		//System.out.println(Name.remove(0)+ "String is Removed");
		
		for(int i=0; i< Name.size(); i++)
		{
			System.out.println(i);
		}
		
		for(String s:Name)
		{
			System.out.println(s);
		}
		
		//Item present in ArrayList
		System.out.println(Name.contains("Zade"));
		
		//How to Convert Array into ArrayList
		String[] name2= {"suraj","Adhavik","Swetal"};
		
		List<String> Arraylist=Arrays.asList(name2); //List is superclass of ArrayList ,convert to Arraylist
	    
		System.out.println(Arraylist);
		System.out.println(Arraylist.contains("Adhavik"));
		System.out.println(Arraylist.get(2));

		
		
		
		
		
		

	}

}
