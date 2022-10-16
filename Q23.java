import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q23 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		try (Scanner scanner = new Scanner(new File("testRead.txt"));
			    PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
			    while (scanner.hasNext()) {
				writer.print(scanner.nextLine());
			    }
			}
	}

}
