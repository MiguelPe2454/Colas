package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    Button InsertarBtn, BuscarBtn, VaciarBtn, ExtraerBtn;
    @FXML
    TextField InsertarTxt, BuscarTxt;

    Cola cola = new Cola();
    public ImageView imagen(){
        Image imagen = new Image("");
        ImageView imageView = new ImageView();
        imageView.setFitHeight(50);
        imageView.setFitWidth(25);
        return imageView;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        this.InsertarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });




    }
}
