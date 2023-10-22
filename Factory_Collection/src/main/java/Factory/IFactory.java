package Factory;

import javafx.scene.paint.Color;
import model.Shape;

public interface IFactory {
    Shape CreateShape(String figure);

    Shape initShapePositions(double x, double y, Color color, String form);
}


