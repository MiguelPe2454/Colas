package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
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
    @FXML Label MensageLab;
    @FXML
    TextArea MensaTxA;
    @FXML
    ListView ColaLisw;

    public Cola cola = new Cola();

    public ImageView imagen(){
        Image imagen = new Image("Imagenes/figura.jpg");
        ImageView imaVi = new ImageView();
        imaVi.setFitHeight(100);
        imaVi.setFitWidth(90);
        imaVi.setImage(imagen);
        return imaVi;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        this.InsertarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int valor = parseInt(InsertarTxt.getText( ));
                cola.insertar(valor);
                Label label = new Label( );
                label.prefWidth(10);
                label.setText(InsertarTxt.getText( ));
                HBox hBox = new HBox();
                hBox.getChildren( ).add(label);
                hBox.getChildren( ).add(imagen());
                ColaLisw.getItems().add(hBox);
            }
        });

        this.BuscarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    int valor=parseInt(BuscarTxt.getText());
                    cola.BuscarElemento(valor);
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null,"No has ingresado nada");
                }
            }
        });

        this.ExtraerBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ColaLisw.getItems().remove(0);
                cola.Extraer();
            }
        });

        this.VaciarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ColaLisw.getItems().clear();
                System.gc();
                System.out.println(cola.vaciarLista());
            }
        });


    }

}
