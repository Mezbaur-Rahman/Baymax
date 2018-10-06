/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baymax2;

import static baymax2.Baymax2.mainstage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USCHAS
 */
public class SignupController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    TextField t1,t2,t3,t4;
    @FXML ComboBox<String> comboSex=new ComboBox<>();
    @FXML ComboBox<Integer> comboDate=new ComboBox<>();
    @FXML ComboBox<String> comboMonth=new ComboBox<>();
    @FXML ComboBox<Integer> comboYear=new ComboBox<>();
    @FXML
    private void signUpButtonOnAction(ActionEvent event) throws Exception{
        
        
        AnchorPane pane = FXMLLoader.load(getClass().getResource("SuccesfulSignUp.fxml"));
        Scene scene= new Scene(pane);
        Stage window = new Stage();
        mainstage.setScene(scene);
        mainstage.show();
        
    }
    @FXML
    private void backButtonOnAction(ActionEvent event) throws Exception{
        
          AnchorPane pane = FXMLLoader.load(getClass().getResource("Login.fxml"));
          Scene scene= new Scene(pane);
          Stage window = new Stage();
          mainstage.setScene(scene);
          mainstage.show();
        System.out.println("You clicked me!");
        
        
        
    }
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        comboSex.getItems().addAll("Male","Female");
        for(int i=1;i<=31;i++)comboDate.getItems().addAll(i);
        comboMonth.getItems().addAll("January","February","March","April","May","June","July","August","September","October","November","December");
        for(int i=1990;i<=2017;i++)comboYear.getItems().addAll(i);
    }    
    
}
