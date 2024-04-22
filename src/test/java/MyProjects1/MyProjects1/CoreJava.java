package MyProjects1.MyProjects1;

public class CoreJava {

	public static void main(String[] args) 
	{
		// Variable and Data Type
		int mynum=5;
		String name="Akash";
		char Sex='M';
		double dec=2.20;
		boolean mycard=true;
		
		
		System.out.println(mynum+ "is the value is store in the mynum varibale");
		System.out.println(name);
		
		//working with Arrays- we can store the multiple value in one single variable
		
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		//Simple short cut
		int[] arr2= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(arr2);
		
		//How to print the value present in Arrays
		//For Loop
		//arr
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(i);
		}
		
		//arr2
		
		for(int i=0; i<arr2.length; i++)
		{
			System.out.println(i);
		}
		
		//String
		String[] name1= {"Akash","Zade","Selenium"};
		
		for(int i=0; i<name1.length; i++)
		{
			System.out.println(i); 
	
		}
		
		//Enhance Syntax of For Loop
		
		for(String s:name1)
		{
			System.out.println(s);
		}
		
		//int
		
		for(int num:arr2)
		{
			System.out.println(num);
		
		}
		
		
		
		
		
		
		
		
		
		
			
		
		

	}

}
