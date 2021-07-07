package ExercisesPackage;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// && = and
		// || = or

		int a = 2;

		if (a == 2 && a > 0) {
			System.out.println("a is 2");
		} else if (a == 3 || a < -1) {
			System.out.println("a is 3");
		} else {
			System.out.println("a is 4");
		}
	}
}
