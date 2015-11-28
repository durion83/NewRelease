package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class Controller implements Initializable {

    /**
     * Initializes the controller class.
     */

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

    public void addbranch(ActionEvent event) throws IOException {
       //Enter Action Here for Add Branch Button
        //create classes if needed
       AlertBox.display("Title of Window", "Wow this alert box is awesome!");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
