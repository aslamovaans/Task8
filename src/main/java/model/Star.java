package model;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Star extends TreeDecorator{
    public Star (ChristmasTree tree) {
        super(tree);
    }
    public void draw(Pane pane) {
        super.draw (pane);
        drawStar (pane);
    }
    private void drawStar (Pane pane) {
        Path star = new Path();
        star.getElements().addAll(new MoveTo(239,49),
                new LineTo(217, 102),
                new LineTo(239, 91),
                new LineTo(262, 102),
                new ClosePath(),
                new MoveTo(207, 68),
                new LineTo(270, 68),
                new LineTo(239, 91),
                new ClosePath());

        star.setFill(Color. YELLOW);
        star.setFillRule (FillRule. EVEN_ODD);
        pane.getChildren().addAll(star);
    }
}