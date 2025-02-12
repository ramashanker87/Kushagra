package com.rama.app;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeFilter {
    public static void main(String[] args) {
        Set<EmployeeDetails> employees = new HashSet<>();
        employees.add(new EmployeeDetails("Alice", 24, 45000));
        employees.add(new EmployeeDetails("Bob", 26, 50000));
        employees.add(new EmployeeDetails("Charlie", 23, 39000));
        employees.add(new EmployeeDetails("David", 25, 42000));

        Map<String, EmployeeDetails> employeeMap = employees.stream()
                .filter(emp -> emp.getSalary() >= 40000)
                .filter(emp -> emp.getAge() <= 25)
                .collect(Collectors.toMap(EmployeeDetails::getName, emp -> emp));

        employeeMap.forEach((name, emp) ->
                System.out.println("Name: " + name + ", Age: " + emp.getAge() + ", Salary: " + emp.getSalary()));
    }
}

class EmployeeDetails {
    public String name;
    public int age;
    public double salary;

    public EmployeeDetails(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
