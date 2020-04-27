package labnew.lab04.bkap;

import labnew.lab04.bkap.entity.Employee;
import util.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeManager {
    private static final List<Employee> employeeList = new ArrayList<>(10);
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setEntry("1", "input employees information", EmployeeManager::inputEmployees);
        menu.setEntry("2", "calculate all employees salary", EmployeeManager::calculateSalaries);
        menu.setEntry("3", "show all employees information", EmployeeManager::showAllEmployees);
        menu.setEntry("4", "sort employee list", EmployeeManager::sortInternalBySalary);
        menu.setEntry("5", "find employees by name", EmployeeManager::findByName);
        menu.setEntry("6", "update employees information by id", EmployeeManager::updateById);
        menu.setEntry("7", "exit", EmployeeManager::exit);

        while (true) {
            System.out.println();
            System.out.println("Employees manage menu:");
            menu.run();
        }
    }

    private static void inputEmployees() {
        while (true) {
            Employee employee = new Employee();
            System.out.println("enter employee information:");
            System.out.print("id? ");
            employee.setId(sc.nextLine());
            System.out.print("name? ");
            employee.setName(sc.nextLine());
            System.out.print("age? ");
            employee.setAge(sc.nextInt());
            sc.nextLine();
            System.out.print("salary rate? ");
            employee.setSalaryRate(sc.nextFloat());
            System.out.print("status? ");
            employee.setStatus(sc.nextBoolean());
            sc.nextLine();
            employeeList.add(employee);

            System.out.print("add another (Y/n)? ");
            String confirm = sc.nextLine().trim();
            if (confirm.equals("n") || confirm.equals("N")) {
                break;
            }
        }
    }

    private static void calculateSalaries() {
        employeeList.forEach(Employee::calculateSalary);
        System.out.println("all employees salary are calculated");
        System.out.println("press 3 to show full employee list");
    }

    private static void showAllEmployees() {
        System.out.println("employee list:");
        employeeList.forEach(Employee::display);
    }

    private static void sortInternalBySalary() {
        employeeList.forEach(Employee::calculateSalary);
        employeeList.sort((employeeA, employeeB) -> {
            if (employeeA.getSalary() == employeeB.getSalary()) {
                return 0;
            }
            return employeeB.getSalary() > employeeA.getSalary() ? -1 : 1;
        });
        System.out.println("sorted employee list by salary");
        System.out.println("press 3 to show full employee list");
    }

    private static void findByName() {
        System.out.println("enter name: ");
        String name = sc.nextLine().trim();
        System.out.print("strict mode (Y/n)? ");
        String confirm = sc.nextLine().trim();

        System.out.println("search result for \"" + name + "\"");
        if (confirm.equals("n") || confirm.equals("N")) {
            employeeList
                    .stream()
                    .filter((e) -> e.getName().equals(name))
                    .forEach(Employee::display);
        } else {
            employeeList
                    .stream()
                    .filter((e) -> e.getName().contains(name))
                    .forEach(Employee::display);
        }
    }

    private static void updateById() {
        while (true) {
            System.out.print("enter employee id: ");
            String id = sc.nextLine().trim();
            List<Employee> employees = employeeList
                    .stream()
                    .filter((e) -> e.getId().equals(id))
                    .collect(Collectors.toList());

            if (!employees.isEmpty()) {
                System.out.println("enter employee information:");
                System.out.print("name? ");
                String name = sc.nextLine();
                System.out.print("age? ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("salary rate? ");
                float salaryRate = sc.nextFloat();
                System.out.print("status? ");
                boolean status = sc.nextBoolean();
                sc.nextLine();

                employees.forEach((e) -> {
                    e.setName(name);
                    e.setAge(age);
                    e.setSalaryRate(salaryRate);
                    e.setStatus(status);
                    e.calculateSalary();
                });
            } else {
                System.out.println("no employees found");
            }

            System.out.print("update another (Y/n)? ");
            String confirm = sc.nextLine().trim();
            if (confirm.equals("n") || confirm.equals("N")) {
                break;
            }
        }
        System.out.println("employees updated");
        System.out.println("press 3 to show full employee list");
    }

    private static void exit() {
        System.exit(0);
    }
}
