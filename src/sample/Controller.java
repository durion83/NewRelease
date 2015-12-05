package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    public void actionCopy(ActionEvent event) throws Exception {
        //method to start copying
        //Incomplete
        String source = "C:/Users/ahmad/Desktop/test2";
        String destination = "C:/Users/ahmad/Desktop/test3";
        String log = "D:/Java_Programs/NewRelease/logs/log.txt";

        Copy c=new Copy();
        c.setVar(source, destination, log);
        try {
            c.StartCopy();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @FXML
    public void addBranch(ActionEvent event) throws IOException {
        Stage window = new Stage();
        Parent editScreen = FXMLLoader.load(getClass().getResource("AddBranch.fxml"));
        window.initModality(Modality.APPLICATION_MODAL);
        Scene editScene = new Scene(editScreen);
        window.setScene(editScene);
        window.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
