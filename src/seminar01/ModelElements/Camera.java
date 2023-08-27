package seminar01.ModelElements;

public class Camera {
    public Point3D location;
    public Angle3D angle3d;

    public Camera(int x, int y, int z, int angleX, int angleZ) {
        this.location = new Point3D(x,y,z);
        this.angle3d = new Angle3D(angleX, angleZ);
    }

    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle3d;
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
