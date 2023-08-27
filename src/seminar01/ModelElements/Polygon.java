package seminar01.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Polygon {
    public List<Point3D> points = new ArrayList<>();

    public Polygon(List<Point3D> pointList) {
        points.addAll(pointList);
    }

    public List<Point3D> getPoints() {
        return points;
    }
}
