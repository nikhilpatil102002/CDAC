package Demo;

import java.util.*;
class Employee {
	
	private static int totalEmployees = 0;
	private static double totalSalaryExpense = 0;

	private int id;
	private String name;
	private double salary;

	static {
		totalEmployees = 0;
		totalSalaryExpense = 0;
	}

	{
		id = ++totalEmployees;
	}

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		totalSalaryExpense += salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		totalSalaryExpense -= this.salary;
		this.salary = salary;
		totalSalaryExpense += salary;
	}

	public static int getTotalEmployees() {
		return totalEmployees;
	}

	public static double calculateTotalSalaryExpense() {
		return totalSalaryExpense;
	}

	public static void applyRaise(double percentage) {
		for (Employee employee : Employeeutil.employees) {
			double raiseAmount = employee.salary * (percentage / 100);
			employee.setSalary(employee.salary + raiseAmount);
		}
	}

	@Override
	public String toString() {
		return "Employee ID: " + id + ", Name: " + name + ", Salary: " + salary;
	}
}

class Employeeutil {
	public static List<Employee> employees = new ArrayList<>();

	public static void acceptEmployee(String name, double salary) {
		Employee employee = new Employee(name, salary);
		employees.add(employee);
	}

	public static void displayEmployees() {
		if (employees.isEmpty()) {
			System.out.println("No employees found.");
		} else {
			for (Employee employee : employees) {
				System.out.println(employee);
			}
		}
	}
}

public class EmployeeExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {
			System.out.println("\nMenu:");
			System.out.println("1. Add Employee");
			System.out.println("2. Display All Employees");
			System.out.println("3. Apply Raise to All Employees");
			System.out.println("4. Calculate Total Salary Expense");
			System.out.println("5. Update Employee Salary");
			System.out.println("6. Get Total Employees");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Employee Name: ");
				String name = scanner.next();
				System.out.print("Enter Employee Salary: ");
				double salary = scanner.nextDouble();
				Employeeutil.acceptEmployee(name, salary);
				break;
			case 2:
				Employeeutil.displayEmployees();
				break;
			case 3:
				System.out.print("Enter raise percentage: ");
				double percentage = scanner.nextDouble();
				Employee.applyRaise(percentage);
				System.out.println("Raise applied to all employees.");
				break;
			case 4:
				System.out.println("Total Salary Expense: " + Employee.calculateTotalSalaryExpense());
				break;
			case 5:
				System.out.print("Enter Employee ID: ");
				int id = scanner.nextInt();
				System.out.print("Enter new Salary: ");
				double newSalary = scanner.nextDouble();
				if (id > 0 && id <= Employeeutil.employees.size()) {
					Employee employee = Employeeutil.employees.get(id - 1);
					employee.setSalary(newSalary);
					System.out.println("Salary updated.");
				} else {
					System.out.println("Invalid Employee ID.");
				}
				break;
			case 6:
				System.out.println("Total Employees: " + Employee.getTotalEmployees());
				break;
			case 7:
				exit = true;
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
		scanner.close();
	}

}
