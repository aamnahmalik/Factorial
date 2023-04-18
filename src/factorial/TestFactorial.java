/** Tess Bossdorf
 * Test recursive and iterative versions of Factorial number
 */

package factorial;

public class TestFactorial {
	public static void main(String[] args){
	System.out.println("\nFactorial Number using Recursion\n");
	System.out.println("1");
	System.out.println("2");
	System.out.println("3");
	System.out.println("4");
	System.out.println("5");
	System.out.println("6");
	System.out.println("\nResult:fact1(6) = " +
	      Factorial.fact1(6));
	System.out.println("\n\nFactorial Number using Iteration\n");
	System.out.println("1");
	System.out.println("2");
	System.out.println("3");
	System.out.println("4");
	System.out.println("5");
	System.out.println("6");
	System.out.println("\nResult:fact2(6) = " +
	Factorial.fact2(6));
	}
}
