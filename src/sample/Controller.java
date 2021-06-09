package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.TextFlow;

public class Controller {
    public ImageView playerImage;
    public TextField mainText;
    public ImageView enemyImage;
    public Button importDungeon;

    @FXML
    private void importPressed() {
        mainText.setText("YOU PRESSED THE BUTTON!");
    }
}
