package cracckify.solidprinciples.dip;


public class Main {

    public static void main(String[] args) {
    	//DIP= Dependency Inversion Principle
    	//a high level module should not depend on low level module or concrete 
    	//implementation instead should depend on abstraction 
    	//OR
    	//High-level business logic should depend on abstractions rather than concrete implementations.

        // Inject ICICI Bank
        Bank iciciBank = new IciciBank();
        PhonePe phonePe1 = new PhonePe(iciciBank);
        phonePe1.makePayment(1000);

        // Inject HDFC Bank
        Bank hdfcBank = new HdfcBank();
        PhonePe phonePe2 = new PhonePe(hdfcBank);
        phonePe2.makePayment(2000);

        // Inject SBI Bank
        PhonePe phonePe3 = new PhonePe(new SbiBank());
        phonePe3.makePayment(3000);
    }
}

// Abstraction
interface Bank {
    void payment(double amount);
}

// Concrete implementation 1
class IciciBank implements Bank {

    @Override
    public void payment(double amount) {
        System.out.println("ICICI Bank payment: Rs." + amount);
    }
}

// Concrete implementation 2
class HdfcBank implements Bank {

    @Override
    public void payment(double amount) {
        System.out.println("HDFC Bank payment: Rs." + amount);
    }
}

// Concrete implementation 3
class SbiBank implements Bank {

    @Override
    public void payment(double amount) {
        System.out.println("SBI Bank payment: Rs." + amount);
    }
}

// High-level class
class PhonePe {

    private final Bank bank;

    // Constructor Injection
    public PhonePe(Bank bank) {
        this.bank = bank;
    }

    public void makePayment(double amount) {
        bank.payment(amount);
    }
}

