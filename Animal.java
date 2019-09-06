package NewPackage;

public class Animal {
private int weight,legs;

	public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public int getLegs() {
	return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
		public Animal() {
			
			// TODO Auto-generated constructor stub
		}
	    public Animal(int weight,int legs) {
	    	
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
		}
		public String move() {
			String msg;
			if(weight>100)
				msg="Slow";
			else
			msg="Fast";
			return msg;
		}

	} 
			
}