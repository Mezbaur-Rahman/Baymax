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

/**
 * FXML Controller class
 *
 * @author USCHAS
 */
public class LoginController implements Initializable {

    @FXML
    private void signUpButtonOnAction(ActionEvent event) throws Exception{
        System.out.println("yoooohhhhh");
          AnchorPane pane = FXMLLoader.load(getClass().getResource("signup.fxml"));
          Scene scene= new Scene(pane);
          Stage window = new Stage();
          mainstage.setScene(scene);
          mainstage.show();
        System.out.println("You clicked me!");
        
        
    }
    @FXML
     private void logInButtonOnAction(ActionEvent event) throws Exception{
        System.out.println("yoooo");
        
        
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
