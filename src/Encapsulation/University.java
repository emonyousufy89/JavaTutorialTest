package Encapsulation;

public class University {

	
	
	
	
	public static void main(String[] args) {
		Department D = new Department("Math", 508);
		Students S = new Students("Sarah", 2000);
		Employees emp = new Employees("John", 45, 7000, "LA", D, S);
		
		University un = new University();
		
		System.out.println("this is the data : +" + emp.getAdd()+"   " +emp.getAge()+"  "+emp.getDPT().getDeptID()+"   "+emp.getSalary()+"   "+emp.getSTD().getID()+"   "+emp.getDPT().getDeptName()+"  "+ emp.getName());
		
	
	
		
	}

}
