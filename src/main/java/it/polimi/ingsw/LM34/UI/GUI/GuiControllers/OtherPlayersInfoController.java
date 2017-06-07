package it.polimi.ingsw.LM34.UI.GUI.GuiControllers;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 * Created by GiulioComi on 06/06/2017.
 */

public class OtherPlayersInfoController {
    @FXML
    private ScrollPane scrollPane;
    @FXML
    private Group towers;


    @FXML
    private void initialize() {

    }
    @FXML
    public void changeColor() {
    }

    @FXML
    public void tryBuyCard() {
        Image image;

        for(Integer i = 0; i < towers.getChildren().size(); i++) {
            Node nodeOut = towers.getChildren().get(i);
        if(nodeOut instanceof ImageView){
            if(i%2 == 0)
                ((ImageView)nodeOut).setImage(new Image(Thread.currentThread().getContextClassLoader().getResource("images/icon.png").toExternalForm()));
            else {
                ((ImageView) nodeOut).setStyle("-fx-opacity: 0.5");
                nodeOut.setDisable(true);
            }

        }
            }

        }
}
