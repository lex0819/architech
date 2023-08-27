package seminar01.InMemoryModel;

import seminar01.ModelElements.*;
import seminar01.ModelElements.Polygon;

import java.awt.*;
import java.util.List;


public class ModelStore implements IModelChanger{
    public PolygonalModel models;
    public Scene scenes;

    public Flash flashes;
    public Camera cameras;
    private IModelChangeObserver changeObserver;

    public ModelStore(IModelChangeObserver changeObserver, List<Point3D> pointsList, String textureFile, int camX, int camY, int camZ, int camAngleX, int camAngleZ, int flashX, int flashY, int flashZ, int flashAngleX, int flashAngleZ, float flashPower, int flashR, int flashG, int flashB) {
        this.changeObserver = changeObserver;
        this.models = new PolygonalModel((List<Polygon>) new Polygon(pointsList), new Texture(textureFile));
        this.cameras = new Camera(camX, camY, camZ, camAngleX, camAngleZ);
        this.flashes = new Flash(flashX, flashY, flashZ, flashAngleX, flashAngleZ, flashPower, flashR, flashG, flashB);
        this.scenes = new Scene(this.models, this.flashes, this.cameras);
    }

    public Scene getScenes(int n) {
        return scenes;
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
