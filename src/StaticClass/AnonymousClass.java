package StaticClass;
class j
{
	public void method()
	{
		System.out.println("this is parent");
	}
}

	
public class AnonymousClass 
{
	public static void main(String[] args) 
	{
		 j obj = new j() 
		 {
			 public void method() 
			 {
					System.out.println("This is child");
				}
 
		 };
		obj.method();
	}

}
