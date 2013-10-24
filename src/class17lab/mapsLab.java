/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class17lab;

import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author schereja
 */
public class mapsLab {
    public static void main(String[] args) {
        
  
    Computer c1 = new Computer(1, "Ci7");
    Computer c2 = new Computer(2, "Ci5");
    Computer c3 = new Computer(3, "Ci3");
    
    
       Map testMap = new HashMap();
       testMap.put(1,c1);
       testMap.put(2,c2);
       Computer comp1 = (Computer) testMap.get(1);
        System.out.println(comp1.getCpu());
        
       
    }
}
