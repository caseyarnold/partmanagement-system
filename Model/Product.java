/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c482.Model;
import javafx.collections.ObservableList;

/**
 *
 * @author Casey Arnold
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;
    private int min;
    private int max;
    private ObservableList<Part> associatedParts;

    public Product() {}
    
    // getters
    public int getID() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getStock() {
        return stock;
    }
    
    public int getMin() {
        return min;
    }
    
    public int getMax() {
        return max;
    }
    
    //setters
    public void setID(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void setMin(int min) {
        this.min = min;
    }
    
    public void setMax(int max) {
        this.max = max;
    }

    // part functions
    public void addAssociatedPart(Part part) {
        this.associatedParts.add(part);
    }
    
   public ObservableList<Part> getAssociatedParts() {
       return associatedParts;
   } 
    
    public boolean deleteAssociatedPart(int ID) {
        for (Part part : associatedParts ) {
            if(part.getID() == ID) {
                associatedParts.remove(part);
                return true;
            }
        }
        
        return false;
    }
}
