package Collection;
import java.util.*;

class FirstNameCompare implements Comparator {
    public int compare(Object employee1, Object employee2) {
        Employee s1 = (Employee) employee1;
        Employee s2 = (Employee) employee2;

        return s1.firstName.compareTo(s2.firstName);
    }

}

class LastNameCompare implements Comparator {
    public int compare(Object employee1, Object employee2) {
        Employee s1 = (Employee) employee1;
        Employee s2 = (Employee) employee2;

        return s1.lastName.compareTo(s2.lastName);
    }

}

class SalaryCompare implements Comparator {
    public int compare(Object object1, Object object2) {
        Employee employee1 = (Employee) object1;
        Employee employee2 = (Employee) object2;

        return employee1.salary.compareTo(employee2.salary);
    }

}

class Employee {
    Double age;
    Double salary;
    String name;
    String firstName;
    String lastName;

    Employee(Double age, Double salary, String firstName, String lastName) {
        this.age = age;
        this.salary = salary;
        this.name = firstName + " " + lastName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {

        return (age + " : " + salary + " : " + name + " ");
    }

}

public class Question2 {

    public static void main(String[] args) {
        Employee employee1 = new Employee((double) 22, 2000.90d, "Mainuddin", "Rizvi");
        Employee employee2 = new Employee((double) 74, 98000.90d, "Sylvestor", "Stallone");
        Employee employee3 = new Employee((double) 27, 30000.90d, "Vikas", "Rai");

        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println("Print Objects");
        System.out.println(list.toString());
        System.out.println("First Name sorting");
        Collections.sort(list, new FirstNameCompare());
        System.out.println(list.toString());
        System.out.println("Last Name sorting");
        Collections.sort(list, new LastNameCompare());
        System.out.println(list.toString());
        System.out.println("Salary sorting");
        Collections.sort(list, new SalaryCompare());
        System.out.println(list.toString());

    }
}
