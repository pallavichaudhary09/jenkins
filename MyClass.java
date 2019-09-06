package NewPackage;

import java.util.Scanner;

public class MyClass {

		public static void main(String[] args) {
			MyClass m=new MyClass();
			// TODO Auto-generated method stub
			Animal a=new Dog(1,100,"Dog-A");
			m.startGame(a);
		}
		public void startGame(Animal a) {
			System.out.println(a.move());
		}

	}  
 
