package seminar01.ModelElements;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс описывает трехмерную фигуру с вершинами!
 * состоящую из нескольких двумерных фигур типа Polygon
 * покрытую текстурой типа Texture
 * пока нет проверки на геометрическую правильность
 * пока допускаю, что все двумерные полигоны между собой стыкуются хорошо
 * и образуют нормальный трехмерный объект
 */
public class PolygonalModel {

    public List<Polygon> polygons = new ArrayList<>();
    public Texture texture;

    public PolygonalModel(List<Polygon> polygonsList, Texture textureFile) {
        polygons.addAll(polygonsList);
        texture = textureFile;
    }

    public List<Polygon> getPolygons() {
        return polygons;
    }

    public Texture getTexture() {
        return texture;
    }

    /**
     * @return список всех вершин трехмерной фигуры
     * координаты вершины - это объект класса Point3D
     */
    public List<Point3D> getAllPoints(){
        List<Point3D> allPoints = new ArrayList<>();
        for (Polygon polygon: polygons){
            allPoints.addAll(polygon.getPoints());
        }
        return allPoints;
    }
}
