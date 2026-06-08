package hust.soict.dsai.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private ToggleGroup identical;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        RadioButton selectedTool = (RadioButton) identical.getSelectedToggle();
        Circle newCircle;
        if (selectedTool.getText().equals("Pen")) {
            newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
        } else {
            newCircle = new Circle(event.getX(), event.getY(), 20, Color.WHITE);
        }
        drawingAreaPane.getChildren().add(newCircle);
    }
}
