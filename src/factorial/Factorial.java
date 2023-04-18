/** Tess Bossdorf
 * Recursive and iterative versions of factorial number
 */

package factorial;

public class Factorial {
	// Recursive version of Factorial number
	public static int fact1(int n){
		if (n == 1){
			System.out.println();
			return 1;
		} // if else{
		int f1 = fact1(n-1);
		System.out.println(f1);
		int fact1Val = n * f1;
		return fact1Val;
	} // else
// fact1
// Iterative version of Factorial number
public static int fact2 (int n){
	int result = 1;
	System.out.println();
	for(int i = 2; i <= n; i++)
		System.out.println( result = result * i);
	return result;
} // fact2
} // Factorial

