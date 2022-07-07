/**
 * Exercice 5 of the 4th task of the TSystems Bootcamp
 * 
 * @author Roger Rubio Rufaste
 *
 */
public class Exercice5 {

	/**
	 * The main method creates 4 variables "int" A, B, C and D and does the following operations:
	 * - B = C
	 * - C = A
	 * - A = D
	 * - D = B
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//First we declare and initialize the four variables
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
				
		//First we show the four variables
		System.out.println("Valor inicial de las variables A, B, C y D respectivamente = "+a+b+c+d);
				
		//Then we do the operations
		b=c;
		c=a;
		a=d;
		d=b;
				
		//Finally, we show again the values of the variables
		System.out.println("Valor final de las variables A, B, C y D respectivamente = "+a+b+c+d);
		
	}

}