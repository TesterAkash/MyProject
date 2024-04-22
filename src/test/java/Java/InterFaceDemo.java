package Java;

//create interface
interface showdetails{
	
	public void showInfo(String Name,int age);
}

  //create class for implementation
public class InterFaceDemo implements showdetails {

	//create the interface method implemention
	public void showInfo(String Name, int age) {
		// TODO Auto-generated method stub
		
		System.out.println("name is :" + Name);
		System.out.println("age is :"+ age);
		
	}
   public static void main(String[] args) {
		
	   InterFaceDemo obj=new InterFaceDemo();
	   obj.showInfo("Akash", 28);
	}

	
}
