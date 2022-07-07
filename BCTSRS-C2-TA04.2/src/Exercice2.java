/**
 * Exercice 2 of the 4th task of the TSystems Bootcamp
 * 
 * @author Roger Rubio Rufaste
 *
 */
public class Exercice2 {

	/**
	 * The main method declares 3 variables (integer, double and char) and does the following operations:
	 * - Shows the values of each variable
	 * - N + A
	 * - A-N
	 * - Numeric value of the character variable (ASCII value)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//First we declare and initialize the three variables
		int n = 5;
		double a = 4.56;
		char c = 'a';
				
		//First we show the variables
		System.out.println("Variable N = "+n);
		System.out.println("Variable A = "+a);
		System.out.println("Variable C = "+c);
				
		//We show the result of n+a
		System.out.println(n+" + "+a+" = "+(n+a));
				
		//We show the result of a-n
		System.out.println(a+" - "+n+" = "+(a-n));
				
		//We show the numeric value of the character variable c = 'a'
		System.out.println("Valor numérico del carácter a = "+(0 + c));

	}

}