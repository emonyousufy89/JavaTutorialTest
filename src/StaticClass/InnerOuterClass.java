package StaticClass;
class a{
	int a=5;	
	public void method() {
		System.out.println("this is outer class");
	}	
	class b{
		public void method1() {
			System.out.println("this is inner class");
		}
	}
	static class c{
		public String method2(String h) {
			System.out.println("this is another inner class");
			return h;
		}
	}
}
public class InnerOuterClass {
	public static void main(String[] args) {
	a ob = new a();
	ob.method();
	a.b obj = ob.new b();
	obj.method1();
	
	a.c j= new a.c();
	System.out.println(j.method2("emon"));

	}

}
// Can you use static keyword in class level?