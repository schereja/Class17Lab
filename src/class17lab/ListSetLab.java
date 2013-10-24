package class17lab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author schereja
 */
public class ListSetLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List computerParts = new ArrayList();
        computerParts.add("CPU");
        computerParts.add("Memory");
        computerParts.add("Motherboard");
        computerParts.add("Hard Drive");
        computerParts.add("CDD");
        computerParts.add("Case");
        int size = computerParts.size();
        //List before anything has been modified
        System.out.println("\nInitial List: ");
        for (Object obj : computerParts) {
            String s = (String) obj;
            System.out.println(s);
        }
        //Delete item from list

        System.out.println("\nAfter deleting index 3: ");
        computerParts.remove(3);

        for (Object obj : computerParts) {
            String s = (String) obj;
            System.out.println(s);
        }
        //Change index 2 to monitor
        System.out.println("\nChange index 2: ");
        computerParts.set(2, "Monitor");

        for (Object obj : computerParts) {
            String s = (String) obj;
            System.out.println(s);
        }

        //Clear list
        System.out.println("\nList Cleared:");
        computerParts.clear();
        for (Object obj : computerParts) {
            String s = (String) obj;
            System.out.println(s);
        }
    }
}
