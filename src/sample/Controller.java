package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

public class Controller implements Initializable {

    /**
     * Initializes the controller class.
     */

    public void actionCopy(ActionEvent event) throws IOException {
        //method to start copying
        //Incomplete
        String source = "C:/Users/ahmad/Desktop/test2";
        String destination = "//AHMAD-NAS/homes/Ahmad/NewRelease";
        String log = "D:/Java_Programs/NewRelease/logs/log.txt";

        Copy c = new Copy();
        c.StartCopy(source, destination, log);

    }

    public void addBranch(ActionEvent event) throws IOException {
       //Enter Action Here for Add Branch Button
        //create classes if needed
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
