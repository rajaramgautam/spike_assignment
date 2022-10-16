
/**
 * 
 * Q4 - Method overloading
 *
 */
public class Q4 {

	public static int addNumbers(int a, int b) {
		return a + b;
	}

	public static int addNumbers(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println(addNumbers(2, 3));
		System.out.println(addNumbers(2, 3, 4));
	}

}
