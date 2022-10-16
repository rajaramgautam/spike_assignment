import java.util.ArrayList;
import java.util.stream.Collectors;


@FunctionalInterface 
interface Airthematic{
	int operations(int a, int b);
}

public class Q27 {
	
	interface Addable{  
	    int add(int a,int b);  
	}  
	
	public void m1() {
		System.out.println("Hello");
	}
	
	public static int sum = 0;

	
	public static void main(String[] args) {
		ArrayList<Integer> lsInts = new ArrayList<>();
		lsInts.add(1);
		lsInts.add(2);
		lsInts.add(3);
		
		Integer sums = lsInts.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("Sum: " + sums);		
	
	}
}
