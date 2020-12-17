/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c482;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import c482.Model.InhousePart;
import c482.Model.Inventory;

/**
 *
 * @author casey
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Controller/MainScreen.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("Inventory Management System");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InhousePart part = new InhousePart(Inventory.getPartID(), "Jenna's part", 10, 1, 1, 10, 1);
        Inventory.addPart(part);
        
        part = new InhousePart(Inventory.getPartID(), "Esther's part", 14, 14, 15, 130, 1);
        Inventory.addPart(part);

        part = new InhousePart(Inventory.getPartID(), "Danica's part", 15, 14, 15, 105, 1);
        Inventory.addPart(part);
        
        part = new InhousePart(Inventory.getPartID(), "John's part", 200, 1, 1, 150, 1);
        Inventory.addPart(part);
        
        launch(args);
    }
    
}
