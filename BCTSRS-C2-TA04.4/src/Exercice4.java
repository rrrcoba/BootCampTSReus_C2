/**
 * Exercice 4 of the 4th task of the TSystems Bootcamp
 * 
 * @author Roger Rubio Rufaste
 *
 */
public class Exercice4 {

	/**
	 * The main method creates a variable "int" N and does the following operations:
	 * - Shows the value of N
	 * - Adds 77 to N
	 * - Does N - 3
	 * - Then it does the double of N
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//First we declare and initialize N
		int n = 1;
				
		//First we show the variable
		System.out.println("Valor inicial de N = "+n);
				
		//We do N + 77
		System.out.println("N + 77 = "+(n=n+77));
				
		//We do N - 3
		System.out.println("N - 3 = "+(n=n-3));
		
		//We do N * 2
		System.out.println("N * 2 = "+(n=n*2));
		
	}

}