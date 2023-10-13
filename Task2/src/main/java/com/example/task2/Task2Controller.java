package com.example.task2;

import Factory.FactoryShape;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import model.Shape;
import javafx.fxml.Initializable;

import java.util.ResourceBundle;
import java.net.URL;

public class Task2Controller implements Initializable{
    @FXML
    public Canvas canv;
    @FXML
    public ColorPicker colorPick;
    @FXML
    public TextField numShape;
    @FXML
    public TextField sizeShape;

    public FactoryShape factShape;
    private Shape figure;

    private GraphicsContext gc;
    @FXML
    public Label Type;

    private static void eventHandler(Task2Controller controllerT2)
    {
        controllerT2.canv.setOnMouseClicked(controllerT2::eventHandlerClick);
    }
    private void eventHandlerClick(MouseEvent eventMouse){
        double x = eventMouse.getX(); double y = eventMouse.getY();
        figure = factShape.CreateShape(numShape.getText());

        if (figure == null){
            this.displayWarningMessage("Enter next figures: 0-circle, 3-triangle, 4-square");
            return;
        }
        figure.setColor(this.colorPick.getValue());
        figure.getX((int)x);
        figure.getY((int)y);
        figure.draw(gc);
    }



    private void displayWarningMessage(String error) {
        var alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Message");
        alert.setHeaderText("Error");
        alert.setContentText(error);
        alert.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        gc = this.canv.getGraphicsContext2D();
        factShape = new FactoryShape();
        Task2Controller.eventHandler(this);
    }

}