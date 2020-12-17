/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c482.Model;
import c482.Model.InhousePart;
import c482.Model.OutsourcedPart;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author casey
 */
public class Inventory {
    // all parts
    private static ObservableList<Part> allParts = FXCollections.observableArrayList();
    // all products
    private static ObservableList<Product> allProducts = FXCollections.observableArrayList();
    // product id
    private static int productID = 0;
    // part id
    private static int partID = 0;
    
    // part items
    public static ObservableList<Part> getPartInventory(){
        return allParts;
    }

    public static void addPart(Part part){
        allParts.add(part);
    }

    public static void deletePart(Part part){
        allParts.remove(part);
    }
    
    public static void updatePart(int index, Part part){
        allParts.set(index, part);
    }
    
    public static int getPartID() {
        partID += 1;
        
        return partID;
    }
   // product items
        public static ObservableList<Product> getProductInventory(){
        return allProducts;
    }

    public static void addProduct(Product prod){
        allProducts.add(prod);
    }

    public static void deleteProduct(Product prod){
        allProducts.remove(prod);
    }
    
    public static void updateProduct(int index, Product prod){
        allProducts.set(index, prod);
    }
    
    public static int getProductID() {
        productID += 1;
        
        return productID;
    }

}
