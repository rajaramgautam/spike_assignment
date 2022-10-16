import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Q30 {
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5); 
		
	      executor.submit(new Task());
	      executor.submit(new Task());
	      executor.submit(new Task());
	      executor.submit(new Task());
	      executor.submit(new Task());
	      
	      executor.shutdown();
	}
	
	
	static class Task implements Runnable {

	      public void run() {
	         
	         try {
	            Long duration = (long) (Math.random() * 5);
	            System.out.println("Running Task! Thread Name: " +
	               Thread.currentThread().getName());
	               TimeUnit.SECONDS.sleep(duration);
	            
	            System.out.println("Ticket issued " +
	               Thread.currentThread().getName());
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }
	   }

}
