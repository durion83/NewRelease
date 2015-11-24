package sample;

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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class logincontroller  implements Initializable {

    @FXML
    private Label label;

    @FXML
    private Label invalid_label;

    @FXML
    private TextField username_box;

    @FXML
    private TextField password_box;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {



        Parent home_page_parent = FXMLLoader.load(getClass().getResource("mainScreen.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        if (isValidCredentials())
        {
            app_stage.hide(); //optional
            app_stage.setScene(home_page_scene);
            app_stage.show();
       }
        else
        {
            username_box.clear();
            password_box.clear();
            invalid_label.setText("Sorry, invalid credentials");
        }
  }
    private boolean isValidCredentials() {

        String userName;
        String password;
        boolean let_in = false;

        userName = username_box.getText();
        password = password_box.getText();
        System.out.println(userName);
        System.out.println(password);

        if (userName.equals("operator") && password.equals("oper@321"))
        {
           return let_in = true;
        }
        else
        {
         return let_in;
        }


    }




    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }



}
