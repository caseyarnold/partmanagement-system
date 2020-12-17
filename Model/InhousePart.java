/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c482.Model;

/**
 *
 * @author casey
 */
public class InhousePart extends Part { 
    private int machineID;
    
    // getter
    public int getMachineID() {
        return machineID;
    }
    //setter
    public void setMachineID(int id) {
        this.machineID = id;
    }
    
    public InhousePart(int id, String name, double price, int stock, int min, int max, int machineID) {
        super(id, name, price, stock, min, max);
        
        this.machineID = machineID;

    }
}