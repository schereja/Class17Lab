/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class17lab;

/**
 *
 * @author schereja
 */
public class Computer {
    private int computerId;
    private String cpu;

    public Computer(){
    }
    
    public Computer(int computerId, String cpu){
        this.computerId = computerId;
        this.cpu = cpu;
      
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.computerId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Computer other = (Computer) obj;
        if (this.computerId != other.computerId) {
            return false;
        }
        return true;
    }
    
    public int getComputerId() {
        return computerId;
    }

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }


    
    
}
