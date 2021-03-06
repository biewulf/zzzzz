package hiber;

// default package
// Generated 02-feb-2015 20:40:26 by Hibernate Tools 3.4.0.CR1

/**
 * Employee generated by hbm2java
 */
public class Employee implements java.io.Serializable {

	private Integer id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee() {
	}

	public Employee(String firstName, String lastName, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
