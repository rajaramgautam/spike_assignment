import java.util.stream.Stream;


public class Q26{  
    public static void main(String[] args) {  
          
        Stream.of("A","B","C","D","E","F").limit(3).forEach(a -> System.out.println(a));
    }  
}  