package ExercisesPackage;

class Dogg{
	
	String type;
	int weight;
	int height;
	
	
	Dogg(){
	this.type = "unknown";
	this.weight = 0;
	this.height = 0;	
	}
	
	void display() {
	System.out.println("Type: " + type);
	System.out.println("Weight: " + weight);
	System.out.println("Height: " + height);
	}
	
}
public class DogExConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	Dogg d = new Dogg();
	
	d.display();
	
	}

}
