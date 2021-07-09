package ExercisesPackage;

class President{
	
	int population;
	long gdp;
	String name_country;
	
	void meetPresident() {
		System.out.println("I am going to meet the President");
	}
	
}

public class PresidentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		President ps = new President();
		
		ps.population = 330000000;
		ps.gdp = 3000000;
		ps.name_country = "America";
		
		System.out.println(ps.population);
		System.out.println(ps.gdp);
		System.out.println(ps.name_country);
		
		ps.meetPresident();
		
	}

}
