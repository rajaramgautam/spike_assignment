import java.util.ArrayList;
import java.util.stream.Collectors;

public class Q28 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("John");
		list.add("Jane");
		list.add("Sean");
		list.add("Sam");
		list.add("Grue");

		int size = list.stream()
				.filter(name -> name.charAt(0) == 'S')
				.collect(Collectors.toList()).size();

		System.out.println(size);

	}

}
