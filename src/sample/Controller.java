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
        String source = "C:/Users/ahmad/Desktop/test2";
        String destination = "//AHMAD-NAS/homes/Ahmad/NewRelease";
        String log = "D:/Java_Programs/NewRelease/logs/log.txt";

        Copy c = new Copy();
        c.StartCopy(source, destination, log);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
