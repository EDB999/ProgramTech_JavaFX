package com.example.task0;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.text.Font;

public class Task0Controller {
    @FXML
    private TextField txtField;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;

    @FXML
    private Label label4;
    private Percent percent = new Percent();
    @FXML
    protected void FifteenPercentClick() {
        float sum;
        try
        {
            sum = Float.parseFloat(txtField.getText());
            float pr = 15;
            percent.setSum(sum);
            float tips = percent.countPr(15);
            float result =  percent.countSum(sum,pr );
            float ResultRound = percent.countSumrnd(15);
            label1.setFont(new Font("Times New Roman", 14));
            label1.setText("Итог: " + result+" р." +"\nЧаевые: " +tips +" р." +"\nОплата: " +ResultRound+ " р." );
        }
        catch(Exception e)
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ошибка!");
            alert.setHeaderText("Что-то пошло не так...");
            alert.setContentText("Введено некорректное значение. Введите значение в соотвествии с условием задания.");
            alert.show();
        }
    }
    @FXML
    protected void TenPercentClick() {
        float sum;
        try
        {
            sum = Float.parseFloat(txtField.getText());
            float pr = 10;
            percent.setSum(sum);
            float tips = percent.countPr(15);
            float result =  percent.countSum(sum,pr );
            float ResultRound = percent.countSumrnd(15);
            label2.setFont(new Font("Times New Roman", 14));
            label2.setText("Итог: " + result+" р." +"\nЧаевые: " +tips +" р." +"\nОплата: " +ResultRound+ " р." );
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ошибка!");
            alert.setHeaderText("Что-то пошло не так...");
            alert.setContentText("Введено некорректное значение. Введите значение в соотвествии с условием задания.");
            alert.show();
        }
    }
    @FXML
    protected void NinePercentClick() {
        float sum;
        try {
            sum = Float.parseFloat(txtField.getText());
            float pr = 9;
            percent.setSum(sum);
            float tips = percent.countPr(15);
            float result =  percent.countSum(sum,pr );
            float ResultRound = percent.countSumrnd(15);
            label3.setFont(new Font("Times New Roman", 14));
            label3.setText("Итог: " + result+" р." +"\nЧаевые: " +tips +" р." +"\nОплата: " +ResultRound+ " р." );
        } catch (Exception e)
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ошибка!");
            alert.setHeaderText("Что-то пошло не так...");
            alert.setContentText("Введено некорректное значение. Введите значение в соотвествии с условием задания.");
            alert.show();
        }
    }

    @FXML
    protected void ThreePercentClick() {
        float sum;
        try {
            sum = Float.parseFloat(txtField.getText());
            float pr = 3;
            percent.setSum(sum);
            float tips = percent.countPr(15);
            float result =  percent.countSum(sum,pr );
            float ResultRound = percent.countSumrnd(15);
            label4.setFont(new Font("Times New Roman", 14));
            label4.setText("Итог: " + result+" р." +"\nЧаевые: " +tips +" р." +"\nОплата: " +ResultRound+ " р." );
        } catch (Exception e)
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ошибка!");
            alert.setHeaderText("Что-то пошло не так...");
            alert.setContentText("Введено некорректное значение. Введите значение в соотвествии с условием задания.");
            alert.show();
        }
    }
}