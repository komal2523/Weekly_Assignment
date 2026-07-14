package Assignment3;

public class Employee {

	
	int id;
    String name;
    double basicSalary;

   
    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

   
    double calculateSalary() {
        double hra = basicSalary * 0.20;
        double bonus = basicSalary * 0.10;
        double totalSalary = basicSalary + hra + bonus;
        return totalSalary;
    }

    
    void display() {
        System.out.println("Employee ID      : " + id);
        System.out.println("Employee Name    : " + name);
        System.out.println("Basic Salary     : " + basicSalary);
        System.out.println("Total Salary     : " + calculateSalary());
    }

    
    public static void main(String[] args) {

        Employee emp = new Employee(101, "Rohit", 50000);

        emp.display();
    }
}

