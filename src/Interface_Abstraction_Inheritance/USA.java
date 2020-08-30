package Interface_Abstraction_Inheritance;

public class USA {
	
	public static final int salary = 90909;

	public static void main(String[] args) {
		
		NY ny = new NY();
		ny.States();
		NJ nj = new NJ();
		nj.capital();
		MA ma = new MA();
		ma.capital();
		ma.States();

	}

}
