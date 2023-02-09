package model;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Present extends TreeDecorator {
    public Present (ChristmasTree tree) {
        super (tree);
    }
    public void draw (Pane pane) {
        super.draw(pane);
        drawWithPresent (pane);
    }
    private void drawWithPresent (Pane pane) {
        Rectangle present1 = new Rectangle();
        present1. setX(115);
        present1. setY (370);
        present1. setWidth(70);
        present1. setHeight (50);
        present1. setArcWidth(20);
        present1. setArcHeight (20);
        present1. setFill (Color. DEEPPINK);
        Rectangle present2 = new Rectangle();
        present2. setX(270);
        present2. setY (400);
        present2. setWidth(40);
        present2. setHeight (20);
        present2. setFill (Color. DARKGREY);
        Rectangle present3 = new Rectangle();
        present3. setX(320);
        present2. setY (369);
        present2. setWidth(30);
        present2. setHeight (50);
        present2. setFill (Color. OLIVE);

        pane. getChildren(). addAll (present1, present2, present3);
    }
}

