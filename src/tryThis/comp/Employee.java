package tryThis.comp;

public class Employee {
	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {
		return this.salary * 12;
	}

	public int raiseSalary(int percent) {
		return this.salary * percent / 100;
	}

	@Override
	public String toString() {
		return "Employee[" +
			"id=" + id +
			", name='" + name + '\'' +
			", salary=" + salary +
			"]의 연봉은 " + this.getAnnualSalary() + " 월급 인상분은 " + this.raiseSalary(this.id * 10);
	}
}
