package FWork;

import Factory.FactoryShape;
import javafx.scene.paint.Color;
import model.Shape;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Stack;

public class ControlFileShapes implements IControlFile<Shape>{
    @Override
    public Stack<Shape> openFileMemory(File file) {
        try (FileInputStream fis = new FileInputStream(file);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8)) {

            Stack<Shape> shapes = new Stack<Shape>();
            ArrayList<String> items = new ArrayList<>();
            StringBuilder lines = new StringBuilder();

            int counter;

            while ((counter = isr.read()) != -1){
                if ((char)counter == '\n'){
                    items.add(lines.toString());
                    lines = new StringBuilder();
                }
                else lines.append((char) counter);
            }

            for (var item: items) {
                shapes.push(this.shapeToText(item));
            }
            return shapes;
        }
        catch (Exception exception) {
            System.out.println(exception.toString());
        }
        return null;
    }

    @Override
    public void saveFileMemory(Stack<Shape> stack) throws FileNotFoundException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("Shapes_state" + LocalDate.now().toString() + ".txt");
             PrintStream ps = new PrintStream(fileOutputStream)){
            for (var item: stack) {
                ps.println(item.toString());
            }
        }
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private Shape shapeToText(String text){
        var args = text.split(" ");
        return new FactoryShape().initShapePositions(Double.parseDouble(args[1]),Double.parseDouble(args[2]),
                Color.valueOf(args[3].replace('\r',' ').trim()), args[0]);
    }
}
