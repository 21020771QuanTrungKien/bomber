package uet.oop.bomberman.entities.character;

import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Bomber extends Animal {

    public Bomber(int x, int y, Image img) {
        super( x, y, img);
    }

    @Override
    public void update() {

    }
}
