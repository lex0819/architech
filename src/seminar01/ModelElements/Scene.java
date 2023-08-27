package seminar01.ModelElements;

import java.lang.reflect.Type;

public class Scene {
    public static int id = 0;
    public PolygonalModel models;
    public Flash flashes;
    public Camera cameras;

    public Scene( PolygonalModel models, Flash flashes, Camera cameras) {
        id = id++;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public static int getId() {
        return id;
    }

    public PolygonalModel getModels() {
        return models;
    }

    public Flash getFlashes() {
        return flashes;
    }

    public Camera getCameras() {
        return cameras;
    }

    Type method1(Type type){
        return type;
    }
    Type method2(Type type1, Type type2){
        return type2;
    }
}
