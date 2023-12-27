package comparableAndComparator.comparator;

import java.util.Comparator;
import java.util.Objects;

class Employee {

    private final int id;
    private final String name;
    private final String surname;
    private final int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && name.equals(employee.name) && surname.equals(employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    static class IdComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee employee1, Employee employee2) {
            if (employee1.id == employee2.id) {
                return 0;
            } else if (employee1.id < employee2.id) {
                return -1;

            } else
                return 0;
        }

    }
}
