
package class17lab;

import java.util.ArrayList;

/**
 *
 * @author schereja
 */
public class Lab3 {
     public static void main(String[] args) {
        Employee emp1 = new Employee("Smith", "John", "333-33-3333");
        Employee emp2 = new Employee("Tim", "Tiny", "111-11-1111");
        Employee emp3 = new Employee("Smith", "Damien", "666-66-6666");
        Employee emp4 = new Employee("Doe", "Joe", "123-12-1234");
        ArrayList<Employee> employees = new ArrayList();
        
        employees.add(emp4);
        employees.add(emp3);
        employees.add(emp2);
        employees.add(emp1);
        System.out.println("The size of the list is: " +employees.size());
        Employee e = employees.get(2);
        System.out.println(e);
        for(Employee emp : employees){
            System.out.println(emp);
        }
}
}

