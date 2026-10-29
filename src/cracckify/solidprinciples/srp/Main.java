package cracckify.solidprinciples.srp;


public class Main {

    public static void main(String[] args) {

        AccountRepository repository = new AccountRepository();
        EmailService emailService = new EmailService();

        AccountService accountService =
                new AccountService(repository, emailService);

        accountService.createAccount("Sameeksha", 10000);

        ReportService reportService = new ReportService();
        reportService.generateReport();
    }
}

// Model: Holds account data
class BankAccount {

    private final String holderName;
    private final double balance;

    public BankAccount(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
}

// Responsibility 1: Account business logic
class AccountService {

    private final AccountRepository repository;
    private final EmailService emailService;

    public AccountService(AccountRepository repository,
                          EmailService emailService) {
        this.repository = repository;
        this.emailService = emailService;
    }

    public void createAccount(String name, double balance) {

        if (balance < 0) {
            throw new IllegalArgumentException(
                    "Balance cannot be negative");
        }

        BankAccount account = new BankAccount(name, balance);

        repository.save(account);
        emailService.sendWelcomeEmail(account);

        System.out.println("Account created successfully");
    }
}

// Responsibility 2: Database operations
class AccountRepository {

    public void save(BankAccount account) {
        System.out.println(
                "Saving account for " + account.getHolderName());
    }
}

// Responsibility 3: Email notifications
class EmailService {

    public void sendWelcomeEmail(BankAccount account) {
        System.out.println(
                "Welcome email sent to " + account.getHolderName());
    }
}

// Responsibility 4: Reporting
class ReportService {

    public void generateReport() {
        System.out.println("Bank report generated");
    }
}

