package seminar01.ModelElements;

import java.awt.*;

/**
 * Класс для работы с источником света
 * у источника света есть координаты в пространстве типа Point3D
 * и угол типа Angle3D
 * как у камеры
 * кроме того еще есть
 * сила света от 0 до 100 процентов, где 0 - выключен
 * и цвет света, объект типа Color из стандартной библиотеки JAVA
 */
public class Flash {
    public Point3D location;
    public Angle3D angle3d;

    public float power; // from 0% to 100%

    public Color color;

    /**
     * @param x координата камеры в пространстве
     * @param y координата камеры в пространстве
     * @param z координата камеры в пространстве
     * @param angleX угол поворота камеры вверх-вниз
     * @param angleZ угол поворота камеры вправо-влево
     * @param pow сила света от 0 до 100
     * @param r координаты цвета в системе RGB
     * @param g координаты цвета в системе RGB
     * @param b координаты цвета в системе RGB
     * для простоты в конструктор приходят сырые данные,
     * а не объекты
     */
    public Flash(int x, int y, int z, int angleX, int angleZ, float pow, int r, int g, int b) {
        this.location = new Point3D(x,y,z);
        this.angle3d = new Angle3D(angleX, angleZ);
        this.color = new Color(r,g,b);
        if (pow < 0){ this.power = 0;}
            else if (pow > 100){ this.power = 100;}
                else {this.power = pow;}
    }

    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle3d;
    }

    public float getPower() {
        return power;
    }

    public Color getColor() {
        return color;
    }

    void rotate(int angleX, int angleZ){
        Angle3D newAngle = new Angle3D(angleX, angleZ);
        this.angle3d.getAngle3D()[0] = newAngle.getAngle3D()[0];
        this.angle3d.getAngle3D()[1] = newAngle.getAngle3D()[1];
    }

    void move(int x, int y, int z){
        Point3D newPoint = new Point3D(x,y,z);
        this.location.getPoint3d()[0] = newPoint.getPoint3d()[0];
        this.location.getPoint3d()[1] = newPoint.getPoint3d()[1];
        this.location.getPoint3d()[2] = newPoint.getPoint3d()[2];
    }
}
