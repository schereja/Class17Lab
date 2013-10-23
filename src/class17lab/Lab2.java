
package class17lab;

import java.util.ArrayList;

/**
 *
 * @author schereja
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp1 = new Employee("Smith", "John", "333-33-3333");
        Employee emp2 = new Employee("Tim", "Tiny", "111-11-1111");
        Employee emp3 = new Employee("Smith", "Damien", "666-66-6666");
        Employee emp4 = new Employee("Doe", "Joe", "123-12-1234");
        ArrayList employees = new ArrayList();
        
        employees.add(emp4);
        employees.add(emp3);
        employees.add(emp2);
        employees.add(emp1);
        System.out.println("The size of the list is: " +employees.size());
        Employee e = (Employee)employees.get(2);
        System.out.println(e);
        for(int i =0; i<employees.size();i++){
            System.out.println(employees.get(i));
        }
    }
}
