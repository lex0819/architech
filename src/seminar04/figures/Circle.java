package seminar04.figures;

import seminar04.libraly.IShape;

/**
 * класс круг
 * описывает круг с данным радиусом
 */
public class Circle implements IShape {
    /**
     * радиус круга
     */
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
