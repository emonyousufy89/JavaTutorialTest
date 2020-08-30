package Interface_Abstraction_Inheritance;

class A{
	void method() {
		System.out.println(" this is parent class");	
	}
}
class B extends A{

	void method() {

		System.out.println(" this is child class");
		super.method();
		//this.method();
	}

}
public class MethodOverriding extends B  {

	public static void main(String[] args) {

		MethodOverriding mo = new MethodOverriding();
		mo.method();
		
		
	}
}

