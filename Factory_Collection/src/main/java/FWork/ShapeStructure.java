package FWork;

import model.Shape;
import FWork.IShapeStructure;

import java.util.Stack;

public class ShapeStructure implements IShapeStructure {

    private Stack<Shape> figures;

    public ShapeStructure() {figures = new Stack<>();}
    @Override
    public void appendShape(Shape figure) {
        figures.push(figure);
    }

    @Override
    public void setStack(Stack<Shape> stack) {
        figures = stack;
    }

    @Override
    public void clearShape() {
        if (figures.empty()) return;
        figures.pop();
    }

    @Override
    public Stack<Shape> getStack() {return this.figures;}
}
