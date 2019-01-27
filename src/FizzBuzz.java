/* Write a program that prints the number from 1 to 100. 
 * If it is a multiple of 3, it should print "Fizz".
 *  If it’s a multiple of 5, it should print “Buzz”.
 *   If it’s a multiple of 3 and 5, it should print “Fizz Buzz”.
 */



public class FizzBuzz {

	public void run() {
		
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				System.out.print("Fizz ");
			}
			if (i % 5 == 0) {
				System.out.print("Buzz ");
			}
			if (!(i % 3 == 0 || i % 5 == 0)) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
	
	
}
