package dailyPractice.streamapi;

public class Emp {
	//int id;
	String name;
	long salary;
	//String department;
	public Emp( String name, long salary) {
		super();
		//this.id = id;
		this.name = name;
		this.salary = salary;
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [ name=" + name + ", salary=" + salary + "]";
	}

}
