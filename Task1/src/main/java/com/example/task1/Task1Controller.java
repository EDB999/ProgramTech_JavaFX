package com.example.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import model.Rectangle;
import model.RoundRectangle;
import model.Shape_2;


public class Task1Controller {
    @FXML
    public Canvas canv;
    @FXML
    public ColorPicker colorPick;
    public ColorPicker colorPick2;
    @FXML
    public TextField sizeWidth;
    public TextField sizeWidth2;
    @FXML
    public TextField sizeLength;
    public TextField sizeLength2;

    private Shape_2 figure;
    @FXML
    public Label Type;

    public Label Type2;

    @FXML
    public void buttonLeftAction(ActionEvent actionEvent)
    {
        if (sizeWidth.getText().isEmpty() || sizeLength.getText().isEmpty())
            displayWarningMessage("Enter the height and width of the rectangle");
        else {
            GraphicsContext graphicsContext = this.canv.getGraphicsContext2D();

            System.out.println(this.colorPick.toString());

            figure = new Rectangle(20, 20, this.colorPick.getValue(),
                    Double.parseDouble(this.sizeWidth.getText()), Double.parseDouble(this.sizeLength.getText()));


            figure.draw(graphicsContext);

            System.out.println(figure.toString());
        }
    }

    public void ButtonRightAction(ActionEvent actionEvent)
    {
        if (sizeWidth2.getText().isEmpty() || sizeLength2.getText().isEmpty())
            displayWarningMessage("Enter the height and width of the round rectangle");
        else
        {
            GraphicsContext graphicsContext = this.canv.getGraphicsContext2D();

            System.out.println(this.colorPick2.toString());

            figure = new RoundRectangle(20, 20, this.colorPick2.getValue(),
                    Double.parseDouble(this.sizeWidth2.getText()), Double.parseDouble(this.sizeLength2.getText()), 10);


            figure.draw(graphicsContext);

            System.out.println(figure.toString());
        }
    }



    public void MouseClick(MouseEvent mouseEvent){
        GraphicsContext graphicsContext = this.canv.getGraphicsContext2D();
        double x = mouseEvent.getX();
        double y = mouseEvent.getY();
        System.out.println("Was pressed:" + mouseEvent.getButton());
        MouseButton key = mouseEvent.getButton();
        if (key == MouseButton.PRIMARY){
            figure = new Rectangle((int)x, (int)y,this.colorPick.getValue(),
                    Double.parseDouble(this.sizeWidth.getText()), Double.parseDouble(this.sizeLength.getText()));
            Type.setText("" + figure);
            figure.draw(graphicsContext);
        }
        else
        {
            figure = new RoundRectangle((int)x, (int)y,this.colorPick2.getValue(),
                    Double.parseDouble(this.sizeWidth2.getText()), Double.parseDouble(this.sizeLength2.getText()), 10);
            Type2.setText("" + figure);
            figure.draw(graphicsContext);
        }
    }

    private void displayWarningMessage(String error) {
        var alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Message");
        alert.setHeaderText("Error");
        alert.setContentText(error);
        alert.showAndWait();
    }
}