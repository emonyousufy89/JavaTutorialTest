package Encapsulation;

public class Employees {

	private String name;
	private int age;
	private int salary;
	private String add;
	private Department DPT;
	private Students STD;
	
	public Department getDPT() {
		return DPT;
	}
	public void setDPT(Department dPT) {
		DPT = dPT;
	}
	public Students getSTD() {
		return STD;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	
	public int getSalary() {
		return salary;
	}
	
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public Employees(String NM, int AGE, int SAL, String ADD, Department DN, Students std ){
		
		this.name = NM;
		this.age = AGE;
		this.age=SAL;
		this.add= ADD;
		this.DPT=DN;
		this.STD=std;
	}
	
	
}
