package model;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class ChrisrmasTreeImpl implements ChristmasTree {
    public void draw(Pane paneTree){
        Polygon tree = new Polygon();
        tree.setFill(Color.GREEN);
        tree.getPoints().addAll(new Double[] {239.0,93.0,120.0,360.0,359.0,360.0});
        paneTree.getChildren().addAll(tree);

        Rectangle base = new Rectangle();
        base.setX(210);
        base.setY(361);
        base.setWidth(58);
        base.setHeight(60);
        base.setFill(Color.rgb(93, 30,15));
        paneTree.getChildren().addAll(base);
    }
}

