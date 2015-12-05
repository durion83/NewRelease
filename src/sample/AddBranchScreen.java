package sample;

import com.sun.java.swing.plaf.windows.resources.windows;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import jdk.nashorn.internal.ir.Block;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;

/**
 * Created by ahmad on 30-Nov-15.
 */
public class AddBranchScreen implements Initializable {
    @FXML
    TextField locationField = new TextField("choose file");

    @FXML
    Button saveButton;
    //path to be passed
    private String path;

    public void openBrowse(ActionEvent event) throws Exception {

        final Label labelSelectedDirectory = new Label();
        // code to open directory chooser
        Stage Windows = new Stage();
        DirectoryChooser directoryChooser = new DirectoryChooser();
        File selectedDirectory = directoryChooser.showDialog(Windows);
        labelSelectedDirectory.setText(selectedDirectory.getAbsolutePath());
        // change File object to String
//        String s = Paths.get(String.valueOf(selectedDirectory)).normalize().toString();
//        setPath(String.valueOf(selectedDirectory));
//        System.out.println(selectedDirectory);
        String name = selectedDirectory.getAbsolutePath();
        this.path =name;
        System.out.println(path);
    }

    @FXML
    public void saveBranch(ActionEvent event) throws Exception {
        // Close Current Window
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
    }

    public String getPath() {
        System.out.println(path);
        return path;
    }

    public void setPath(String path) {
        this.path = path;
        System.out.println(path);
    }

    public void initialize(URL location, ResourceBundle resources) {
    }
}
