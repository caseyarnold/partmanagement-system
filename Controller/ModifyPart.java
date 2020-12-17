/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c482.Controller;

import static c482.Controller.MainScreen.partToModifyIndex;
import static c482.Model.Inventory.getPartInventory;
import c482.Model.Part;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author casey
 */
public class ModifyPart implements Initializable {

    @FXML
    private Label lblModifyPartsScreen;
    @FXML
    private RadioButton radioModifyPartsInHouse;
    @FXML
    private RadioButton radioModifyPartsOutsource;
    @FXML
    private Label lblModifyPartsID;
    @FXML
    private Label lblModifyPartsIDNumber;
    @FXML
    private Label lblModifyPartsName;
    @FXML
    private TextField txtModifyPartsName;
    @FXML
    private Label lblModifyPartsInv;
    @FXML
    private TextField txtModifyPartsInv;
    @FXML
    private Label lblModifyPartsPrice;
    @FXML
    private TextField txtModifyPartsPrice;
    @FXML
    private Label lblModifyPartsMax;
    @FXML
    private TextField txtModifyPartsMax;
    @FXML
    private Label lblModifyPartsMin;
    @FXML
    private TextField txtModifyPartsMin;
    @FXML
    private Label lblModifyPartsDyn;
    @FXML
    private TextField txtModifyPartsDyn;
    @FXML
    private Button btrnModifyPartsSave;
    @FXML
    private Button btnModifyPartsCancel;
    
    int partIndex = partToModifyIndex();


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Part part = getPartInventory().get(partIndex);
//        lblModifyPartsID = getPartInventory().get(partIndex).getID();
        lblModifyPartsIDNumber.setText("Auto-Gen: " + part.getID());
        txtModifyPartsName.setText(part.getName());
        txtModifyPartsInv.setText(Integer.toString(part.getStock()));
        txtModifyPartsPrice.setText(Double.toString(part.getPrice()));
        txtModifyPartsMin.setText(Integer.toString(part.getMin()));
        txtModifyPartsMax.setText(Integer.toString(part.getMax()));
    }    

    @FXML
    private void btnGoBack(ActionEvent event) throws IOException {
        Parent goBackParent = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
        Scene  goBackScene  = new Scene(goBackParent);
        Stage  goBackStage  = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        goBackStage.setScene(goBackScene);
        goBackStage.setTitle("Inventory Management System");
        goBackStage.show(); 
    }
    
}
