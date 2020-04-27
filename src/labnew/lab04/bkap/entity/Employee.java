package labnew.lab04.bkap.entity;

import java.text.DecimalFormat;

public class Employee {
    private String id;
    private String name;
    private int age;
    private float salaryRate;
    private double salary;
    private boolean status;

    public Employee() {
    }

    public Employee(String id, String name, int age, float salaryRate, double salary, boolean status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salaryRate = salaryRate;
        this.salary = salary;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(float salaryRate) {
        this.salaryRate = salaryRate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void calculateSalary() {
        salary = salaryRate * 13000000;
    }

    public void display() {
        System.out.println("Employee[" + id + "]:");
        System.out.println("  name: " + name);
        System.out.println("  age: " + age);
        System.out.println("  salary rate: " + salaryRate);
        System.out.println("  salary: " + new DecimalFormat("#,##0.##").format(salary));
        System.out.println("  status: " + status);
    }

    public void input(String id, String name, int age, float salaryRate, boolean status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salaryRate = salaryRate;
        this.status = status;
    }
}
