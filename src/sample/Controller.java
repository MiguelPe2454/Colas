package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Integer.parseInt;

public class Controller implements Initializable{

    @FXML
    Button InsertarBtn, BuscarBtn, VaciarBtn, ExtraerBtn;
    @FXML
    TextField InsertarTxt, BuscarTxt;
    @FXML HBox ColaHbox, ConteHBox;

    public Cola cola = new Cola();

    public ImageView imagen(){
        Image imagen = new Image("Imagenes/figura4.jpg");
        ImageView imaVi = new ImageView();
        imaVi.setFitHeight(80);
        imaVi.setFitWidth(50);
        imaVi.setImage(imagen);
        return imaVi;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        this.InsertarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(cola.getTamaño()<8) {
                    int valor = parseInt(InsertarTxt.getText( ));
                    cola.insertar(valor);
                    Label label = new Label( );
                    label.prefWidth(10);
                    label.setText(InsertarTxt.getText( ));
                    HBox hBox = new HBox();
                    hBox.getChildren( ).add(label);
                    hBox.getChildren( ).add(imagen());
                    ColaHbox.getChildren( ).add(hBox);
                }else {
                    JOptionPane.showMessageDialog(null, "No puede insertar más 8 elementos");
                }
            }
        });


    }

}
