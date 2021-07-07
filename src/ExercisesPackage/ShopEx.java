package ExercisesPackage;
import java.util.Scanner;
public class ShopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("input quantity: ");
		
		int quantity = sc.nextInt();
		
		int cost = quantity * 100;
		
		if ( quantity > 1000)
		{
			System.out.println("The cost will be: " + (cost * 0.90));
		}
		else
		{
			System.out.println("The cost will be: " + cost);
		}
	}

}


