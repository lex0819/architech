package seminar01.ModelElements;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для создания двумерной фигуры по точкам координат
 * возвращает список точек с координатами
 * пока нет проверки на геометрическую целостность, правильность и логику получившейся фигуры
 * пока просто список точек с координатами вершин фигуры
 * пока допущение - все вершины заданы верно и фигура нормальная
 */
public class Polygon {
    public List<Point3D> points = new ArrayList<>();

    public Polygon(List<Point3D> pointList) {
        points.addAll(pointList);
    }

    public List<Point3D> getPoints() {
        return points;
    }
}
