package NewPackage;


public class Dog extends Animal {
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
Dog(int weight,int legs, String name){
	super(weight,legs);
	this.name=name;
}

public String move() {
	return "Dog Called";
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	} 
