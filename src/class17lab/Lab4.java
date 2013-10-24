/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class17lab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author schereja
 */
public class Lab4 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Smith", "John", "333-33-3333");
        Employee emp2 = new Employee("Tim", "Tiny", "111-11-1111");
        Employee emp3 = new Employee("Smith", "Damien", "666-66-6666");
        Employee emp4 = new Employee("Doe", "Joe", "123-12-1234");
        ArrayList<Employee> employees = new ArrayList();
        
        employees.add(emp4);
        employees.add(emp3);
        employees.add(emp2);
        employees.add(emp4);
        
        System.out.println("The size of the list is: " +employees.size());
        Employee e = employees.get(2);
        System.out.println(e + "\n");
        for(Employee emp : employees){
            System.out.println(emp);
        }
        Set set = new HashSet(employees);
        
        System.out.println(set.size());
        for (Object emp : set){
            System.out.println(emp);
        }
}
}
