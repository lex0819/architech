package seminar01.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PolygonalModel {

    public List<Polygon> polygons = new ArrayList<>();
     public Texture texture;

    public PolygonalModel(List<Polygon> polygonsList, Texture textureFile) {
        polygons.addAll(polygonsList);
        texture = textureFile;
    }

    public List<Polygon> getPolygon() {
        return polygons;
    }

    public Texture getTexture() {
        return texture;
    }
}
