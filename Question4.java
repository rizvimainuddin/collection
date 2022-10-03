//package Collection;
//
//import java.util.HashMap;
//import java.util.Map;
//
//class Employee {
//    String name;
//    int age;
//    String designation;
//    int salary;
//
//    Employee(String name, int age, String designation, int salary) {
//        this.name = name;
//        this.age = age;
//        this.designation = designation;
//        this.salary = salary;
//    }
//}
//
//public class Question4 {
//    public static void main(String[] args) {
//        Employee employee1 = new Employee("Mainuddin ", 22, "SE", 1000);
//        Employee employee2 = new Employee("Sadik", 23, "DE", 2000);
//        Employee employee3 = new Employee("Aditya", 24, "QE", 3000);
//        Map<Employee, Integer> hash = new HashMap<>();
//        hash.put(employee1, employee1.salary);
//        hash.put(employee2, employee2.salary);
//        hash.put(employee3, employee3.salary);
//
//        for (Map.Entry<Employee, Integer> mapped : hash.entrySet()) {
//            Employee employee = mapped.getKey();
//            System.out.println(mapped.getKey() + " " + employee.age + " " + employee.name + " " + employee.designation + " : " + mapped.getValue());
//        }
//
//    }
//}
