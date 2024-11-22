package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DisplayImages extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane
        GridPane gridPane = new GridPane();

        // Load images
        Image image1 = new Image("file:src/images/image1.jpg");
        Image image2 = new Image("file:src/images/image2.jpg");
        Image image3 = new Image("file:src/images/image3.jpg");
        Image image4 = new Image("file:src/images/image4.png");

        // Create ImageViews
        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);

        // Set fit sizes for ImageViews
        imageView1.setFitWidth(150);
        imageView1.setFitHeight(150);
        imageView2.setFitWidth(150);
        imageView2.setFitHeight(150);
        imageView3.setFitWidth(150);
        imageView3.setFitHeight(150);
        imageView4.setFitWidth(150);
        imageView4.setFitHeight(150);

        // Add ImageViews to GridPane
        gridPane.add(imageView1, 0, 0); // Column 0, Row 0
        gridPane.add(imageView2, 1, 0); // Column 1, Row 0
        gridPane.add(imageView3, 0, 1); // Column 0, Row 1
        gridPane.add(imageView4, 1, 1); // Column 1, Row 1

        // Create a Scene and display it
        Scene scene = new Scene(gridPane, 300, 300);
        primaryStage.setTitle("Display Images");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}