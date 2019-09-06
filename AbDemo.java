package NewPackage;

public class AbDemo {
	public static void main(String args[]) {
		Iphone obj = new Iphone();
		Samsung obj1= new Samsung();
		show(obj);
	}
	public static void show(Phone obj)
	{
		public abstract void showConfig();
	}

}

abstract class Phone{
	public void showConfig();
	
	
}

class Iphone extends Phone
{
	public void showConfig() {
		System.out.println("2 GB, 1005, 9.5");
	}
}

class Samsung extends Phone
{
	pu
}