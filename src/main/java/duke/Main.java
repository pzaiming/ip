package duke;

import java.io.IOException;

import duke.gui.MainWindow;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * A GUI for Duke using FXML.
 */
public class Main extends Application {

    private static Stage stage;
    private Duke duke = new Duke("data/duke.txt");
    private final Image icon = new Image(this.getClass().getResourceAsStream("/images/DaDuke.png"));
    private final String title = "PlanPal";

    @Override
    public void start(Stage stage) {
        this.stage = stage;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setScene(scene);
            stage.setTitle(title);
            stage.getIcons().add(icon);
            fxmlLoader.<MainWindow>getController().setDuke(duke);
            this.stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
