package comparableAndComparator.comparator;


import java.util.ArrayList;
import java.util.List;

class ComparatorRunner {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee(3, "Name", "SurName 3", 100);
        Employee employee2 = new Employee(3, "Name", "SurName 2", 200);
        Employee employee3 = new Employee(3, "Nam", "SurName 3", 300);
        Employee employee4 = new Employee(1, "Nam", "SurName 3", 300);
        Employee employee5 = new Employee(100, "Name_100", "SurName 3", 300);
        Employee employee6 = new Employee(10, "Name 5", "SurName 3", 300);
        Employee employee7 = new Employee(0, "Name 5", "SurName 3", 300);
        Employee employee8 = new Employee(-1, "Name 5", "SurName 3", 300);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);

        System.out.println("Default sorting: " + employees);

        employees.sort(new Employee.IdComparator());
        System.out.println("After sorting: " + employees);
    }
}
