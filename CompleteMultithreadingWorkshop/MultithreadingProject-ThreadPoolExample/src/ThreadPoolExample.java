import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
	public static void main(String[] args) {
		// Java 1.5
		// Thread Pool
		// Executors
		// 1.Single Thread Pool
		// 2.Cached Thread Pool
		// 3.Scheduled Thread Pool
		
		ExecutorService ex = Executors.newFixedThreadPool(3);	
		ex.execute(null);
		// ex.submit(null);
	}
}
