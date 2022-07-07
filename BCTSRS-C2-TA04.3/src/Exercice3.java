/**
 * Exercice 3 of the 4th task of the TSystems Bootcamp
 * 
 * @author Roger Rubio Rufaste
 *
 */
public class Exercice3 {

	/**
	 * The main method declares 2 variables "int" X and Y, and 2 variables "double" N and M and does the following operations:
	 * - Shows the values of each variable
	 * - X + Y
	 * - X - Y
	 * - X * Y
	 * - X / Y
	 * - X % Y
	 * - N + M
	 * - N - M
	 * - N * M
	 * - N / M
	 * - N % M
	 * - X + N
	 * - Y / M
	 * - Y % M
	 * - The double of each variable
	 * - Result of adding all the variables
	 * - The product of all variables
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//First we declare and initialize the four variables
		int x = 10;
		int y = 5;
		double n = 2.5;
		double m = 1.5;
				
		//First we show the variables
		System.out.println("Variable X = "+x);
		System.out.println("Variable Y = "+y);
		System.out.println("Variable N = "+n);
		System.out.println("Variable M = "+m);
				
		//We show the result of x+y
		System.out.println(x+" + "+y+" = "+(x+y));
				
		//We show the result of x-y
		System.out.println(x+" - "+y+" = "+(x-y));
		
		//We show the result of x*y
		System.out.println(x+" * "+y+" = "+(x*y));
		
		//We show the result of x/y
		System.out.println(x+" / "+y+" = "+(x/y));
		
		//We show the result of x%y
		System.out.println(x+" % "+y+" = "+(x%y));
		
		//We show the result of n+m
		System.out.println(n+" + "+m+" = "+(n+m));
		
		//We show the result of n-m
		System.out.println(n+" - "+m+" = "+(n-m));
		
		//We show the result of n*m
		System.out.println(n+" * "+m+" = "+(n*m));
		
		//We show the result of n/m
		System.out.println(n+" / "+m+" = "+(n/m));
		
		//We show the result of n%m
		System.out.println(n+" % "+m+" = "+(n%m));
		
		//We show the result of x+n
		System.out.println(x+" + "+n+" = "+(x+n));
		
		//We show the result of y/m
		System.out.println(y+" / "+m+" = "+(y/m));
		
		//Double of each variable
		System.out.println("x*2= "+x*2);
		System.out.println("y*2= "+y*2);
		System.out.println("n*2= "+n*2);
		System.out.println("m*2= "+m*2);
		
		//Result of adding all the variables
		System.out.println(x+" + "+y+" + "+n+" + "+y+" = "+(x+y+n+m));
				
		//Product of all the variables
		System.out.println(x+" * "+y+" * "+n+" * "+y+" = "+(x*y*n*m));

	}

}