
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
        //Creating the employees
        Employee emp1 = new Employee("Smith", "John", "333-33-3333");
        Employee emp2 = new Employee("Tim", "Tiny", "111-11-1111");
        Employee emp3 = new Employee("Smith", "Damien", "666-66-6666");
        Employee emp4 = new Employee("Doe", "Joe", "123-12-1234");
        
        //Creating and adding to the array list
        ArrayList employees = new ArrayList();
        employees.add(emp4);
        employees.add(emp3);
        employees.add(emp2);
        employees.add(emp1);
        //Output the size of the list
        System.out.println("The size of the list is: " +employees.size());
        //Gets the employee at index 2
        Employee e = (Employee)employees.get(2);
        System.out.println(e);
        //Displays all the employees
        for(int i =0; i<employees.size();i++){
            System.out.println(employees.get(i));
        }
    }
}
