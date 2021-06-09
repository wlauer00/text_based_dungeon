package dungeon;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class Controller {
    public static ImageView playerImage;
    public TextField mainText;
    public ImageView enemyImage;
    public Button importDungeon;


    @FXML
    private void importPressed() {
        mainText.setText("YOU PRESSED THE BUTTON!");

        File file = new File("finalHero.PNG");
        Image heroImage = new Image(file.toURI().toString());
        playerImage.setImage(heroImage);
    }


    public static void initialize() {
        File file = new File("finalHero.PNG");
        Image heroImage = new Image(file.toURI().toString());
        playerImage.setImage(heroImage);
    }
}
