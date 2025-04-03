import java.util.*;
public class Employee {
	int id;
	String name;
	String salary;
	
	public Employee(int id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
	public void displayDetails() {
		System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
	}
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Rachit", "430000"));
        employees.add(new Employee(102, "Nishant", "500000"));
        employees.add(new Employee(103, "Deepak", "450000"));
        
        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }

	}

}
