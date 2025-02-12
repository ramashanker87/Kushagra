package com.rama.app;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeMain {
    public String name;
    public int age;
    public String company;
    public String id;
    public double salary;

    // Constructor
    public EmployeeMain(String name, int age, String company, String id, double salary) {
        this.name = name;
        this.age = age;
        this.company = company;
        this.id = id;
        this.salary = salary;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Print method to display Employee details
    public void print() {
        System.out.println("Name: " + name + ", Age: " + age + ", Company: " + company + ", ID: " + id + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        List<EmployeeMain> employeeMainList = new ArrayList<>();

        // Correcting object creation
        EmployeeMain employeeMain1 = new EmployeeMain("ep1", 20, "xzycompany", "2222", 20000);
        EmployeeMain employeeMain2 = new EmployeeMain("ep2", 25, "xzycompany", "2223", 25000);
        EmployeeMain employeeMain3 = new EmployeeMain("ep3", 30, "xzycompany", "2224", 30000);
        EmployeeMain employeeMain4 = new EmployeeMain("ep4", 28, "xzycompany", "2225", 28000);
        EmployeeMain employeeMain5 = new EmployeeMain("ep5", 22, "xzycompany", "2226", 22000);
        EmployeeMain employeeMain6 = new EmployeeMain("ep6", 26, "xzycompany", "2227", 26000);
        EmployeeMain employeeMain7 = new EmployeeMain("ep7", 24, "xzycompany", "2228", 24000);

        // Adding employees to the list
        employeeMainList.add(employeeMain1);
        employeeMainList.add(employeeMain2);
        employeeMainList.add(employeeMain3);
        employeeMainList.add(employeeMain4);
        employeeMainList.add(employeeMain5);
        employeeMainList.add(employeeMain6);
        employeeMainList.add(employeeMain7);

        // Printing all employees
        for (EmployeeMain EmployeeMain : employeeMainList) {
            EmployeeMain.print();
        }

        System.out.println("\nEmployees Older than 23:");

        // Filtering employees based on age > 23
        List<EmployeeMain> employeeMain23PlusAge = employeeMainList.stream().filter(EmployeeMain -> EmployeeMain.getAge() > 23).collect(Collectors.toList());

        for (EmployeeMain EmployeeMain : employeeMain23PlusAge) {
            EmployeeMain.print();
        }
    }
}
