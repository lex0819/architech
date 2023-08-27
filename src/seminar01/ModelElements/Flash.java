package seminar01.ModelElements;

import java.awt.*;

public class Flash {
    public Point3D location;
    public Angle3D angle3d;

    public float power; // from 0% to 100%

    public Color color;
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
