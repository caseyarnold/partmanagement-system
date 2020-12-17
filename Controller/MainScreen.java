package c482.Controller;

// java
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
// java fx
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
// my models
import c482.Model.Part;
import c482.Model.Product;
import c482.Model.Inventory;
import static c482.Model.Inventory.getPartInventory;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 *
 * @author Casey Arnold
 */
public class MainScreen implements Initializable {
    
    Parent scene;
    Stage stage;
    
    @FXML
    private TableView<Part> partData;
    
    @FXML
    private TableView<Product> productData;
    
    @FXML
    public TableColumn<Part, Integer> partID;

    @FXML
    public TableColumn<Part, String> partName;

    @FXML
    public TableColumn<Part, Integer> partStock;
    
    @FXML 
    public TableColumn<Part, Double> partPrice;
    
    @FXML
    private Label label;
    
    private static Part modifyPart;
    private static int modifyPartIndex;
        
    public static int partToModifyIndex() {
        return modifyPartIndex;
    }


    @FXML
    void btnOpenAddProduct(ActionEvent event) throws IOException {
//        Parent addPartsParent = FXMLLoader.load(getClass().getResource("/View/AddProduct.fxml"));
//        Scene  addPartsScene  = new Scene(addPartsParent);
//        Stage  addPartsStage  = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        
//        addPartsStage.setScene(addPartsScene);
//        addPartsStage.setTitle("Add Part");
//        addPartsStage.show();
    }
    
    @FXML
    public void btnOpenAddPart(ActionEvent event) throws IOException {
        Parent addPartsParent = FXMLLoader.load(getClass().getResource("AddPart.fxml"));
        Scene  addPartsScene  = new Scene(addPartsParent);
        Stage  addPartsStage  = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        addPartsStage.setScene(addPartsScene);
        addPartsStage.setTitle("Add Part");
        addPartsStage.show(); 
    }

    @FXML
    public void btnOpenModifyPart(ActionEvent event) throws IOException {
        modifyPart = partData.getSelectionModel().getSelectedItem();
        modifyPartIndex = getPartInventory().indexOf(modifyPart);

        Parent addPartsParent = FXMLLoader.load(getClass().getResource("ModifyPart.fxml"));
        Scene  addPartsScene  = new Scene(addPartsParent);
        Stage  addPartsStage  = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        addPartsStage.setScene(addPartsScene);
        addPartsStage.setTitle("Modify Part");
        addPartsStage.show(); 
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        partID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        partName.setCellValueFactory(new PropertyValueFactory<>("name"));
        partStock.setCellValueFactory(new PropertyValueFactory<>("stock"));        
        partPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        
        populatePartsTableview();
    }   
    
    public void populatePartsTableview() {
        partData.setItems(Inventory.getPartInventory());
    }

    public void populateProductsTableview() {
        productData.setItems(Inventory.getProductInventory());
    }
}
