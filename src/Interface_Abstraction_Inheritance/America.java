package Interface_Abstraction_Inheritance;
public interface America {	
	// interface has only abstract method
	// you can not instantiate interface 
	// you can not make an object of an interface	// all methods and variables are abstract final and static
	String Health = "hospital";
	int zip = 12300;	
	void States();  // abstract methods do not have any body
}
abstract class WashingtonDc{
// abstract class can have both concrete/regular and abstract method	
	String money = "dollar";
	int salary = 6000;
	abstract void  capital();
	void WW() {
		System.out.println("this is presidents office");
	}	
}
class NY implements America{
	
	@Override
	public void States() {
		System.out.println(Health);		}
}
class NJ extends WashingtonDc{
	
	@Override
	void capital() {
		System.out.println(money);}
}
class MA extends WashingtonDc implements America{
	
	@Override
	public void States() {
	System.out.println(zip);	
	}
	@Override
	void capital() {
		System.out.println(salary);	
	
	}
}

