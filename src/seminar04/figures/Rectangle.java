package seminar04.figures;

import seminar04.libraly.IShape;

/**
 * класс для работы с прямоугольником
 */
public class Rectangle implements IShape {

    /**
     * ширина прямоугольника
     */
    private double width;

    /**
     * высота прямоугольника
     */
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
