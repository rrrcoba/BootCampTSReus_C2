/**
 * Exercice 1 of the 4th task of the TSystems Bootcamp
 * 
 * @author Roger Rubio Rufaste
 *
 */
public class Exercice1 {
	
	/**
	 * The main method adds, subtracts, multiplies, divides and makes the module of the two created variables.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//First we declare and initialize the two variables
		int x = 10;
		int y = 5;
		
		//Then we do the operations
		//First we add them
		System.out.println("The result of 10+5 is: "+(x+y));
		
		//Then we substract them
		System.out.println("The result of 10-5 is: "+(x-y));
		
		//Then we multiply them
		System.out.println("The result of 10*5 is: "+(x*y));
		
		//Then we divide them
		System.out.println("The result of 10/5 is: "+(x/y));
		
		//Then we do the module of them
		System.out.println("The result of 10%5 is: "+(x%y));
	}

}