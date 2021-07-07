package ExercisesPackage;
import java.util.Scanner;
import java.util.Random;
public class KindOfDayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random(10);
		int randomnumber = 1 + rand.nextInt(10);
		
		Scanner sc = new Scanner(System.in);
		
		
		if(randomnumber <= 3 ) {
			System.out.println("You will have a bad day, stay safe you got a" + randomnumber);
		}
		else if(randomnumber <= 7) {
			System.out.println("You will have a ok day, keep working you got a" + randomnumber);
		}
		else {
			System.out.println("You will have a good day, keep working hard you got a: " + randomnumber);
		}
		
		
		
	}

}
