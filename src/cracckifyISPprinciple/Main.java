package cracckifyISPprinciple;

public class Main {

	public static void main(String[] args) {
		
		//ISP=> Interface Segregation Principle
		// a class should not be forced to implement methods that it doesn't need
		//OR
		//don't force children for methods they can't have
		//Before ISP
		//>>One large Employee interface
		//Developer forced to implement approveLeave()
		//Unnecessary methods
		//Classes depend on unwanted functionality
		
		//After ISP
		//Three smaller interfaces
//		Developer implements only Workable
//		Only relevant methods
//		Classes depend on what they actually need
		
//		Remember: ISP is about designing interfaces so that classes implement only the capabilities they need.
//
//		In an interview, you can say:
//		Interface Segregation Principle states that clients should not be forced to depend on methods they do not use. We achieve this by splitting large interfaces into smaller, specific interfaces.
		
		
        Developer developer = new Developer();
        developer.work();

        Manager manager = new Manager();
        manager.work();
        manager.approveLeave();

        PayrollService payroll = new PayrollService();
        payroll.calculateSalary();

	}

}
//interface Employee {
//
//    void work();
//
//    void calculateSalary();
//
//    void approveLeave();
//}

//class Developer implements Employee {
//
//  @Override
//  public void work() {
//      System.out.println("Writing Java code");
//  }
//
//  @Override
//  public void calculateSalary() {
//      System.out.println("Salary calculated");
//  }
//
//  @Override
//  public void approveLeave() {
//      // Developer cannot approve leave!
//  }
//}

//better approach this is ISP
interface Workable {
    void work();
}

interface SalaryCalculable {
    void calculateSalary();
}

interface LeaveApprover {
    void approveLeave();
}


class Developer implements Workable {

    @Override
    public void work() {
        System.out.println("Developer writing Java code");
    }
}

class PayrollService implements SalaryCalculable {

    @Override
    public void calculateSalary() {
        System.out.println("Calculating salary");
    }
}

class Manager implements Workable, LeaveApprover {

    @Override
    public void work() {
        System.out.println("Manager managing team");
    }

    @Override
    public void approveLeave() {
        System.out.println("Leave approved");
    }
}