package cracckify.designpattern.creationaldp.singleton;

public class ThreadSafeSingletone {

	public static void main(String[] args) {
		// Singleton is not thread safe
		// race condition may occur
		//to over come that we can use synch method but
		
		//volatile ensures publication and visibility of the initialized instance 
		//Why?Because your first null check happens outside the synchronized block:

		Thread t1 = new Thread(() -> {
			LoggerTh logger = LoggerTh.getInstance();
			System.out.println(logger);
		});

		Thread t2 = new Thread(() -> {
			LoggerTh logger = LoggerTh.getInstance();
			System.out.println(logger);
		});
		t1.start();
		t2.start();
		// System.out.println(logger3 == Logger.getInstance());

	}

}
class LoggerTh {

    private static volatile LoggerTh instance;

    private LoggerTh() {
        System.out.println("Logger object created"); }

//    public static synchronized LoggerTh getInstance() {
//
//        if (instance == null) {
//            //instance = new LoggerThis();
//        	 try {
//                 Thread.sleep(100);
//             } catch (Exception e) {}
//
//             instance = new LoggerTh();
//        }
//
//        return instance;
//    }
	public static LoggerTh getInstance() {
		if (instance == null) { // First check

			synchronized (LoggerTh.class) {

				if (instance == null) { // Second check
					instance = new LoggerTh();
				}
			}
		}
		return instance;
	}

}
