/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c482.Controller;

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
public class AddPart implements Initializable {

    @FXML
    private Label lblAddPartsScreen;
    @FXML
    private RadioButton radioAddPartsInHouse;
    @FXML
    private RadioButton radioAddPartsOutsource;
    @FXML
    private Label lblAddPartsID;
    @FXML
    private Label lblAddPartsIDNumber;
    @FXML
    private Label lblAddPartsName;
    @FXML
    private TextField txtAddPartsName;
    @FXML
    private Label lblAddPartsInv;
    @FXML
    private TextField txtAddPartsInv;
    @FXML
    private Label lblAddPartsPrice;
    @FXML
    private TextField txtAddPartsPrice;
    @FXML
    private Label lblAddPartsMax;
    @FXML
    private TextField txtAddPartsMax;
    @FXML
    private Label lblAddPartsMin;
    @FXML
    private TextField txtAddPartsMin;
    @FXML
    private Label lblAddPartsDyn;
    @FXML
    private TextField txtAddPartsDyn;
    @FXML
    private Button btrnAddPartsSave;
    @FXML
    private Button btnAddPartsCancel;

    @FXML
    public void btnGoBack(ActionEvent event) throws IOException {
        Parent goBackParent = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
        Scene  goBackScene  = new Scene(goBackParent);
        Stage  goBackStage  = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        goBackStage.setScene(goBackScene);
        goBackStage.setTitle("Inventory Management System");
        goBackStage.show(); 
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
