package cracckify.designpattern.creationaldp.singleton;

public class NotThreadSafeSingletonExample {

	public static void main(String[] args) {
		// Singleton is not thread safe
		//race condition may occur
		
		Thread t1 = new Thread(() -> {
		    LoggerThis logger = LoggerThis.getInstance();
		    System.out.println(logger);
		});

		Thread t2 = new Thread(() -> {
		    LoggerThis logger = LoggerThis.getInstance();
		    System.out.println(logger);
		});
		t1.start();
        t2.start();
		//System.out.println(logger3 == Logger.getInstance());

	}

}
class LoggerThis {

    private static LoggerThis instance;

    private LoggerThis() {
        System.out.println("Logger object created");
    }

    public static LoggerThis getInstance() {

        if (instance == null) {
            //instance = new LoggerThis();
        	 try {
                 Thread.sleep(100);
             } catch (Exception e) {}

             instance = new LoggerThis();
        }

        return instance;
    }
}
