package cracckify.designpattern.creationaldp.singleton;


public class Main {

    public static void main(String[] args) {
    	//singleton dp:It is creational design pattern that ensures,
    	//only one instance of a class is created and provides a global access point to that instance
    	
    	//OR
    	//This guarantees only one instance of an object throughout
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Account created");
        logger2.log("Payment completed");

        System.out.println(logger1 == logger2);
    }
}

class Logger {

    // Step 1: Store the single instance
    private static Logger instance;

    // Step 2: Prevent external object creation
    private Logger() {
        System.out.println("Logger object created");
    }

    // Step 3: Provide access to the instance
    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}

