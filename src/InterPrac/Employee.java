package InterPrac;

public class Employee {
	int id;
	String emp_first_name;
	String emp_last_name;
	long salary;
	String department;

	public Employee(int id, String emp_first_name, String emp_last_name, long salary, String department) {
		super();
		this.id = id;
		this.emp_first_name = emp_first_name;
		this.emp_last_name = emp_last_name;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_first_name() {
		return emp_first_name;
	}

	public void setEmp_first_name(String emp_first_name) {
		this.emp_first_name = emp_first_name;
	}

	public String getEmp_last_name() {
		return emp_last_name;
	}

	public void setEmp_last_name(String emp_last_name) {
		this.emp_last_name = emp_last_name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", emp_first_name=" + emp_first_name + ", emp_last_name=" + emp_last_name
				+ ", salary=" + salary + ", department=" + department + "]";
	}

}
