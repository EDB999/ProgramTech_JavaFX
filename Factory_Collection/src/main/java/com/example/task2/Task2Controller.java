package com.example.task2;

import FWork.ControlFileShapes;
import FWork.ShapeStructure;
import Factory.FactoryShape;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.Shape;
import javafx.fxml.Initializable;

import java.io.File;
import java.io.FileNotFoundException;
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

    private ShapeStructure shapeStruct;

    private ControlFileShapes fileControl;
    @FXML
    public Label Type;


    public void mouseClick(MouseEvent eventMouse){
        double x = eventMouse.getX(); double y = eventMouse.getY();

        figure = factShape.CreateShape(numShape.getText());

        if (figure == null){
            this.displayWarningMessage("Enter next figures: 0-circle, 3-triangle, 4-square");
            return;
        }
        figure.setColor(this.colorPick.getValue());
        figure.getX((int)x);
        figure.getY((int)y);
        shapeStruct.appendShape(figure);
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
        fileControl = new ControlFileShapes();
        shapeStruct = new ShapeStructure();

        this.gc.setFill(Color.LIGHTGRAY);
        this.gc.fillRect(0 , 0, canv.getWidth(), canv.getHeight());

    }

    public void setShapes () {
        this.gc.setFill(Color.LIGHTGRAY);
        this.gc.fillRect(0, 0, canv.getWidth(), canv.getHeight());
        for (var item: shapeStruct.getStack()){
            item.draw(gc);
        }
    }

    public void clickRollbackFigure(ActionEvent actionEvent) {
        shapeStruct.clearShape();
        setShapes();
    }


    public void clickSaveFileMemory(ActionEvent actionEvent) throws FileNotFoundException {
    fileControl.saveFileMemory(shapeStruct.getStack());
    }

    public void clickOpenFileMemory(ActionEvent actionEvent) {
        FileChooser fc = new FileChooser();
        FileChooser.ExtensionFilter eF = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");

        fc.getExtensionFilters().add(eF);
        fc.setInitialDirectory(new File(System.getProperty("user.home")));
        File file = fc.showOpenDialog(new Stage());

        if (file == null) return;

        shapeStruct.setStack(fileControl.openFileMemory(file));

        setShapes();
    }
}