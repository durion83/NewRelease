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
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    private String destination;

    @FXML
    public void actionCopy(ActionEvent event) throws Exception {
        //method to start copying
        //Incomplete
        String source = "C:/Users/ahmad/Desktop/test2";
        String log = "D:/Java_Programs/NewRelease/logs/log.txt";
        System.out.println(destination);
        Copy c = new Copy();
        AddBranchScreen a = new AddBranchScreen();
        setDestination(a.getPath());
        System.out.println(destination);
        c.setDest(destination);
        c.setLog(log);
        c.setSrc(source);
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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
