package com.example.task8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import model.*;

public class HelloController {
    public Pane pane;
    public Pane paneLight;
   // public Pane paneTree;
    public Pane paneStar;
    public Pane panePresent;

    @FXML
    public void initialize() {
        pane. toFront();
        ChristmasTree tree = new ChrisrmasTreeImpl();
        tree.draw(pane);
    }
    public void addLights (ActionEvent actionEvent) {
        pane.toFront();
        ChristmasTree tree = new Girland(new ChrisrmasTreeImpl());
        tree.draw(pane);
    }
    public void addStar (ActionEvent actionEvent) {
        pane.toFront();
        ChristmasTree tree = new Star(new ChrisrmasTreeImpl());
        tree.draw(pane);
    }
    public void addPresent (ActionEvent actionEvent) {
        pane.toFront();
        ChristmasTree tree = new Present(new ChrisrmasTreeImpl());
        tree.draw(pane);
    }

    public void addAll(ActionEvent actionEvent) {
        pane.toFront();
        ChristmasTree tree = new Present(new Star(new Girland(new ChrisrmasTreeImpl())));
        tree.draw(pane);
    }

    public void delete(ActionEvent actionEvent) {
        pane.toFront();
        pane.getChildren().clear();
        ChristmasTree tree = new ChrisrmasTreeImpl();
        tree.draw(pane);
    }

    public void addSG(ActionEvent actionEvent) {
        pane.toFront();
        ChristmasTree tree = new Star(new Girland(new ChrisrmasTreeImpl()));
        tree.draw(pane);

    }
}