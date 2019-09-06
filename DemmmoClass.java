package NewPackage;

public class DemmmoClass {
	public static void main(String args[]) {
		NewNewPhone obj= new NewNewPhone();
		obj.call();
		obj.move();
		obj.dance();
		obj.cook();
		
	}
}		
	
	abstract class NewPhone{
		public void call() {
			System.out.println("Calliing....");
		}
		public abstract void move();
		public abstract void dance();
		public abstract void cook();
	}
	
	abstract class BrandNewPhone extends NewPhone
	{
		public void move() {
			System.out.println("Moving....");
		}
	}
	
	class NewNewPhone extends BrandNewPhone{
		public void dance() {
			System.out.println("Dancing/...");
		}
		
		public void cook() {
			System.out.println("Cooking...");
		}
	}
	
	
