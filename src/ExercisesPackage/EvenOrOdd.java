package ExercisesPackage;

import java.util.Random;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int randomnum = 1 + rand.nextInt(10);

		if (randomnum % 2 == 0) {
			System.out.println(randomnum + " is even");
		} else {
			System.out.println(randomnum + " is odd");
		}

	}

}
