package InterPrac;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecuterServiceRunner {

	public static void main(String[] args) {
		ExecutorService executerService = Executors.newSingleThreadExecutor();
		executerService.execute(new Task1());
		executerService.execute(new Thread(new Task2()));
		
		executerService.shutdown();
	}

}
