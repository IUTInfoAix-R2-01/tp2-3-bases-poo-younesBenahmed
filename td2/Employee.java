package td2New;

public class Employee {
	
	private int id;
	private String firstName; 
	private String lastName;
	private int salary;
	
	public int getId () {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getName() {
		String name = firstName + lastName;  
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		int annualSalary = 12 * salary; 
		return annualSalary;
	}
	
	public int raiseSalary(int percent) {
		int newSalary = salary + (percent * salary );
		return newSalary;
	}
	
	public String toString() {
        return "Employee[id=" + id + "name=" + firstName + "", salary=?]";
    } 
	
	public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }
	
	public Employee (int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
}
