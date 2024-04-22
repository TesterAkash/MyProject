package Java;

//implementing ShowName interface 
public class EmpInfo implements ShowName, showDept {

	//implementing showName interface method
	

	@Override
	public void Name(String username) {
		System.out.println("Username is :"+ username);
		
	}

	@Override
	public void dept(String deptname, int id) {
		// TODO Auto-generated method stub
		System.out.println("Dept is :"+deptname);
		System.out.println("Dept is ID :"+id);
	}


}
