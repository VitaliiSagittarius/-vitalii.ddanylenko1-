package comparableAndComparator.comparable;

import java.util.Objects;

class Employee implements Comparable<Employee> {

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

    @Override
    public int compareTo(Employee anotherEmployee) {
        int result;

        result = this.id - anotherEmployee.id;

        if (result == 0) {
            result = this.name.compareTo(anotherEmployee.name);
        }
        //if (this.id - anotherEmployee.id == 0 && this.name.compareTo(anotherEmployee.name) == 0) {
        if (result == 0) {
            result = this.surname.compareTo(anotherEmployee.surname);
        }

        return result;
    }
}
