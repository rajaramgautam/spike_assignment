
public class Q24 {
	
	public static void main(String[] args) {
		
		String num = "10";
		int divisionResult = 0;
		
		try {
			divisionResult = Integer.parseInt(num)/10;
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println(divisionResult);
	}

}
