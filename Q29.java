import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q29 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);

		List<Integer> data = list.stream()
							.distinct()
							.sorted(Comparator.reverseOrder())
							.collect(Collectors.toList());
		
		System.out.println(data);
		
	}

}
