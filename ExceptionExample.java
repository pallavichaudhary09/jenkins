package NewPackage;
import java.io.PrintWriter;

public class ExceptionExample {
	public static void main(String args[]) {
		String str=null;
		System.out.println("A");
		str.concat("adds");
		
		try {
		
			PrintWriter pw= new PrintWriter();
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("");}  
		
		   System.out.println("Cannot divide by zero");  
		  }  
		 
	}
	



