import java.util.Arrays;

public class Q19 {

	interface MaxInterface {
		int maxOfThree(int a, int b, int c);
	}

	public static void main(String[] args) {

		
		MaxInterface ad1 = (a, b, c) -> {
			int[] x = { a, b, c };
			Arrays.sort(x);
			return x[x.length - 1];
		};

		System.out.println(ad1.maxOfThree(70, 20, 30));

	}

}