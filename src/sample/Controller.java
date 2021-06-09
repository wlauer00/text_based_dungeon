package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.TextFlow;

import java.io.File;

public class Controller {
    public ImageView playerImage;
    public TextField mainText;
    public ImageView enemyImage;
    public Button importDungeon;


    @FXML
    private void importPressed() {
        mainText.setText("YOU PRESSED THE BUTTON!");

        File file = new File("newHero.PNG");
        Image heroImage = new Image(file.toURI().toString());
        playerImage.setImage(heroImage);
    }
}
