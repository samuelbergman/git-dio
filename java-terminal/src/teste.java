import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class teste extends Application {
    private double x = 400;
    private double y = 300;
    private double angle = Math.PI / 2;

    @Override
    public void start(Stage primaryStage) {
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        new AnimationTimer() {
            private long lastUpdate = 0 ;
            @Override
            public void handle(long now) {
                if (now - lastUpdate >= 33_000_000) {
                    double newX = x + Math.cos(angle) * 10;
                    double newY = y - Math.sin(angle) * 10;

                    gc.setStroke(Color.BLACK);
                    gc.strokeLine(x, y, newX, newY);

                    x = newX;
                    y = newY;

                    Random random = new Random();
                    angle += random.nextGaussian() * 0.5;

                    lastUpdate = now;
                }
            }
        }.start();

        primaryStage.setScene(new Scene(new Pane(canvas)));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}