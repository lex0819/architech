package seminar04;


import seminar04.figures.Circle;
import seminar04.figures.Rectangle;
import seminar04.figures.Triangle;

/**
 * Точка входа
 * Главная программа
 */
public class Main {
    public static void main(String[] args) {
        GeometryFigures figureBox = new GeometryFigures();

        Circle circle1 = new Circle(10);
        figureBox.add(circle1);
        figureBox.getInfo(0);

        Rectangle rectangle1 = new Rectangle(13, 7);
        figureBox.add(rectangle1);
        figureBox.getInfo(1);

        Triangle triangle1 = new Triangle(12, 8, 7);
        figureBox.add(triangle1);
        figureBox.getInfo(2);
    }
}
