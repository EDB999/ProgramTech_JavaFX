package Factory;

import javafx.scene.paint.Color;
import model.Square;
import model.Circle;
import model.Shape;
import model.Triangle;

public class FactoryShape implements IFactory {

    @Override
    public Shape CreateShape(String figure) {
        if (figure.equals("0-круг")) {
            return new Circle();
        } else if (figure.equals("3-треугольник")) {
            return new Triangle();
        } else if (figure.equals("4-квадрат")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Shape initShapePositions(double x, double y, Color color, String form) {
        return switch (form) {
            case "Круг" -> new Circle(x,y,color);
            case "Треугольник" -> new Triangle(x,y,color);
            case "Квадрат" -> new Square(x,y,color);
            default -> null;
        };
    }
}
